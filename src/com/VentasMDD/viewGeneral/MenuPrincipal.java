package com.VentasMDD.viewGeneral;

import java.util.Scanner;

import Categoria.control.Categorias;
import Categoria.entity.InexistenciaCategorias;
import Categoria.view.CategoriaMenu;
import Categoria.view.CategoriaView;
import Producto.control.Productos;
import Producto.view.ProductoMenu;
import Producto.view.ProductosView;

public class MenuPrincipal {
	private static int encabezadoPrincipal(Scanner scanner)
	{
		int opcion;
		while(true)
		{
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1.CATEGORIA ");
			System.out.println("2.PRODUCTOS ");
			System.out.println("0.SALIR");
			opcion=InputTypesTienda.readInt("¿Su Opcion?", scanner);
			if(opcion >=0 && opcion<=3)
			{return opcion;}
		}
	}


	public static void MenuPrincipal(Scanner scanner)
	{Categorias categorias= new Categorias();
	Productos productos= new Productos(10);
	ProductosView productosView = new ProductosView(productos, categorias,scanner);
	CategoriaView categoriaView = new CategoriaView(categorias,productos, scanner);
	//Categoria.view.CategoriaMenu.menuCategoria(scanner, categoriaView);
	//Producto.view.ProductoMenu.menuProducto(scanner, productosView);
	boolean salir=false;
	while(!salir)
	{
		switch(encabezadoPrincipal(scanner))
		{
		case 0:
			salir=true;
			break;
		case 1:
			CategoriaMenu.menuCategoria(scanner, categoriaView);
			break;
		case 2:
			ProductoMenu.menuProducto(scanner, productosView);
			break;

		}
	}
	}
}
