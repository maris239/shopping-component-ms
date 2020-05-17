package com.nttdata.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CartItemId implements Serializable {
  @ManyToOne
  private ShoppingCart shoppingCart;
  @ManyToOne
  private Product product;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof CartItemId)) return false;
    CartItemId that = (CartItemId) o;
    return Objects.equals(getShoppingCart(), that.getShoppingCart()) &&
        Objects.equals(getProduct(), that.getProduct());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getShoppingCart(), getProduct());
  }
}
