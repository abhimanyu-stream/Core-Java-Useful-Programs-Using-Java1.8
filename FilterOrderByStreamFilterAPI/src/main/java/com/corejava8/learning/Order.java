package com.corejava8.learning;

import java.util.Objects;

public class Order {
	
	private Long id;
	private String name;
	private Double price;
	private OrderType orderType;
	
	public Order() {}
	public Order(Long id, String name, Double price, OrderType orderType) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.orderType = orderType;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, orderType, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && orderType == other.orderType
				&& Objects.equals(price, other.price);
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", price=" + price + ", orderType=" + orderType + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public OrderType getOrderType() {
		return orderType;
	}
	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}
	
	
	
	
	
	
	

}
