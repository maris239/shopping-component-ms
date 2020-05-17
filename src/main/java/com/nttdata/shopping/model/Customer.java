package com.nttdata.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer implements Serializable {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private Sex sex;
  @OneToOne
  private Contact contact;
  @OneToMany(mappedBy = "customer")
  private List<ShoppingCart> shoppingCartList = new ArrayList<>();

  public enum Sex {
    MALE, FEMALE;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Customer)) return false;
    Customer customer = (Customer) o;
    return Objects.equals(getId(), customer.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }

}
