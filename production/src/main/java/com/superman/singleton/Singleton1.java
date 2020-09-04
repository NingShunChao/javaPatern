package com.superman.singleton;

/**
 * @description: 饿汉式单例（空间换时间）
 * @author: superman宁
 **/
public class Singleton1 {

  /**
   * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只会创建一次
   */
  private final static Singleton1 uniqueInstance = new Singleton1();

  /**
   * 私有化构造方法，好在内部控制创建实例的数目
   */
  private Singleton1(){}

  /**
   * 定义一个方法来为客户端提供类实例
   * @return
   */
  public static Singleton1 getInstance(){
    return uniqueInstance;
  }


}
