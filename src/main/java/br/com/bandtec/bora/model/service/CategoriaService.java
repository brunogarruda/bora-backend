package br.com.bandtec.bora.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.bandtec.bora.model.entity.Categoria;
import br.com.bandtec.bora.repository.CategoriaRepositorio;;

@Service
public class CategoriaService {

	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	
	public List<Categoria> pesquisarTodasCategorias() {
		return categoriaRepositorio.findAll();
	}	
}