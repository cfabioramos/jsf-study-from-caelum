package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;

@ManagedBean
@ViewScoped
public class AutorBean {

	private Autor autor = new Autor();
	
	public Autor getAutor() {
		return autor;
	}

	public void gravar() {
		new DAO<Autor>(Autor.class).adiciona(this.autor);
	}
	
	public void carregarAutorPelaId() {
	    this.autor = new DAO<Autor>(Autor.class).buscaPorId(autor.getId());
	}
}
