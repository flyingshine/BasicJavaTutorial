package com.yiibai.tutorial.javabasic.jdbc;

import java.sql.*;

public class jdbcConn {

	public static void main(String[] args) {
		System.out.println("start to connect to mysql");
		mysqlConn();

		System.out.println("start to connect to sqlserver");
		sqlserverConn();

	}

	public static void sqlserverConn() {
		try {

			System.out.println("This is the testing for jdbc");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Success loading sqlserver Driver!");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
		}

		try {

			Connection connection = DriverManager.getConnection("jdbc:sqlserver://cow;DatabaseName=iGenDev_Mapping_MST",
					"sa", "igen");
			System.out.println("Success connect sql server!");
			Statement stmt = connection.createStatement();
			ResultSet rSet = stmt.executeQuery("select count(1) from Feature_Mapping;");

			while (rSet.next()) {
				System.out.println(rSet.getString(1));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
		}
	}

	public static void mysqlConn() {
		try {

			System.out.println("This is the testing for jdbc");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Success loading Mysql Driver!");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
		}

		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://10.0.125.214/test", "sa", "igen");
			System.out.println("Success connect Mysql server!");
			Statement stmt = connection.createStatement();
			ResultSet rSet = stmt.executeQuery("select * from test_data limit 10;");

			while (rSet.next()) {
				System.out.println(rSet.getString(2));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
		}
	}

}
