package Categoria.view;

import java.util.Iterator;
import java.util.Scanner;

import com.VentasMDD.viewGeneral.InputTypesTienda;

import Categoria.control.Categorias;
import Categoria.entity.Categoria;
import Categoria.entity.InexistenciaCategorias;
import Producto.control.Productos;
import Producto.entity.Producto;
import Producto.view.RegistroProducto;

public class CategoriaView {
	private Categorias categorias;
	private Scanner scanner;
	private Productos productos;

	public CategoriaView(Categorias categorias, Productos productos,Scanner scanner)
	{this.categorias=categorias;
	this.productos=productos;
	this.scanner=scanner;}

	public void addCategoria() {
		Categoria categoria;
		categoria=RegistroCategoria.ingresarCategoria(scanner);
		categorias.ingresarCategoria(categoria);
	}

	public void listCategoria()
	{for(Iterator<Categoria> i= categorias.getCategoria().iterator();i.hasNext();)
		System.out.println(i.next());}

	public void deleteCategoria() throws InexistenciaCategorias
	{int codCategoria=InputTypesTienda.readInt("Ingrese el codigo de la Categoria a borra", scanner);
	categorias.eliminarCategoria(codCategoria);
	}


	public void ListaProducto() throws InexistenciaCategorias
	{int codCategoria=InputTypesTienda.readInt("Codigo Categoria", scanner);
	System.out.println(categorias.getCategoria().get(categorias.buscarCategoria(codCategoria)));
	for(int i=0; i<productos.getCantidad();i++)	{
		if(codCategoria ==productos.getProductos()[i].getCodCategoria())
			System.out.println(productos.getProductos()[i]);
	}

	}

}
