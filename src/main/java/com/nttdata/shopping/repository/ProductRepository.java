package com.nttdata.shopping.repository;

import com.nttdata.shopping.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
