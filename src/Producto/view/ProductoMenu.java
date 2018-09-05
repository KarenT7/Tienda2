package Producto.view;

import java.util.Scanner;

import com.VentasMDD.viewGeneral.InputTypesTienda;

import Categoria.entity.InexistenciaCategorias;

public class ProductoMenu {
	private static int encabezado(Scanner scanner)
	{
	int opcion;
	while(true)
	{
		System.out.println("Ingrese una opcion: ");
		System.out.println("------------------- ");
		System.out.println("1.Ingresar Producto: ");
		System.out.println("2.Listar Productos: ");
		System.out.println("3.Eliminar Producto:");
		System.out.println("0.Salir");
		System.out.println();
		
		opcion=InputTypesTienda.readInt("¿Su Opcion?", scanner);
		if(opcion >=0 && opcion<=3)
		{return opcion;}
	}

	}
	public static void menuProducto(Scanner scanner, ProductosView productosview)  {
		boolean salir=false;
		while(!salir)
		{
			switch(encabezado(scanner))
			{
			case 0:
			 salir=true;
			 break;
			case 1:
				try {
					productosview.add();
				} catch (InexistenciaCategorias e) {
					System.out.println("No existe la categoria");
				}
			 break;
			case 2:
				productosview.list();
				break;
			case 3:
				productosview.deleteProducto();
				break;
			}
		}
	}
}
