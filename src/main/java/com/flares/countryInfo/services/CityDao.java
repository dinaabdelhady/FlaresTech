package com.flares.countryInfo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flares.countryInfo.repo.CityRepository;

@Component
public class CityDao {
	
	@Autowired
	CityRepository cityRepository;
}
