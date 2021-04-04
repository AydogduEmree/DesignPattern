package com.mydbpattern.db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static  Database db = new Database();
	private static final String URL = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC"; // project = SCHEMA_NAME of db
	private Connection conn;
	public static Database instance() {
		return db;
	}
	
	//constructor
	private Database() {
		
	}
	
	public void connect() throws SQLException {
		conn = DriverManager.getConnection(URL, "root", "Blue@123$");
	}
	
	public void close() throws SQLException {
		conn.close();
	}
}
