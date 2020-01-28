package com.flares.countryInfo.repo;

import org.springframework.data.repository.CrudRepository;

import com.flares.countryInfo.model.Country;

public interface CountryLanguageRepository  extends CrudRepository<Country, Integer>{

}
