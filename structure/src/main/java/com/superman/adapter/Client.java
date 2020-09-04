package com.superman.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: superman宁
 **/
public class Client {

  public static void main(String[] args) {
    LogModel lm = new LogModel();
    lm.setLogContent("001");
    lm.setOperateUser("admin");
    lm.setOperateTime("2010-02-12");

    List<LogModel> list = new ArrayList<LogModel>();
    list.add(lm);

    LogFileOperateApi logFileApi = new LogFileOperate();

    LogDbOperateApi api = new Adapter(logFileApi);

    api.createLog(lm);

    List<LogModel> allLog = api.getAllLog();
    System.out.println(allLog);

  }

}
