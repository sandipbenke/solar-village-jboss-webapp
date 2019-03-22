package com.solarvillage.rhpam.poc;

import java.util.Date;

public class OrderHistory {
	private java.util.Date date;
	private String notes;
	private String notesBy;
	
	
	
	public OrderHistory(Date date, String notes, String notesBy) {
		super();
		this.date = date;
		this.notes = notes;
		this.notesBy = notesBy;
	}
	@Override
	public String toString() {
		return "OrderHistory [date=" + date + ", notes=" + notes + ", notesBy=" + notesBy + "]";
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getNotesBy() {
		return notesBy;
	}
	public void setNotesBy(String notesBy) {
		this.notesBy = notesBy;
	}
}
