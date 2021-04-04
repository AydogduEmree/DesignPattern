package com.mydbpattern.db.mysql;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class AppReturnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var db = Database.instance(); 
		  
		  try {
			  db.connect();
		  }
		  catch(SQLException e) {
			 e.printStackTrace();
		  }
		  
		  System.out.println("System connected!");
		  
		  // do sth here 
		  UserDao userDao = new UserDaoImpl();
		  List<Users> users= userDao.getAll();
		  
		  for(Users u: users) {
			  System.out.println(u.toString());
		  }
		  System.out.println("-------------------------------");
		  
		  Optional<Users> m1 = Optional.ofNullable(new Users());
		  m1=  userDao.findById(2);
		  System.out.println(m1.toString());
		  
		  try {
				db.close();
			} catch (SQLException e) {
				// 		e.printStackTrace();
				System.out.println("OPEN CONNECTION");
			}
			  
			  System.out.println("CONNECTION closed!");
	}

}
