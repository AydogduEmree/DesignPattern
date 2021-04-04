package com.mydbpattern.db.mysql;

import java.sql.SQLException;
import java.util.List;

public class AppDelete {

	public static void main(String[] args) {
		var db = Database.instance();

		try {
			db.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("System connected!");

		// do sth here
		UserDao userDao = new UserDaoImpl();
		
		//userDao.delete(new Users(4));
		userDao.update(new Users(4,"Nurdan"));
		List<Users> users = userDao.getAll();

		for (Users u : users) {
			System.out.println(u.toString());
		}
		
		
		try {
			db.close();
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("OPEN CONNECTION");
		}

		System.out.println("CONNECTION closed!");
	}

}
