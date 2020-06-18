package Kotori.Dao;

import Kotori.util.JDBCUtil;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {

    @Test
    public void InsertStudent() {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JDBCUtil.getConnection();
            statement = connection.prepareStatement("INSERT INTO `student_table` (stu_name,stu_age,stu_money) VALUES (?,?,?)");
            statement.setString(1, "ls");
            statement.setInt(2, 12);
            statement.setDouble(3, 100.0);

            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void queryStudent() {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JDBCUtil.getConnection();
            statement = connection.prepareStatement("SELECT * FROM `student_table` WHERE stu_id = ?");
            statement.setInt(1,1);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                String s = resultSet.getString(2);
                System.out.println(s);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




}
