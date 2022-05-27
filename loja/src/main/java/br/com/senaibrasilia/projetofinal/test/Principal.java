package br.com.senaibrasilia.projetofinal.test;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Cliente;
import br.com.senaibrasilia.projetofinal.model.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EntityManeger
		
		//Estado New
		//Produto p = new Produto("Mouse","Maouse Dell Optico",new BigDecimal("100"));
		Cliente c= new Cliente("Jose Maria","12345678912","shis 25 cj 04",12345678);
				
		Categoria ca = new Categoria();
		ca.setNome("Eletronico");
		Categoria ca1 = new Categoria();
		ca1.setNome("Alimentos");
		
		
		// Os caras
		// pega a conexão - persistence.xml<persistence-unit name="loja"
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		
		// cria o objeto 'em' para a classe EntityManager
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		//entra no estado gerenciado
		//em.persist(p);
		em.persist(c);
		em.persist(ca);
		em.persist(ca1);
		//salva no banco 
		em.getTransaction().commit();
		// fecha a transação
		em.close();
			
		// Estado New
/*
		Cliente c= new Cliente("Jose Maria","12345678912","shis 25 cj 04",12345678);
		EntityManagerFactory factoryC = Persistence.createEntityManagerFactory("loja");
		
		EntityManager emC = factoryC.createEntityManager();
		
		emC.getTransaction().begin();
		//entra no estado gerenciado
		emC.persist(c);
		//salva no banco 
		emC.getTransaction().commit();
		// fecha a transação
		emC.close();
*/

	}

}
