package Producto.control;

import Producto.entity.Producto;

public class Productos {
	private Producto[] productos;
	private int cantidad;
	private int ultimo;// señala el ultimo elemento

	public Productos(int tamaño) {
		productos = new Producto[tamaño];
		cantidad = 0;
		ultimo = -1;
	}

	public void ingresar(Producto producto) throws java.lang.ArrayIndexOutOfBoundsException {
		productos[++ultimo] = producto;
		cantidad++;
	}

	public void eliminar(int codProducto) {//llamar a produycto view
		
		int indice = buscar(codProducto);
		if (indice >= 0) {
			if (indice != ultimo) {
				for (int i = indice; i < ultimo; i++) // recorre los elementos apartir de i
				{
					productos[i] = productos[i + 1];
				}
			}
			ultimo--;
			cantidad--;
		}
	}

	private int buscar(int codProducto) {
		int indice = -1;
		int i = 0;
		while (i < ultimo) {
			if (codProducto == productos[i].getCodProducto()) {
				indice = i;
				break;
			}
			i++;
		}
		return indice;
	}

	public int getCantidad() {
		return cantidad;
	}

	public Producto[] getProductos() {
		return productos;
	}
	
	
}
