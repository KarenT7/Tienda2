package Categoria.entity;

import Producto.entity.Producto;

public class Categoria {
	private int codCategoria;
	private String nombreCategoria;
    private String DescripcionCategoria;
	public Categoria(int codCategoria, String nombreCategoria, String descripcionCategoria) {
		super();
		this.codCategoria = codCategoria;
		this.nombreCategoria = nombreCategoria;
		DescripcionCategoria = descripcionCategoria;
	}
	public Integer getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public String getDescripcionCategoria() {
		return DescripcionCategoria;
	}
	public void setDescripcionCategoria(String descripcionCategoria) {
		DescripcionCategoria = descripcionCategoria;
	}
	@Override
	public String toString() {
		return "Categoria [codCategoria=" + codCategoria + ", nombreCategoria=" + nombreCategoria
				+ ", DescripcionCategoria=" + DescripcionCategoria + "]";
	}
	
	
	
    
}
