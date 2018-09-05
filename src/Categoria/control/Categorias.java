package Categoria.control;

import java.util.ArrayList;
import java.util.Iterator;

import Categoria.entity.Categoria;
import Categoria.entity.InexistenciaCategorias;

public class Categorias {
	private ArrayList<Categoria> categorias;

	private int ultimo;// señala el ultimo elemento

	public Categorias() 
	{categorias = new ArrayList<Categoria>();}

	public void ingresarCategoria(Categoria categoria)
	{categorias.add(categoria);}

	public void eliminarCategoria(int codCategoria) throws InexistenciaCategorias {//llamar a produycto view
		int indice = buscarCategoria(codCategoria);
		categorias.remove(indice);}


	public int buscarCategoria(int codCategoria) throws InexistenciaCategorias {
		int indice = -1;
		Categoria categoria=null;

		for (Iterator<Categoria> iterator=categorias.iterator(); iterator.hasNext();) {
			categoria=iterator.next();
			if(codCategoria==categoria.getCodCategoria())
			{indice=categorias.indexOf(categoria);}
			break;
		}



		if(indice<0)
		{throw new InexistenciaCategorias();}
		return indice;}


	public ArrayList<Categoria> getCategoria() {
		return categorias;
	}	


}
