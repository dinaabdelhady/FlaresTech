package com.flares.countryInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class CountryApiTest {

	@Autowired
	private MockMvc mvc;


	//Success Scenario test
	@Test
	public void testGetCountry() throws Exception {
	
		RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/BHR")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mvc.perform(requestBuilder).andReturn();

        int status = result.getResponse().getStatus();
        assertEquals(HttpStatus.OK.value(), status);
	}
	
	//INVALID_COUNTRY_CODE
	@Test
	public void testGetCountryInvalid() throws Exception {

		RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/BHRS")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mvc.perform(requestBuilder).andReturn();

        int status = result.getResponse().getStatus();
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR.value(), status);
	}
	
	//INTERNAL_ERROR
//	@Test
//	public void testInternalError() throws Exception {
//
//		RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .get("/BHR")
//                .accept(MediaType.APPLICATION_JSON);
//
//        MvcResult result = mvc.perform(requestBuilder).andReturn();
//
//        int status = result.getResponse().getStatus();
//        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, status);
//	}
	
}
