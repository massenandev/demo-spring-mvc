package com.mballen.course.boot.dao;

import org.springframework.stereotype.Repository;

import com.mballen.course.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
