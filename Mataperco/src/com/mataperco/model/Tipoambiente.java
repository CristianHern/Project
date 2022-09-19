package com.mataperco.model;
public class Tipoambiente {
	private int Id_tip;
	private String Nombre_tip;
	private String Descripcion_tip;

	public Tipoambiente() {
	}
	public Tipoambiente(String nombre,String descripcion) {
		this.Nombre_tip = nombre;
		this.Descripcion_tip = descripcion;
	}
        
	public int getId() {
		return Id_tip;
	}
	public void setId(int id) {
		this.Id_tip = id;
	}
	public String getNombre() {
		return Nombre_tip;
	}
	public void setNombre(String nombre) {
		this.Nombre_tip = nombre;
	}
	public String getDescripcion() {
		return Descripcion_tip;
	}
	public void setDescripcion(String descripcion) {
		this.Descripcion_tip = descripcion;
	}

	@Override
	public String toString() {
		return this.Id_tip+", "+this.Nombre_tip+", "+this.Descripcion_tip;
	}
}