package com.superman.factory.abstractfactory;

/**
 * @description: 实现抽象工厂，
 * @author: superman宁
 **/
public class SchemaFactory implements AbstractFactory {

  /**
   * 创建CPU的对象
   */
  public CPUApi createCPUApi() {
    return new IntelCpu();
  }

  /**
   * 创建主板的对象
   */
  public MainboardApi createMainboardApi() {
    return new GAMainboard();
  }
}
