package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.BookingInfo;
import com.repository.BookingInfoRepository;

@Service
public class BookingInfoService {

	@Autowired
	BookingInfoRepository bookingInfoRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String bookCab(BookingInfo bi) {
		
		float fare = restTemplate.getForObject("http://cab-fare-micro-service-app/cabfare/findFare/" + 
		bi.getSource() + "/" + bi.getDestination(), float.class);
		
		if(fare==-1) {
			return "Failed to obtain fare info";
		} else {
			float finalFare;
			
			switch (bi.getCabType()) {
			case "Luxury": 
				finalFare = fare * 1.5f;
				break;
			case "Airport":
				finalFare = fare * 1.3f;
				break;
			case "Compact":
			default:
				finalFare = fare;
				break;
			
				
			}
		bi.setPrice(finalFare);
		bookingInfoRepository.save(bi);
		return "Cab Booked Successfully: " + bi.getCabType() + " | Fare: $" + finalFare;
			
		}
	}
}

	

