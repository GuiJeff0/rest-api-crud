package com.guiproject.restcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guiproject.restcrud.entities.CloudVendor;
import com.guiproject.restcrud.repositories.CloudVendorRepository;

@Service
public class CloudVendorService {

	@Autowired
	private CloudVendorRepository repository;
	
	public List<CloudVendor> findAll(){
		return repository.findAll();
	}
	
	public CloudVendor findById(Long id) {
		Optional<CloudVendor> obj = repository.findById(id);
		return obj.get();
	}
	
	public CloudVendor insert(CloudVendor obj) {
        return repository.save(obj);
    }

    public CloudVendor update(CloudVendor obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
