package com.nttdata.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address implements Serializable {
  @Id
  @GeneratedValue
  private int id;
  private String line1;
  private String line2;
  private String line3;
  private String country;
  private String province;
  private String city;
  private String postalCode;
  @OneToOne(mappedBy = "shippingAddress")
  private Contact contact;

}
