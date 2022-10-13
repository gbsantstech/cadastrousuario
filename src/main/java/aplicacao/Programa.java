package aplicacao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
//		
//		Pessoa p1 = new Pessoa(null, "Gabriel Santos", "gabriel@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Diogo Di Blasi", "diogo@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Felipe Beser", "felipe@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 1);
		
		System.out.println(p);
// transação criada para persistir os dados no banco de dados
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
	
// transação criada para remover a pessoa p1 do banco de dados		
//em.getTransaction().begin();
//em.remove(p);
//em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
