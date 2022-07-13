package com.paulocsf.monitore.crud.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cadastros")
public class Cadastros {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_cadastro")
    private Long id;

    @Column(name="nome", nullable = false)
    private String name;

    @Column(name="endereço")
    private String endereco;
    
    @Column(name="cep")
    private String cep;

    @Column(name="cpf")
    private String cpf;

    @Column(name="celular")
    private String celular;

    @Column(name="email")
    private String email;;

    @Column(name="senha")
    private String senha;

    public Cadastros(){

    }

    public Cadastros(String name, String endereco, String cep, String cpf, String celular, String email,
            String senha) {
        this.name = name;
        this.endereco = endereco;
        this.cep = cep;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
        this.senha = senha;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
