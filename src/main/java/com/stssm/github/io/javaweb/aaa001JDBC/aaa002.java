package com.stssm.github.io.javaweb.aaa001JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.javaweb.aaa001JDBC
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-22-35  星期六
 */
public class aaa002 {
    public static void main(String[] args) {

        // String mysqlUrl="jdbc:mysql://....../study001sql";
        // 中间省略了连接的名称
        // String mysqlUrl="jdbc:mysql:///study001sql";
        // 直接这样连接会出现安全提示，
        // 重新配置ssl需要经过复杂的操作，同时性能会下降20%左右
        String mysqlUrl = "jdbc:mysql:///study001sql?useSSL=false";
        String accName = "root";
        String accPaw = "LIU18959297292";

        try (
                Connection connection = DriverManager.getConnection(mysqlUrl, accName, accPaw);
                Statement statement = connection.createStatement();
        ) {
            String sql = "update demo13emp set salary='20222' where emp_name='任嘉伦' ";
            int affectRow = statement.executeUpdate(sql);// statment是用来执行SQL的对象
            // 定义出来的所有SQL语句，都需要放到statement中执行出来
            System.out.println(affectRow);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
