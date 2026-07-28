package com.br.sistemabancario;

import java.util.ArrayList;

import javax.swing.DefaultRowSorter;

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
	
    public void cadastrarUsuario(Usuario usuario) {
    	if (cpfExiste(usuario.getCPF())) {
    		throw new IllegalArgumentException("[ERRO] CPF já cadastrado!");
    	} else {
    		usuarios.add(usuario);
    	}
    }
	
    public Conta criarConta(String cpf, Tipo tipo) {
    	
    	return null;
    }
    
    public boolean cpfExiste(String cpf) {
    	for (Usuario usuario : usuarios) {
			if(usuario.getCPF().equals(cpf)) {
				return true;
			} 
		}  return false;
	}
    
    public boolean existeUsuario(String cpf) {
    	
		for (Usuario usuario : usuarios) {
			if (usuario.getCPF().equals(cpf)) {
				return true;
			}
		} return false;
		
    }
    
    public Conta buscarConta(int id) { // usar id ou numero de conta
    	return null;
    }
    
    public ArrayList<Usuario> listarUsuarios() {
		return usuarios;
    }
	
    public ArrayList<Conta> listarContas() {
    	return contas;
    }
    
}