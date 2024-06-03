package com.guiproject.restcrud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.guiproject.restcrud.entities.CloudVendor;
import com.guiproject.restcrud.repositories.CloudVendorRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CloudVendorRepository cloudVendorRepository;
	
	
	public void run(String... args) throws Exception {
		CloudVendor cv1 = new CloudVendor(null, "Maria Brown", "maria@gmail.com", "988888888");
		
		
		cloudVendorRepository.saveAll(Arrays.asList(cv1));
	}

}
