package com.nttdata.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShoppingCart implements Serializable {
  @Id
  @GeneratedValue
  private int id;
  @ManyToOne
  private Customer customer;
  private Status status;
  @OneToMany(mappedBy = "cartItemId.shoppingCart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Set<CartItem> cartItems = new HashSet<>();

  public enum Status implements Serializable {
    DRAFT, CANCELLED, PAYMENT_PENDING, PAYMENT_RECEIVED, SHIPPING_SCHEDULED, SHIPPED, DELIVERED, DELIVERY_CONFIRMED;
  }

  public ShoppingCart(Customer customer) {
    this.customer = customer;
    this.status = Status.DRAFT;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ShoppingCart)) return false;
    ShoppingCart that = (ShoppingCart) o;
    return getId() == that.getId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }

}
