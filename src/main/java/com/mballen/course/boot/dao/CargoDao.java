package com.mballen.course.boot.dao;

import java.util.List;

import com.mballen.course.boot.domain.Cargo;

public interface CargoDao {

	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete (Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
}
