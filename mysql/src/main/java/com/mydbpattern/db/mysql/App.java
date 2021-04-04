package com.mydbpattern.db.mysql;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		
	  var db = Database.instance(); 
	  
	  try {
		  db.connect();
	  }
	  catch(SQLException e) {
		 e.printStackTrace();
	  }
	  
	  try {
		db.close();
	} catch (SQLException e) {
		// 		e.printStackTrace();
		System.out.println("OPEN CONNECTION");
	}
	}
}
