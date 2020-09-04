package com.superman.factory.factorymethod;

/**
 * @description:
 * @author: superman宁
 * 具体的创建器实现对象，实现创建导出成数据库备份文件形式的对象
 **/
public class ExportDBOperate extends ExportOperate {


  /**
   * 工厂方法，创建导出的文件对象的接口对象
   */
  @Override
  protected ExportFileApi factoryMethod() {
    return new ExportDB();
  }
}
