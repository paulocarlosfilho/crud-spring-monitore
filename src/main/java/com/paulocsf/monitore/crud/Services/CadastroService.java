package com.paulocsf.monitore.crud.Services;

import java.util.List;

import com.paulocsf.monitore.crud.Entity.Cadastros;

public interface CadastroService {
	List<Cadastros> getAllcadastro();

	Cadastros salvarCadastro(Cadastros cadastro);
	
	Cadastros getCadastroById(Long id);
	
	Cadastros atualizarCadastro(Cadastros cadastros);
	
	void excluirCadastroById(Long id);
}
