package com.paulocsf.monitore.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.paulocsf.monitore.crud.Entity.Cadastros;
import com.paulocsf.monitore.crud.Services.CadastroService;

@Controller
public class CadastroController {
	private CadastroService cadastroService;

	public CadastroController(CadastroService cadastroService) {
		super();
		this.cadastroService = cadastroService;
	}
	
	
	@GetMapping("/cadastro")
	public String listarCadastro(Model model) {
		model.addAttribute("cadastro", cadastroService.getAllcadastro());
		return "cadastro.html";
	}
	
	@GetMapping("/cadastro/pessoas")
	public String cadastrarPessoaViaForm(Model model) {
		Cadastros cadastro = new Cadastros();
		model.addAttribute("cadastro", cadastro);
		return "cadastrarPessoa.html";
	}
	
	@PostMapping("/cadastro")
	public String salvarCadastro(@ModelAttribute("cadastro")Cadastros cadastro) {
		cadastroService.salvarCadastro(cadastro);
		return "redirect:/cadastro.html";
	}
	
	@GetMapping("/cadastro/editar/{id}")
	public String editarPessoaViaForm(@PathVariable Long id, Model model) {
		model.addAttribute("cadastro", cadastroService.getCadastroById(id));
		return "atualizarPessoa.html";
	}
	
	@PostMapping("cadastro/{id}")
	public String atualizarCadastro(@PathVariable Long id, @ModelAttribute ("cadastro") Cadastros cadastro, Model model) {
		Cadastros existenciaDeCadastro = cadastroService.getCadastroById(id);
		existenciaDeCadastro.setId(id);
		existenciaDeCadastro.setName(cadastro.getName());
		existenciaDeCadastro.setCpf(cadastro.getCpf());
		existenciaDeCadastro.setCep(cadastro.getCep());
		existenciaDeCadastro.setCelular(cadastro.getCelular());
		existenciaDeCadastro.setEmail(cadastro.getEmail());
		existenciaDeCadastro.setEndereco(cadastro.getEndereco());
		existenciaDeCadastro.setSenha(cadastro.getSenha());
		
		cadastroService.atualizarCadastro(existenciaDeCadastro);
		return "redirect/cadastros";
	}
	
	@GetMapping("/cadastro/excluir/{id}")
	public String excluirPessoaViaForm(@PathVariable Long id){
		cadastroService.excluirCadastroById(id);
		return "redirect:/cadastro.html";
	}
}
