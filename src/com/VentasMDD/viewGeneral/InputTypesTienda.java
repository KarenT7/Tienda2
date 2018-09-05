package com.VentasMDD.viewGeneral;

import java.util.Scanner;

public class InputTypesTienda {
	public static int readInt(String mensaje,Scanner scanner)
	{
		int valor=0;
		while(true)
		{
			try

			{
				System.out.print(mensaje);
				valor=scanner.nextInt();
				scanner.nextLine();
				break;
			}
			catch(java.util.InputMismatchException e)
			{System.out.println("Debe ingresar valores numericos");
			scanner.nextLine();}
		}

		return valor;
	}

	public static String readString(String mensaje, Scanner scanner) {
		String nombre;
		while(true)
		{
			try

			{
				System.out.print(mensaje);
				nombre=scanner.nextLine();
				break;
			}
			catch(java.util.InputMismatchException e)
			{System.out.println("Debe ingresar caracteres");
			scanner.nextLine();}
		}

		return nombre;
	}

	public static double readDouble(String mensaje, Scanner scanner) {

		double valor=0;
		while(true)
		{
			try

			{
				System.out.print(mensaje);
				valor=scanner.nextDouble();
				scanner.nextLine();

				break;
			}
			catch(java.util.InputMismatchException e)
			{System.out.println("Debe ingresar valores numericos");
			scanner.nextLine();}
		}

		return valor;
	}

}
