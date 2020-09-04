package com.superman.factory.simplefactory;

/**
 * @description: 客户端类
 * @author: superman宁
 **/
public class Client {

  public static void main(String[] args) {
    // 用户不需要知道具体的实现
    Api api = Factory.createApi();
    api.hello("man");
  }

}
