package com.nttdata.shopping.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemSelectMessage implements Serializable {
  private long id;
  private int shoppingCartId;
  private int customerId;
  private int productId;
  private int count;

  public ItemSelectMessage(int shoppingCartId, int customerId, int productId, int count) {
    this.id = new Timestamp(System.currentTimeMillis()).getTime();
    this.shoppingCartId = shoppingCartId;
    this.customerId = customerId;
    this.productId = productId;
    this.count = count;
  }

}
