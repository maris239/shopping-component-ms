package com.nttdata.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CartItem implements Serializable {
  @EmbeddedId
  CartItemId cartItemId;
  @Column(nullable = false)
  private Integer quantity;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof CartItem)) return false;
    CartItem cartItem = (CartItem) o;
    return Objects.equals(getCartItemId(), cartItem.getCartItemId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCartItemId());
  }

}
