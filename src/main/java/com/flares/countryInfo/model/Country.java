package com.flares.countryInfo.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="country")
public class Country {
	


	
	@Id
	@JsonIgnore
	@Column(name="code")
	String code;
	
	@Column(name="name")
    String name;
	
	@Column(name="continent")
    String continent;
	
	@Column(name="region")
	@JsonIgnore
    String region;
	
	@Column(name="surface_area")
	@JsonIgnore
    BigDecimal surface_area;
	
	@Column(name="indep_year")
	@JsonIgnore
    int indep_year;
	
	@Column(name="population")
    int population;
	
	@Column(name="life_expectancy")
    BigDecimal life_expectancy;
	
	@Column(name="gnp")
	@JsonIgnore
    BigDecimal gnp;
	
	@JsonIgnore
	@Column(name="gnp_old")
    BigDecimal gnp_old;
	
	@JsonIgnore
	@Column(name="local_name")
    String local_name;
	
	@JsonIgnore
	@Column(name="government_form")
    String government_form;
	
	@JsonIgnore
	@Column(name="head_of_state")
    String head_of_state;
	
	@JsonIgnore
	@Column(name="capital")
    int capital;
	

	@Column(name="code2")
    String code2;
	
	@OneToMany
	@JoinColumn(name="country_code",referencedColumnName = "code")
	private List<CountryLanguage> countryLanguage; 

	
	public List<CountryLanguage> getCountryLanguage() {
		return countryLanguage;
	}

	public void setCountryLanguage(List<CountryLanguage> countryLanguage) {
		this.countryLanguage = countryLanguage;
	}


	public Country() {
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public BigDecimal getSurface_area() {
		return surface_area;
	}

	public void setSurface_area(BigDecimal surface_area) {
		this.surface_area = surface_area;
	}

	public int getIndep_year() {
		return indep_year;
	}

	public void setIndep_year(int indep_year) {
		this.indep_year = indep_year;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public BigDecimal getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(BigDecimal life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public BigDecimal getGnp() {
		return gnp;
	}

	public void setGnp(BigDecimal gnp) {
		this.gnp = gnp;
	}

	public BigDecimal getGnp_old() {
		return gnp_old;
	}

	public void setGnp_old(BigDecimal gnp_old) {
		this.gnp_old = gnp_old;
	}

	public String getLocal_name() {
		return local_name;
	}

	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}

	public String getGovernment_form() {
		return government_form;
	}

	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}

	public String getHead_of_state() {
		return head_of_state;
	}

	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	@JsonIgnore
	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}
	
	
}
