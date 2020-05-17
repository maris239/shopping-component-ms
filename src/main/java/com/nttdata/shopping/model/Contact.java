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
public class Contact implements Serializable {
  @Id
  @GeneratedValue
  private int id;
  @OneToOne(mappedBy = "contact")
  private Customer customer;
  @OneToOne
  private Address shippingAddress;
  private int phoneNumber;
  private String email;

}
