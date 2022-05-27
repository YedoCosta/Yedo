package br.com.senaibrasilia.projetofinal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="clientes") // se eu quiser renomear a Entidade
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cpf;
	private String endereco;
	private int telefone;
	
//	@OneToMany(targetEntity = Produto.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "Cliente")
//	private List<Produto> produto = new ArrayList();
	
	
	
	/* ====================*/
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nome, String cpf, String endereco, int telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	/* ====================*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/* ====================*/
	public String getcpf() {
		return cpf;
	}
	public void setCPF(String cpf) {
		cpf = cpf;
	}
	/* ====================*/
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/* ====================*/
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/* ====================*/
}
