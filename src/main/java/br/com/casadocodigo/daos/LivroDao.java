package br.com.casadocodigo.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.domain.Livro;

public class LivroDao {

	@PersistenceContext
	private EntityManager maneger;
	
	public void salvar (Livro livro) {
		maneger.persist(livro);
	}
}
