package com.exercise.java.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLQueryExecutor {

	// private static final String DB_DRIVER = "";
	// private static final String DB_CONNECTION =
	// "asqal10oclon100.dca.diginsite.net:1521:BPPAQA1";
	// private static final String DB_USER = "BPP_APP";
	// private static final String DB_PASSWORD = "PPayQ4";

	public static Connection GetConnection() throws SQLException {

		Connection dbconnection = null;

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		try {

			dbconnection = DriverManager
					.getConnection(
							"jdbc:oracle:thin:@somedatabasename:someportnumber/someservicename",
							"SomeUsername", "SomePassword");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
		if (dbconnection != null)
			System.out.println("Connection established successfully!");
		else
			System.out.println("No Connection!");

		return dbconnection;

	}

	public static ResultSet selectRecordsFromDb(String SQLQueryToExecute)
			throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;
		ResultSet rs = null;

		// String selectTableSQL =
		// "select LOCATION_ID from BPP.LOCATION_ACCOUNT";

		try {
			dbConnection = GetConnection();
			statement = dbConnection.createStatement();

			// execute select SQL statement
			rs = statement.executeQuery(SQLQueryToExecute);

			// while (rs.next()) {
			//
			// String LOCATIONACCOUNTID = rs.getString("LOCATION_ID");
			//
			// System.out.println("LOCATIONID : " + LOCATIONACCOUNTID);
			//
			// }

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

		return rs;
	}

}
