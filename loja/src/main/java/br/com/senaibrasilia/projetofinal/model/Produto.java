package br.com.senaibrasilia.projetofinal.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// Classe de mapeamento da tabela 
// Classe de Entidade
// o @ � uma anotation - mandar mensagem para o compiladdor

// atua para fazer a cria��o da tabela
@Entity
@Table(name="produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate datacadastro = LocalDate.now();
	
	@ManyToOne
	private Categoria categoria;
	
	// @ManyToOne
	// private Cliente cliente;
	
	/* ====================*/
	public Produto() {
		super();
	}

	public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
		
	}
	/* ====================*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/* ====================*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;	
	}
	/* ====================*/
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/* ====================*/
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	/* ====================*/
	public LocalDate getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(LocalDate datacadastro) {
		this.datacadastro = datacadastro;
	}
	/* ====================*/
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}