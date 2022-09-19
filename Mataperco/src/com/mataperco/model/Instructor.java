package com.mataperco.model;

public class Instructor {
	private int Id_ins;
	private String Cedula_ins;
	private String Nombre_ins;
	private String Apellido_ins;
	private String Sexo_ins;
	private String Correo_ins;
	private String Numerocontacto_ins;
	private String Especialidad_ins;
        
	public Instructor() {
	}
	public Instructor(String cedula, String nombre, String apellido, String sexo, String correo, String numerocontacto, String especialidad) {
		//this.Id_ins = Id_ins;
		this.Cedula_ins = cedula;
		this.Nombre_ins = nombre;
		this.Apellido_ins = apellido;
		this.Sexo_ins = sexo;
		this.Correo_ins = correo;
		this.Numerocontacto_ins = numerocontacto;
		this.Especialidad_ins = especialidad;
	}
        
	public int getId() {
		return Id_ins;
	}
	public void setId(int id) {
		this.Id_ins = id;
	}
	public String getCedula() {
		return Cedula_ins;
	}
	public void setCedula(String cedula) {
		this.Cedula_ins = cedula;
	}
	public String getNombre() {
		return Nombre_ins;
	}
	public void setNombre(String nombre) {
		this.Nombre_ins = nombre;
	}
	public String getApellido() {
		return Apellido_ins;
	}
	public void setApellido(String apellido) {
		this.Apellido_ins = apellido;
	}
	public String getSexo() {
		return Sexo_ins;
	}
	public void setSexo(String sexo) {
		this.Sexo_ins = sexo;
	}
	public String getCorreo() {
		return Correo_ins;
	}
	public void setCorreo(String correo) {
		this.Correo_ins = correo;
	}
	public String getNumerocontacto() {
		return Numerocontacto_ins;
	}
	public void setNumerocontacto(String numerocontacto) {
		this.Numerocontacto_ins = numerocontacto;
	}
	public String getEspecialidad() {
		return Especialidad_ins;
	}
	public void setEspecialidad(String especialidad) {
		this.Especialidad_ins = especialidad;
	}
	@Override
	public String toString() {
		return this.Id_ins+", "+this.Cedula_ins+", "+this.Nombre_ins+", "+this.Apellido_ins+", "+this.Sexo_ins+", "+this.Correo_ins+", "+this.Numerocontacto_ins+", "+this.Especialidad_ins;
	}
}