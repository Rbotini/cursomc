package com.botidev.cursomc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botidev.cursomc.domain.Categoria;

import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {
	
@RequestMapping(method = RequestMethod.GET)
public List<Categoria> listar() {
	
	Categoria cat1 = new Categoria(1,"Informatica");
	Categoria cat2 = new Categoria(2,"Papelaria");
	Categoria cat3 = new Categoria(3,"Diversos");
	
	
	List<Categoria> lista = new ArrayList<>();
	lista.add(cat1);
	lista.add(cat2);
	lista.add(cat3);
	
	return lista;
	
}


}
