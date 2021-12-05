package br.com.casadocodigo.loja.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.casadocodigo.daos.LivroDao;
import br.com.casadocodigo.domain.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();

	@Inject
	private LivroDao dao;
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public void salvar() {
		dao.salvar(livro);
		System.out.println("Livro cadastrado com sucesso! " + livro);
	}
}
