package br.com.caelum.livraria.bean;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Livro;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();
	
	private Integer autorSelecionado;
	
	public Integer getAutorSelecionado() {
		return autorSelecionado;
	}
	
	public void setAutorSelecionado(Integer autorSelecionado) {
		this.autorSelecionado = autorSelecionado;
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());

//		if (livro.getAutores().isEmpty()) {
//			throw new RuntimeException("Livro deve ter pelo menos um Autor.");
//		}
//
//		new DAO<Livro>(Livro.class).adiciona(this.livro);
	}
	
	public List<Autor> todosAutores() {
		return new DAO<Autor>(Autor.class).listaTodos();
	}
	
	public Map<String, Integer> getMapAutores() {
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("Autor 1", 1);
		map.put("Autor 2", 2);
		map.put("Autor 3", 3);
		map.put("Autor 4", 4);
		map.put("Autor 5", 5);
		
		return map;
	}

}
