/**
 * 
 */
package com.solarvillage.rhpam.poc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author mugdha
 *
 */
public class NewOrder {
	private int orderID;
	private Customer customerInfo;
	private Address hoaAddress;
	private ProjectPermit electricalPermit; 
	private ProjectPermit structuralPermit;
	private String orderStatus;
	private String additionalInfo;
	private List<OrderHistory> orderProgres;
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Customer getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(Customer customerInfo) {
		this.customerInfo = customerInfo;
	}
	public Address getHoaAddress() {
		return hoaAddress;
	}
	public void setHoaAddress(Address hoaAddress) {
		this.hoaAddress = hoaAddress;
	}
	public ProjectPermit getElectricalPermit() {
		return electricalPermit;
	}
	public void setElectricalPermit(ProjectPermit electricalPermit) {
		this.electricalPermit = electricalPermit;
	}
	public ProjectPermit getStructuralPermit() {
		return structuralPermit;
	}
	public void setStructuralPermit(ProjectPermit structuralPermit) {
		this.structuralPermit = structuralPermit;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public List<OrderHistory> getOrderProgres() {
		return orderProgres;
	}
	public void setOrderProgres(List<OrderHistory> orderProgres) {
		this.orderProgres = orderProgres;
	}
	@Override
	public String toString() {
		return "NewOrder [orderID=" + orderID + ", customerInfo=" + customerInfo + ", hoaAddress=" + hoaAddress
				+ ", electricalPermit=" + electricalPermit + ", structuralPermit=" + structuralPermit + ", orderStatus="
				+ orderStatus + ", additionalInfo=" + additionalInfo + ", orderProgres=" + orderProgres + "]";
	}
	public NewOrder(int orderID, Customer customerInfo, Address hoaAddress, ProjectPermit electricalPermit,
			ProjectPermit structuralPermit, String orderStatus, String additionalInfo, List<OrderHistory> orderProgres) {
		super();
		this.orderID = orderID;
		this.customerInfo = customerInfo;
		this.hoaAddress = hoaAddress;
		this.electricalPermit = electricalPermit;
		this.structuralPermit = structuralPermit;
		this.orderStatus = orderStatus;
		this.additionalInfo = additionalInfo;
		this.orderProgres = orderProgres;
	}
	public NewOrder() {
		super();
		this.orderProgres = new ArrayList<OrderHistory>();
		this.customerInfo =  new Customer();
		this.hoaAddress =  new Address();
		this.electricalPermit =  new ProjectPermit();
		this.structuralPermit =  new ProjectPermit();
	}
	
public void addProgress(Date date, String notes,String notesBy) {
	this.getOrderProgres().add(new OrderHistory(date, notes, notesBy));
}
	
}
