package com.stssm.github.io.javaweb.aaa001JDBC;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa001JDBC
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-16-11  星期六
 */
public class aaa001 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/study001sql";// 固定格式的sql语法
        String user = "root";// mysql数据库的账号
        String paw = "LIU18959297292";// 数据库的密码
        // 首先登录账号，获取连接
        try (
                Connection connect = DriverManager.getConnection(url, user, paw)
        ) {
            Statement statement = connect.createStatement();// 获取一个statement对象
            // String demosql = "select * from demo13emp where emp_name is not null";
            String demosql = "update demo13emp set salary='5000' where emp_name='任嘉伦'";
            int affectRow = statement.executeUpdate(demosql);// 数据库对象，执行对应的SQL语句
            System.out.println("受影响的行数为：" + affectRow);

            statement.close();
        }
    }
}
