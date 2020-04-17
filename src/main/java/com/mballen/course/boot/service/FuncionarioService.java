package com.mballen.course.boot.service;

import java.util.List;

import com.mballen.course.boot.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
