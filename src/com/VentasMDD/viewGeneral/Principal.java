package com.VentasMDD.viewGeneral;

import java.util.Scanner;

import Categoria.control.Categorias;
import Categoria.entity.InexistenciaCategorias;
import Categoria.view.CategoriaMenu;
import Categoria.view.CategoriaView;
import Producto.control.Productos;
import Producto.view.ProductoMenu;
import Producto.view.ProductosView;

public class Principal {

	public static void main(String[] args) {//throws InexistenciaCategorias {
		Scanner scanner = new Scanner(System.in);
    
	    MenuPrincipal.MenuPrincipal(scanner);	
		scanner.close();
	}

}
