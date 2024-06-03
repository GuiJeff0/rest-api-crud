package com.guiproject.restcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guiproject.restcrud.entities.CloudVendor;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, Long> {

}