package Categoria.view;

import java.util.Scanner;

import com.VentasMDD.viewGeneral.InputTypesTienda;

import Categoria.entity.Categoria;
import Producto.entity.Producto;

public class RegistroCategoria {
	public static Categoria ingresarCategoria(Scanner scanner)
	{
		int codCategoria=InputTypesTienda.readInt("Ingrese el codigo de la categoria:", scanner);
		String nombreCategoria=InputTypesTienda.readString("Nombre:", scanner);
		String Descripcion=InputTypesTienda.readString("Descripcion: ", scanner);
	return new Categoria(codCategoria,nombreCategoria,Descripcion);
	}
	
}
