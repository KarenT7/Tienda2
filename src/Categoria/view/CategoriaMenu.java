package Categoria.view;

import java.util.Scanner;

import com.VentasMDD.viewGeneral.InputTypesTienda;

import Categoria.entity.InexistenciaCategorias;

public class CategoriaMenu {
	private static int encabezadoCategoria(Scanner scanner)
	{
		int opcion;
		while(true)
		{
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1.Ingresar Categoria: ");
			System.out.println("2.Listar categoria: ");
			System.out.println("3.Eliminar categoria:");
			System.out.println("0.Salir");
			System.out.println();

			opcion=InputTypesTienda.readInt("¿Su Opcion?", scanner);
			if(opcion >=0 && opcion<=3)
			{return opcion;}
		}

	}
	public static void menuCategoria(Scanner scanner, CategoriaView categoriaView) {
		boolean salir=false;
		while(!salir)
		{
			switch(encabezadoCategoria(scanner))
			{
			case 0:
				salir=true;
				break;
			case 1:
				categoriaView.addCategoria();
				break;
			case 2:
				categoriaView.listCategoria();
				break;
			case 3:
				try {
					categoriaView.deleteCategoria();
				} catch (InexistenciaCategorias e) {
					System.out.println("No existe la categoria");				}
				break;
			}
		}
	}
}
