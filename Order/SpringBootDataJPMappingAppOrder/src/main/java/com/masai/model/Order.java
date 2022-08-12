package com.masai.model;

//import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer OrderId;
	
	private String orderstatus;

	public Order() {
		// TODO Auto-generated constructor stub
	}


public Order(Integer orderId, String orderstatus) {
	super();
	OrderId = orderId;
	this.orderstatus = orderstatus;
}


public Integer getOrderId() {
	return OrderId;
}


public void setOrderId(Integer orderId) {
	OrderId = orderId;
}


public String getOrderstatus() {
	return orderstatus;
}


public void setOrderstatus(String orderstatus) {
	this.orderstatus = orderstatus;
}


@Override
public String toString() {
	return "Order [OrderId=" + OrderId + ", orderstatus=" + orderstatus + "]";
}
	
	

}
