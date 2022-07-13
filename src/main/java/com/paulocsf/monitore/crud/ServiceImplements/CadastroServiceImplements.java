package com.paulocsf.monitore.crud.ServiceImplements;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paulocsf.monitore.crud.Entity.Cadastros;
import com.paulocsf.monitore.crud.Repository.CadastroRepository;
import com.paulocsf.monitore.crud.Services.CadastroService;



@Service
public class CadastroServiceImplements implements CadastroService {
	
	private CadastroRepository cadastroRepository; 
	
	public CadastroServiceImplements(CadastroRepository cadastroRepository) {
		super();
		this.cadastroRepository = cadastroRepository;
	}

	@Override
	public List<Cadastros> getAllcadastro(){
		return cadastroRepository.findAll();
	}
	
	@Override
	public Cadastros salvarCadastro(Cadastros cadastro) {
		return cadastroRepository.save(cadastro);
	}

	@Override
	public Cadastros getCadastroById(Long id) {
		return cadastroRepository.findById(id).get();
	}

	@Override
	public Cadastros atualizarCadastro(Cadastros cadastro) {
		
		return cadastroRepository.save(cadastro);
	}

	@Override
	public void excluirCadastroById(Long id) {
		cadastroRepository.deleteById(id);
	}
	
}
