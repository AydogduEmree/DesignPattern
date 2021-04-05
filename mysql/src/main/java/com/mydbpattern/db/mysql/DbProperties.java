package com.mydbpattern.db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbProperties {

	private static  DbProperties db = new DbProperties();
	private Connection conn;
	public static DbProperties instance() {
		return db;
	}
	
	//constructor
	private DbProperties() {
		
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void connect(Properties props) throws SQLException {
		String server = props.getProperty("server");
		String port = props.getProperty("port");
		String database = props.getProperty("database");
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		
		String url = String.format("jdbc:mysql://%s:%s/%s?serverTimezone=UTC", server, port, database);
		System.out.println(url);
		System.out.println(user + password + user );
		conn = DriverManager.getConnection(url, user, password);
		//"jdbc:mysql://localhost:3306/project?serverTimezone=UTC"
		//"jdbc:mysql://localhost:3306/project?serverTimezone=UTC
	}
	
	public void close() throws SQLException {
		conn.close();
	}
}
