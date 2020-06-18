package Kotori.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url= "jdbc:mysql://localHost:3306/trans_db?serverTimezone=UTC&rewriteBatchedStatements=true&characterEncoding=utf-8&useSSL=false";
    static String username="root";
    static String password="19926172xz";

    static {
        try {
            Class.forName(driver); //classLoader,加载对应驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
