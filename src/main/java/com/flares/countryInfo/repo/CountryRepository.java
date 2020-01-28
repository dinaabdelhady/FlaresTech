package com.flares.countryInfo.repo;

import org.springframework.data.repository.CrudRepository;

import com.flares.countryInfo.model.Country;

public interface CountryRepository  extends CrudRepository<Country, Integer>{

	Country findByCode(String countryCode);

}
