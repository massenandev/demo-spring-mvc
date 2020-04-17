package com.mballen.course.boot.service;

import java.util.List;

import com.mballen.course.boot.domain.Departamento;

public interface DepartamentoService {
	
	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();

}
