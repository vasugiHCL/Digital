package com.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.entity.Reference;


@Repository
public interface ReferenceRepo extends JpaRepository<Reference, Long>{
	
	public Reference findByCustomerId(Long customerId);

}
