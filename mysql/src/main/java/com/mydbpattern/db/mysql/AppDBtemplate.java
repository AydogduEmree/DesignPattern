package com.mydbpattern.db.mysql;

import java.sql.SQLException;

public class AppDBtemplate {

	public static void main(String[] args) {

		var db = Database.instance(); 
		  
		  try {
			  db.connect();
		  }
		  catch(SQLException e) {
			 e.printStackTrace();
		  }
		  
		  System.out.println("System connected!");
		  
		  // do sth here 
		  
		  try {
				db.close();
			} catch (SQLException e) {
				// 		e.printStackTrace();
				System.out.println("OPEN CONNECTION");
			}
			  
			  System.out.println("CONNECTION closed!");
	}

}
