package com.nttdata.shopping.repository;

import com.nttdata.shopping.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
