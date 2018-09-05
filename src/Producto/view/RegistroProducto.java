package Producto.view;

import java.util.Scanner;

import com.VentasMDD.viewGeneral.InputTypesTienda;

import Categoria.control.Categorias;
import Categoria.entity.Categoria;
import Categoria.entity.InexistenciaCategorias;
import Producto.entity.Producto;

public class RegistroProducto {
	public static Producto ingresar(Scanner scanner, Categorias categorias) throws InexistenciaCategorias 
	{
		int codProducto=InputTypesTienda.readInt("Ingrese el codigo del producto:", scanner);
		String nombreProducto=InputTypesTienda.readString("Nombre:", scanner);
		double precio=InputTypesTienda.readDouble("Precio: ", scanner);
		String Descripcion=InputTypesTienda.readString("Descripcion: ", scanner);
		
		int codCategoria=InputTypesTienda.readInt("Codigo Categoria:", scanner);
		categorias.buscarCategoria(codCategoria);
	return new Producto(codProducto,nombreProducto,precio,Descripcion,codCategoria);
	}

	
}
