package com.superman.singleton;

/**
 * @description: 使用类的内部类实现的单例
 * @author: superman宁
 **/
public class Singleton3 {

  /**
   * 私有构造方法
   */
  private Singleton3(){}

  /**
   * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系
   * 而且只有被调用到才会装载，从而实现了延迟加载
   */
  private static class singletonHolder{
    /**
     * 静态初始化器，由JVM来保证线程安全
     */
    private static Singleton3 instance = new Singleton3();
  }

  public static Singleton3 getInstance(){
    return singletonHolder.instance;
  }

}
