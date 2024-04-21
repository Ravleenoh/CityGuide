package com.cityguide.guider.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cityguide.guider.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

}
