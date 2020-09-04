package com.superman.proxy.jdk;

/**
 * @description:
 * @author: superman宁
 **/
public class Client {

  public static void main(String[] args) {
    Order order = new Order("设计模式");

    DynamicProxy dynamicProxy = new DynamicProxy();
    OrderApi orderApi = dynamicProxy.getProxyInterface(order);

    //使用被代理过得接口来操作
    orderApi.setProductName("test");
    System.out.println(orderApi);
  }

}
