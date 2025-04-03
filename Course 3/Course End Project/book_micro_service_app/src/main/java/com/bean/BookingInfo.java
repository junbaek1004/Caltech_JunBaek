package com.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookingInfo")
public class BookingInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingid")   // to avoid_ separated symbol with 2 words
	private int bookingId;
	@Column(name = "customerName")
	private String customerName;
	private String source;
	private String destination;
	private float price;
	private String cabType;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookindId) {
		this.bookingId = bookindId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	@Override
	public String toString() {
		return "BookingInfo [bookingId=" + bookingId + ", customerName=" + customerName + ", source=" + source
				+ ", destination=" + destination + ", price=" + price + ", cabType=" + cabType + "]";
	}
	
	
}
