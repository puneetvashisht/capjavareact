package practice;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderService {

	static final Integer SALESTAX = 10;
	static final Integer VAT = 10;
	
	private static Database db = new Database();
	
	public void execute(List<Order> orders) throws Exception
	{
		Collections.sort(orders, (o1,o2)-> o1.getOrderDate().compareTo(o2.getOrderDate()));
		
		for(Order order : orders) {
			
			handleOrder(order);
			
			db.addOrder(order);
			
		}
	
	}
	
	private static void handleOrder(Order order) throws Exception
	{
		Product product = order.getProduct();
		
		
		
		if(product instanceof Consumable && ((Consumable) product).getExpiryDate().isBefore(order.getOrderDate()))
		{
				throw new Exception(product + " is expired...");		
		}
		
		if(order.getType().equals("Sales"))
		{
			if(order.getQuantity()>db.getProductQuantity(product))
				throw new Exception(product + " is not available...");
			
			double price = product.getPrice() * order.getQuantity();
			double finalPrice = price * ( 1 + (SALESTAX/100));
			
			order.setFinalPrice(finalPrice);
			
			db.removeProduct(product,order.getQuantity());
			
		}
		else if(order.getType().equals("Purchase"))
		{
			double price = product.getPrice() * order.getQuantity();
			double finalPrice = price * ( 1 + (VAT/100));
			
			order.setFinalPrice(finalPrice);
			
			db.addProduct(product,order.getQuantity());
		}
		else
			throw new Exception("Invalid order type");
		
		
	}
	
	public List<Order> getAllOrders()
	{
		return db.getOrders();
	}
	
	public Set<Product> getAllProducts()
	{
		return db.getProducts();
	}
	
	public Map<Integer,Integer> getInventory()
	{
		return db.getInventory();
	}
	
}
