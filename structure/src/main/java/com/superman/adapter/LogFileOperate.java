package com.superman.adapter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * @description: 实现对日志文件的操作
 * @author: superman宁
 **/
public class LogFileOperate implements LogFileOperateApi {

  /**
   * 日志文件的路径和文件名称，默认是当前classpath下的文件
   */
  private String logFilePathName = "AdapterLog.log";

  /**
   * 读取日志文件
   */
  public List<LogModel> readLogFile() {
    List<LogModel> list = null;
    ObjectInputStream oin = null;
    try {
      File file = new File(logFilePathName);
      if(file.exists()){
        oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        list = (List<LogModel>)oin.readObject();
      }
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      try {
        oin.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return list;
  }

  /**
   * 写日志文件
   */
  public void writeLogFile(List<LogModel> list) {
    File file = new File(logFilePathName);
    ObjectOutputStream out = null;
    try {
      out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
      out.writeObject(list);
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      try {
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
