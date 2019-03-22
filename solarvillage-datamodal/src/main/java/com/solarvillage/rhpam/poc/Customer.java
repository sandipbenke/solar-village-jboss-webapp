/**
 * 
 */
package com.solarvillage.rhpam.poc;

/**
 * @author mugdha
 *
 */
public class Customer {
	private String firstName;
	private String middleName;
	private String lastName;
	private String occupation;
	private Address homeAddress;
	private Address officeAddress;
	private String phoneNumber;
	
	
	public Customer() {
		super();
		this.homeAddress = new Address();
		this.officeAddress = new Address();
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", occupation=" + occupation + ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
