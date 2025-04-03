package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bean.CabFare;

@SpringBootTest
class CabFareServiceTest {

	@Autowired
	CabFareService cabFareService;
	
	@Test
	@Disabled
	void testStoreCabFareInfo() {
		CabFare cf = new CabFare();
		cf.setSource("Mall");
		cf.setDestination("Park");
		cf.setFare(18);
		String result = cabFareService.storeCabFareInfo(cf);
		assertEquals("Cab Fare Information Stored", result);
		
	}

	@Test
	@Disabled
	void testFindFare() {
		float fare = cabFareService.findFare("Home", "Work");
		assertEquals(15.0, fare,2);
		
		float fare1 = cabFareService.findFare("Home", "Work");
		assertEquals(10.0, fare1,2);

		float fare2 = cabFareService.findFare("Home", "B");
		assertNotEquals(10.0, fare2,2);
	}

}
