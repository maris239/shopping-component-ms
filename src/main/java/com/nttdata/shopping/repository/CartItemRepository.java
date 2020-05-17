package com.nttdata.shopping.repository;

import com.nttdata.shopping.model.CartItem;
import com.nttdata.shopping.model.CartItemId;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItem, CartItemId> {
}
