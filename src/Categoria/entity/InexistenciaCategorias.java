package Categoria.entity;

public class InexistenciaCategorias extends Exception{ //excepciones siempre van en entity
	private static final long serialVersionUID =1L;
	public InexistenciaCategorias()
	{ super ("La categoria no existe");}

}
