package com.stssm.github.io.javaweb.aaa002JDBC2022年5月31日;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaaJDBC2022年5月31日
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-20-24  星期二
 */
public class aaa003connection {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql:///study001sql?useSSL=false";
        String loginName = "root";
        String loginPassword = "LIU18959297292";

        Connection connection = DriverManager.getConnection(url, loginName, loginPassword);
        String sql1 = "update demo14bankaccount.account_name set balance =2000 where id=1";

        try {
            connection.setAutoCommit(false);// 开启事物
            Statement stat = connection.createStatement();
            int res = stat.executeUpdate(sql1);
            System.out.println("res的结果为：" + res);

            connection.commit();// 提交事物
        } catch (Exception e) {
            e.printStackTrace();
            // 在异常中进行事物的回滚操作
            connection.rollback();// 回滚事物
        }


    }
}
