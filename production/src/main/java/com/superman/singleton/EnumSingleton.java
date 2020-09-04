package com.superman.singleton;

/**
 * @description: 使用枚举实现单例（效率高）
 * @author: superman宁
 **/
public enum EnumSingleton {

  /**
   * 定义一个枚举的元素，它就代表了Singleton的一个实例
   */
  uniqueInstance;

  public static EnumSingleton getInstance(){
    return uniqueInstance;
  }

}
