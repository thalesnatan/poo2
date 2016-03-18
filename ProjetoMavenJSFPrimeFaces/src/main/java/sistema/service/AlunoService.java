package sistema.service;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Aluno;


public class AlunoService {

	private EntityManagerFactory emf;
	
	public AlunoService()
	{
	      emf = Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
	}
	
	public void salvar(Aluno aluno)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(aluno);
		em.getTransaction().commit();	
	    em.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Aluno> getAlunos()
	{
		List <Aluno> alunos;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Aluno a");
		alunos = q.getResultList();
		em.close();
		
		return alunos;
	}
}
