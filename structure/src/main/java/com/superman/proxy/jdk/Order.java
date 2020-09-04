package com.superman.proxy.jdk;

/**
 * @description: 订单对象
 * @author: superman宁
 **/
public class Order implements OrderApi{

  private String productName;

  public Order(String productName) {
    this.productName = productName;
  }

  @Override
  public String getProductName() {
    return this.productName;
  }

  @Override
  public void setProductName(String productName) {
    this.productName = productName;
  }

  @Override
  public String toString() {
    return "Order{" +
        "productName='" + productName + '\'' +
        '}';
  }

}
