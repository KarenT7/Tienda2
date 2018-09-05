package Producto.view;

import java.util.Scanner;

import com.VentasMDD.viewGeneral.InputTypesTienda;

import Categoria.control.Categorias;
import Categoria.entity.Categoria;
import Categoria.entity.InexistenciaCategorias;
import Producto.control.Productos;
import Producto.entity.Producto;

public class ProductosView {
	private Productos productos;
private Categorias categorias;
private Scanner scanner;
	public ProductosView(Productos productos, Categorias categorias,Scanner scanner)
	{this.productos=productos;
	this.categorias=categorias;
	this.scanner = scanner;}

	public void add() throws InexistenciaCategorias {// throws InexistenciaCategorias {
		Producto producto;
		producto=RegistroProducto.ingresar(scanner,categorias);
		productos.ingresar(producto);
	}

	public void list()
	{ int codCategoria=0;
	int indiceCategoria=0;
		for(int i=0; i<productos.getCantidad();i++)
		{System.out.println(productos.getProductos()[i]);
		codCategoria=productos.getProductos()[i].getCodCategoria();
		try {
			indiceCategoria=categorias.buscarCategoria(codCategoria);
			}
		catch (InexistenciaCategorias e) {
			e.printStackTrace();}
	}
		System.out.println(categorias.getCategoria().get(indiceCategoria));
	}
	
	public void deleteProducto() 
	{int codProducto=InputTypesTienda.readInt("Ingrese el codigo del producto  a borrar", scanner);
	productos.eliminar(codProducto);
	}
	/*public Categorias getCategorias() {
		return categorias;
	}*/
	
	
}
