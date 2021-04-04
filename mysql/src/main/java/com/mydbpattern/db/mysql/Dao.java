package com.mydbpattern.db.mysql;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
	// insert, update, delete, retrieve1, retrieveAll
	void save(T t);
	void update(T t);
	void delete(T t);
	Optional<T> findById(int id);
	List<T> getAll();
	
}
