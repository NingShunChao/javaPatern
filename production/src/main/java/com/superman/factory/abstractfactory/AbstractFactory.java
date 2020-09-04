package com.superman.factory.abstractfactory;

/**
 * @description: 抽象工厂的接口，声明创建抽象产品对象的操作
 * @author: superman宁
 **/
public interface AbstractFactory {

  /**
   * 创建CPU的对象
   * @return
   */
  public CPUApi createCPUApi();

  /**
   * 创建主板的对象
   * @return
   */
  public MainboardApi createMainboardApi();

}
