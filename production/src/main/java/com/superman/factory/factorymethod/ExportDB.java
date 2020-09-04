package com.superman.factory.factorymethod;

/**
 * @description:
 * @author: superman宁
 **/
public class ExportDB implements ExportFileApi {

  public boolean export(String data) {
    System.out.println("导出数据"+data+"到数据库备份文件");
    return false;
  }
}
