package practice;

import java.time.LocalDate;

public class Consumable extends Product {

	enum Type
	{
		BREAD,BUTTER,CAKE,PIZZA,BURGER
	}
	
	private Type type;
	private LocalDate expiryDate;
	
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Consumable() {
		super();
	}

	public Consumable(Integer id, Type type, Double price, LocalDate expiryDate) {
		super(id, price);
		
		this.type = type;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Consumable [type=" + type + ", expiryDate=" + expiryDate + ", getId()=" + getId() + ", getPrice()="
				+ getPrice() + "]";
	}

	
	
	
	
	
}
