package com.di.positivepay.automation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLQueryExecutor {

	public Connection GetConnection() throws SQLException {

		Connection dbconnection = null;

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		try {

			dbconnection = DriverManager
					.getConnection(
							"jdbc:oracle:thin:@asqal10oclon100.dca.diginsite.net:1521/BPPAQA1",
							"BPP_APP", "PPayQ4");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
		if (dbconnection != null)
			System.out.println("Connection established successfully!");
		else
			System.out.println("No Connection!");

		return dbconnection;

	}

	public ResultSet selectRecordsFromDb(String SQLQueryToExecute)
			throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;
		ResultSet rs = null;

		try {
			dbConnection = GetConnection();
			statement = dbConnection.createStatement();

			// execute select SQL statement
			rs = statement.executeQuery(SQLQueryToExecute);

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return rs;
	}

}
