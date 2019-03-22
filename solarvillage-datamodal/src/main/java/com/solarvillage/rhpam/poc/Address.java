/**
 * 
 */
package com.solarvillage.rhpam.poc;

/**
 * @author mugdha
 *
 */
public class Address {
	public Address(String attetionTo, String line1, String line2, String city, String state, String zip, String phone,
			String email) {
		super();
		this.attetionTo = attetionTo;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [attetionTo=" + attetionTo + ", line1=" + line1 + ", line2=" + line2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "]";
	}
	public String getAttetionTo() {
		return attetionTo;
	}
	public void setAttetionTo(String attetionTo) {
		this.attetionTo = attetionTo;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String attetionTo;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
}
