/**
 * 
 */
package com.solarvillage.rhpam.poc;

import java.util.Date;

/**
 * @author mugdha
 *
 */
public class ProjectPermit {

	private String permitType;
	private Date requestedDate;
	private String status;
	private Date lastUpdateDate;	
	private String notes;
	
	public ProjectPermit(String permitType, Date requestedDate, String status, Date lastUpdateDate, String notes) {
		super();
		this.permitType = permitType;
		this.requestedDate = requestedDate;
		this.status = status;
		this.lastUpdateDate = lastUpdateDate;
		this.notes = notes;
	}
	
	public ProjectPermit() {
		super();
	}
	@Override
	public String toString() {
		return "ProjectPermit [permitType=" + permitType + ", requestedDate=" + requestedDate + ", status=" + status
				+ ", lastUpdateDate=" + lastUpdateDate + ", notes=" + notes + "]";
	}
	
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPermitType() {
		return permitType;
	}
	
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}
	public Date getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
}
