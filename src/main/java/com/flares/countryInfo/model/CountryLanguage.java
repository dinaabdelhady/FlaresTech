package com.flares.countryInfo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="country_language")
public class CountryLanguage {
	

	
	@Id
	@Column(name="language")
    String language;
	
	@JsonIgnore
	@Column(name="is_official")
    boolean is_official;

	@JsonIgnore
	@Column(name="percentage")
    BigDecimal percentage;
	
	
	public CountryLanguage() {
		
	}




	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public boolean isIs_official() {
		return is_official;
	}


	public void setIs_official(boolean is_official) {
		this.is_official = is_official;
	}


	public BigDecimal getPercentage() {
		return percentage;
	}


	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}
	
	
}
