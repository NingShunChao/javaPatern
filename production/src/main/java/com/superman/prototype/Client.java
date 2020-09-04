package com.superman.prototype;

/**
 * @description:
 * @author: superman宁
 **/
public class Client {

  public static void main(String[] args) {
    PersonalOrder personalOrder = new PersonalOrder();
    personalOrder.setOrderProductNum(3295);
    personalOrder.setCustomerName("张三");
    personalOrder.setProductId("p0001");

    OrderBusiness orderBusiness = new OrderBusiness();
    orderBusiness.saveOrder(personalOrder);
  }

}
