package practice;

import java.time.LocalDate;

public class Order {

	private Integer quantity;
	private Product product;
	private LocalDate orderDate;
	private String type;
	private Double finalPrice;
	
	public Order() {
		super();
	}

	public Order(Integer quantity, Product product, LocalDate orderDate, String type) {
		super();
		this.quantity = quantity;
		this.product = product;
		this.orderDate = orderDate;
		this.type = type;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", product=" + product + ", orderDate=" + orderDate + ", type=" + type
				+ ", finalPrice=" + finalPrice + "]";
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	
	
	
	
	
}
