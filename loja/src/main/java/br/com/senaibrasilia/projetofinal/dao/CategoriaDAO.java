package br.com.senaibrasilia.projetofinal.dao;

import java.util.List;


import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Produto;


public class CategoriaDAO {
	
	private EntityManager entman;
	
	//======================================================

	public CategoriaDAO(EntityManager entman) {
		super();
		this.entman = entman;
	}

	//=================== Persist ===================================
	public void cadastrarCat(Categoria categoria) {
		//persist
		this.entman.persist(categoria);
	}
	
	//================== merge ====================================
	public void alterarCat(Categoria categoria) {
		// merge
		this.entman.merge(categoria);
		
	}
	
	//================= remove =====================================
	public void removeCat(Categoria categoria) {
		//remove
		this.entman.remove(categoria);
		
	}
	
	//================== find ====================================
	public Categoria pesquisarPorIdCat(Long id) {
		//find
		return entman.find(Categoria.class, id);
		
	}
	
	//================= lista tudo categoria =====================================
	public List<Categoria> pesquisarTodosCat() {
		// query - JPQL
		//Arraylist - List
		//lambda
		String todosc= "SELECT categ FROM Categoria categ";
		return entman.createQuery(todosc, Categoria.class).getResultList();
		
	}
	
	//=================== lista categpria por nome ===================================
	public List<Categoria> buscaPorNomeCat(String nome){
		String nomec= "SELECT categ FROM Categoria categ WHERE categ.nome= :nome";
		return entman.createQuery(nomec, Categoria.class).setParameter("nome", nomec).getResultList();
				
	}

}
