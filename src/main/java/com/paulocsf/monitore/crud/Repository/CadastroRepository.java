package com.paulocsf.monitore.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulocsf.monitore.crud.Entity.Cadastros;


public interface CadastroRepository extends JpaRepository<Cadastros, Long>{

}
