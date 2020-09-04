package com.superman.proxy.cglib;

import java.util.UUID;

/**
 * @description:
 * @author: superman宁
 **/
public class Client {

  public static void main(String[] args) {
    OrderManager orderManger = (OrderManager)new CGLibProxy().createProxyObject(new OrderManager());
    orderManger.save(UUID.randomUUID(),"save");
    orderManger.save(UUID.randomUUID(),"update");
    orderManger.getByName("save");
  }

}
