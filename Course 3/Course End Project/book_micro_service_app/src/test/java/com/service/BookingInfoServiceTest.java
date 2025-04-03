package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bean.BookingInfo;

@SpringBootTest
class BookingInfoServiceTest {

	@Autowired
	BookingInfoService bookingInfoService;
	
	@Test
	void testBookCab() {
		BookingInfo bookingInfo = new BookingInfo();
		bookingInfo.setCustomerName("May");
		bookingInfo.setSource("Home");
		bookingInfo.setDestination("Work");
		bookingInfo.setCabType("Luxury");
		String result = bookingInfoService.bookCab(bookingInfo);
		assertEquals("Cab Booked Successfully: Luxury | Fare: $15.0", result);
	}

}
