package com.mydbpattern.db.mysql;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

	public void save(Users t) {

		var conn = Database.instance().getConnection();
		try {
			var stmt = conn.prepareStatement("insert into users(USERID, USERNAME ,PASSWORD, "
					+ "FIRSTNAME, LASTNAME, EMAIL) " + "values (?, ?, ?, ?, ?, ?)");

			stmt.setInt(1, t.getId());
			stmt.setString(2, t.getUSERNAME());
			stmt.setString(3, t.getPASSWORD());
			stmt.setString(4, t.getFIRSTNAME());
			stmt.setString(5, t.getLASTNAME());
			stmt.setString(6, t.getEMAIL());
			stmt.executeUpdate();

			stmt.close();
		} catch (SQLException e) {
			System.out.println("SAVE USER EXCEPTION");
		}
	}

	public void update(Users t) {

	}

	public void delete(Users t) {

	}

	public Optional<Users> findById(int id) {

		var conn = Database.instance().getConnection();
		Users myone= new Users();
		try {
			var stmt = conn.prepareStatement("select * from users where USERID=?");
			stmt.setInt(1, id);
			var rs = stmt.executeQuery();
			
			
			while (rs.next()) {
				var USERNAME = rs.getString(2);
				var PASSWORD = rs.getString(3);
				var FIRSTNAME = rs.getString(4);
				var LASTNAME = rs.getString(5);
				var EMAIL = rs.getString(6);

				 myone = new Users(id, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL);
				 return Optional.of(myone);
			}
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Optional.ofNullable(myone) ;
	}

	public List<Users> getAll() {

		List<Users> users = new ArrayList<>();
		var conn = Database.instance().getConnection();

		try {
			var stmt = conn.createStatement();
			var rs = stmt.executeQuery("select * from users");

			while (rs.next()) {
				var id = rs.getInt(1);
				var USERNAME = rs.getString(2);
				var PASSWORD = rs.getString(3);
				var FIRSTNAME = rs.getString(4);
				var LASTNAME = rs.getString(5);
				var EMAIL = rs.getString(6);

				users.add(new Users(id, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL));
			}
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;
	}

}
