package com.cityguide.guider.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cityguide.guider.entity.Business;

@Service
public class BusinessServiceImpl {

	public List<String> getHotels() {
		List<String> hotels = new ArrayList<String>();
		for (Business.Hotels hotel : Business.Hotels.values()) {
			System.out.println(hotel);
			hotels.add(hotel.toString());
		}
		return hotels;

	}
}
