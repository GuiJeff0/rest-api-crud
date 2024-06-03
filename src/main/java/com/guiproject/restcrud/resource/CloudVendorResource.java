package com.guiproject.restcrud.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guiproject.restcrud.entities.CloudVendor;
import com.guiproject.restcrud.services.CloudVendorService;

@RestController
@RequestMapping(value = "/cloudvendor")
public class CloudVendorResource {
	
	
	@Autowired
	private CloudVendorService service;
	
	@GetMapping
	public ResponseEntity<List<CloudVendor>> findAll(){
		List<CloudVendor> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CloudVendor> findById(@PathVariable Long id){
		CloudVendor obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		//this.service = service;
		return "Cloud Vendor Created Successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		//this.service = service;
		return "Cloud Vendor Updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.service = null;
		return "Cloud Vendor Deleted Successfully";
	}
	
}
