package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Database {

	private Map<Integer,Integer> inventory = new HashMap<>();
	
	private Set<Product> products = new HashSet<>();
	
	private List<Order> orders = new ArrayList<>();
	
	public void addProduct(Product p, int quantity)
	{
		int productId = p.getId();
		
		if(inventory.containsKey(productId))
			inventory.put(productId,inventory.get(productId)+quantity);
		else
		{
			inventory.put(productId, quantity);
			
			
		}
			
		//System.out.println("prodcut added");
		products.add(p);
		//System.out.println(products);
		
	}
	
	public void removeProduct(Product p,int quantity)
	{
		int productId = p.getId();
		
		if(inventory.containsKey(productId))
			inventory.put(productId,inventory.get(productId)-quantity);
		
		if(inventory.get(productId)==0)
			products.remove(p);
		
	}
	
	public int getProductQuantity(Product product)
	{
		if(inventory.containsKey(product.getId()))
			return inventory.get(product.getId());
		
		return 0;
	}
	
	public Map<Integer, Integer> getInventory() {
		return inventory;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order)
	{
		orders.add(order);
	}
	
	
	
}
