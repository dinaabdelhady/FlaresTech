package com.flares.countryInfo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flares.countryInfo.model.Country;
import com.flares.countryInfo.repo.CountryRepository;

@Component
public class CountryDao {
	
	@Autowired
	CountryRepository countryRepository;
	
	public Country getCountryByCode(String countryCode) {
//		Country county = new Country();
//		county.setCapital(1);
//		county.setName("Egypt");
//		county.setPopulation(90000);
//		county.setRegion("NorthAfrice");
//		county.setCode("EGY");
//		return county;
		return countryRepository.findByCode(countryCode);
	}
}
