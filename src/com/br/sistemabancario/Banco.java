package com.br.sistemabancario;

import java.util.ArrayList;

public class Banco {
	
	private final String NOME;
    private final String AGENCIA;

    private ArrayList<Usuario> usuarios;
    private ArrayList<Conta> contas;
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