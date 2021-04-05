package com.mydbpattern.db.mysql;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class AppProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var prop = Profile.getProperties("db");
		
		var db = DbProperties.instance();
		  
		  try {
			  db.connect(prop);
		  }
		  catch(SQLException e) {
			 e.printStackTrace();
		  }
		  
		  System.out.println("System connected!");
		  UserDao userDao = new UserDaoImpl();
		  List<Users> users= userDao.getAllProperties();
		  
		  for(Users u: users) {
			  System.out.println(u.toString());
		  }
	}

}
