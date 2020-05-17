package com.nttdata.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product implements Serializable {
  @Id
  @GeneratedValue
  private int id;
  private String description;
  private String productCategory;
  private double price;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product)) return false;
    Product product = (Product) o;
    return getId() == product.getId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }

}
