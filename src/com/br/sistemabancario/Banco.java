package com.br.sistemabancario;

import java.util.ArrayList;

public class Banco {
	
	private final String NOME;
    private final String AGENCIA;

    private ArrayList<Usuario> usuarios;
    private ArrayList<Conta> contas;
    
//O que o sistema faz?
//
//Cadastra usuários
//Realiza saques
//Realiza depósitos
//Mostra extrato
//
//Quais são os personagens desse sistema?
//
//Usuário
//Banco
//Conta
//
//O que esses personagens possui?
//
//Usuário: cpf, idade, nome, apelido
//Conta: usuarios, tipo, saldo, limite
//Banco: contas
//
//O que esse personagem faz?
//
//Usuario: calcula idade
//Conta: mostra extrato, realiza depositos, realiza saques
//Banco: cadastrar usuario, criar uma conta, listar contas, buscar conta, buscar usuario
//
//Os personagens se conhecem?
//
//Banco: conhece usuario e conta
//Conta: conhece usuario
//Usuario: conhece ninguem
//cadastrar usuario, criar uma conta, listar contas, buscar conta, buscar usuario
    
    
	public Banco(String nome, String agencia, ArrayList<Usuario> usuarios, ArrayList<Conta> contas) {
		NOME = nome;
		AGENCIA = agencia;
		this.usuarios = usuarios;
		this.contas = contas;
	}
	
    public void cadastrarUsuario() {
    	
    }
	
    public void criarConta() {
    	
    }
    
    public Usuario buscarUsuario() {
		return null;
    }
    
    public Conta buscarConta() {
    	return null;
    }
    
    public ArrayList<Usuario> listarUsuarios() {
		return usuarios;
    }
	
    public ArrayList<Conta> listarContas() {
    	return contas;
    }
    
}