package br.com.senaibrasilia.projetofinal.dao;

import javax.persistence.EntityManager;

import java.util.List;

import br.com.senaibrasilia.projetofinal.model.Produto;

public class ProdutoDAO {
	
	private EntityManager entman;
	
/*	public ProdutoDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
*/
	public ProdutoDAO(EntityManager entman) {
 //		super();
 		this.entman = entman;
	}

	//================ persist ===================================
	public void cadastrarProd(Produto produto) {
		//persist
		this.entman.persist(produto);
	}
	//================ merge ===================================
	public void alterarProd(Produto produto) {
		// merge
		this.entman.merge(produto);
		
	}
	//================ remove ===================================
	public void removeProd(Produto produto) {
		this.entman.remove(entman);
		
	}
	//================== find =================================
	public Produto pesquisarPorIdProd(Long id) {
		//find
		return entman.find(Produto.class, id);
		
	}
	//================== lista todos os produtos=================================
	public List<Produto> pesquisarTodosProd() {
		//Arraylist - List
		String todosp= "SELECT prod FROM Produto prod";
		return entman.createQuery(todosp, Produto.class).getResultList();
		
	}
	//================== lista produto por nome =================================
	public List<Produto> buscaPorNomeProd(String nome){
		String nomeprod= "SELECT prod FROM Produto pprod WHERE prod.nome= :nome";
		return entman.createQuery(nomeprod, Produto.class).setParameter("nome", nomeprod).getResultList();
				
	}

}
