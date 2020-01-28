package com.flares.countryInfo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flares.countryInfo.repo.CountryLanguageRepository;

@Component
public class CountryLanguageDao {
	
	@Autowired
	CountryLanguageRepository countryLanguageRepository;
	
}
