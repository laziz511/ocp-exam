package com.laziz.assessment_test.question16;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Savepoint;

/**
 * Question: Which is true if the table is empty before this code is run? (Choose all that apply.)
 * Answer: A, D
 * A: If the blank line contains rollback(), there are no rows in the table.
 * D: If the blank line contains rollback(sp), there is one row in the table.
 * Description:
 * - JDBC use the existing parameters if you don't replace it.
 *      This means, the second update contains 'NY' as the third parameter
 * D: rolling back to a savepoint throws out any changes made since. This leaves Joslyn, and removes Kara
 * A: rolling back without a savepoint brings us back to the beginning of the transaction.
 */
public class Question16 {
    public static void main(String[] args) throws Exception {
        Connection conn = null; // extra added

        var sql = "INSERT INTO people VALUES(?, ?, ?)";
        conn.setAutoCommit(false);
        try (var ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ps.setInt(1, 1);
            ps.setString(2, "Joslyn");
            ps.setString(3, "NY");
            ps.executeUpdate();
            Savepoint sp = conn.setSavepoint();
            ps.setInt(1, 2);
            ps.setString(2, "Kara");
            ps.executeUpdate();
            conn.__; // the blank line
        }
    }
}
