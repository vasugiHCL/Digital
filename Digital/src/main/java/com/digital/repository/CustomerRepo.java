package com.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.entity.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
