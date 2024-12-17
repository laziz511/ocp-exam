package com.laziz.assessment_test.question12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Question: Which of the following can fill in the blanks in order to make this code compile?
 * Answer: B. Connection, DriverManager, PreparedStatement, ResultSet
 * Description:
 * - A Connection is obtained through a DriverManager, making option B correct.
 */
public class Question12 {
    public static void main(String[] args) throws Exception {
        // pre-values
        String url = "https://www.google.com/";
        String userName = "username";
        String password = "password";
        String sql = "select * from question12";

        // actual part
        Connection a = DriverManager.getConnection(url, userName, password);
        PreparedStatement b = a.prepareStatement(sql);
        ResultSet c = b.executeQuery();
        if (c.next()) System.out.println(c.getString(1));
    }
}
