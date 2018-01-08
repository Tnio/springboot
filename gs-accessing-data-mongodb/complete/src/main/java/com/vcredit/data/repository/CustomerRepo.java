package com.vcredit.data.repository;

import com.vcredit.data.model.mongo.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer, String> {
    public Customer findByName(String name);
}
