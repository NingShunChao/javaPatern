package com.superman.factory.factorymethod;

/**
 * @description: Creator 抽象的创建其类，声明工厂方法
 * @author: superman宁
 **/
public abstract class ExportOperate {

  public boolean export(String data){
    // 使用工厂方法
    ExportFileApi api = factoryMethod();
    return api.export(data);
  }

  /**
   * 工厂方法，创建导出的文件对象的接口对象
   * @return
   */
  protected abstract ExportFileApi factoryMethod();

}
