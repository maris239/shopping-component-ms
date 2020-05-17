package com.nttdata.shopping.repository;

import com.nttdata.shopping.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
  Iterable<Customer> findAllByOrderByIdAsc();
}
