package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.CabFare;
import com.repository.CabFareRepository;

@Service
public class CabFareService {

	@Autowired
	CabFareRepository cabFareRepository;
	
	public String storeCabFareInfo(CabFare cb) {
		try {
		cabFareRepository.findSourceAndDestination(cb.getSource(), cb.getDestination());
		return "Information Already Present";
		} catch(Exception e) {
			System.err.println(e);
			cabFareRepository.save(cb);
			return "Cab Fare Information Stored";
		}	
	}
	
	public float findFare(String source, String destination) {
		try {
			return cabFareRepository.findFare(source, destination);
		} catch (Exception e) {
			System.err.println(e);
			return -1;
		}
	}
}
