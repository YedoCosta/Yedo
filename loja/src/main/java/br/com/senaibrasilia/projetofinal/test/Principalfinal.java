package br.com.senaibrasilia.projetofinal.test;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import br.com.senaibrasilia.projetofinal.dao.CategoriaDAO;
import br.com.senaibrasilia.projetofinal.dao.ProdutoDAO;
import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Produto;
import br.com.senaibrasilia.projetofinal.util.JPAUtil;

public class Principalfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		cadastrarProduto();  // quanto for incluir objeto
		

		EntityManager entman= JPAUtil.getEntityManager();		
		ProdutoDAO produtoDao = new ProdutoDAO(entman);
		
/*  comenta altera��o
		 //=================== Alterar Produto  ===================================
		// public Produto pesquisarPorIdProd(Long id)
		  
        Produto produto = produtoDao.pesquisarPorIdProd(1l);
		
        entman.getTransaction().begin();
        	
		produto.setNome("Yedo Costa ");
		produto.setDescricao("Excelente");
		produto.setPreco(new BigDecimal("3000"));
		
    	produtoDao.alterarProd(produto);
		
        entman.getTransaction().commit();
        entman.close();
Fim comenta altera��o */ 
// /*  comenta listar				
   //====================Listar todo Produto =============================
   
		for(int i = 0; i < produtoDao.pesquisarTodosProd().size() ; i++) 
		{
			System.out.println("Codigo: "+produtoDao.pesquisarTodosProd().get(i).getId() + "||");
			System.out.println("Nome: "+produtoDao.pesquisarTodosProd().get(i).getNome() + "||");
			System.out.println("Descri��o: "+produtoDao.pesquisarTodosProd().get(i).getDescricao() + "||");
			System.out.println("Pre�o: "+produtoDao.pesquisarTodosProd().get(i).getPreco() + "||");
		
				
		}
	
		
// Fim comenta listar */
	} 
	
	/*
	//=======================  cadastrar Produto e Categoria  =========================
	 * 
	   private static void cadastrarProduto() {
	        Categoria celulares = new Categoria("CELULARES");
	        Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares );
	       
	        EntityManager entman = JPAUtil.getEntityManager();
	        ProdutoDAO produtoDao = new ProdutoDAO(entman);
	        CategoriaDAO categoriaDao = new CategoriaDAO(entman);
	       
	        entman.getTransaction().begin();
	       
	        categoriaDao.cadastrarCat(celulares);
	        produtoDao.cadastrarProd(celular);
	       
	        entman.getTransaction().commit();
	        entman.close();
	    }

	*/   
			

}
