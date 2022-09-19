package com.mataperco.model;

public class Ambiente {
	private int Id_amb;
	private String Codigo_amb;
	private String Nombre_amb;
	private String Descripcion_amb;
	private String Capacidad_amb;
        private String Estado_amb;
	private int Fk_Tbl_tipoambiente_Id_tip;
	
	public Ambiente() {
	}
	public Ambiente(String codigo, String nombre, String descripcion, String capacidad, String estado, int tipoambiente) {           
		this.Codigo_amb = codigo;
		this.Nombre_amb = nombre;
		this.Descripcion_amb = descripcion;
		this.Capacidad_amb = capacidad;
		this.Estado_amb = estado;
		this.Fk_Tbl_tipoambiente_Id_tip = tipoambiente;		
	}
   
	public int getId() {
		return Id_amb;
	}
	public void setId(int id) {
		this.Id_amb = id;
	}
	public String getCodigo() {
		return Codigo_amb;
	}
	public void setCodigo(String codigo) {
		this.Codigo_amb = codigo;
	}
	public String getNombre() {
		return Nombre_amb;
	}
	public void setNombre(String nombre) {
		this.Nombre_amb = nombre;
	}
	public String getDescripcion() {
		return Descripcion_amb;
	}
	public void setDescripcion(String descripcion) {
		this.Descripcion_amb = descripcion;
	}
	public String getCapacidad() {
		return Capacidad_amb;
	}
	public void setCapacidad(String capacidad) {
		this.Capacidad_amb = capacidad;
	}
	public String getEstado() {
		return Estado_amb;
	}
	public void setEstado(String estado) {
		this.Estado_amb = estado;
	}
        public int getTipoAmbiente() {
		return Fk_Tbl_tipoambiente_Id_tip;
	}
	public void setTipoAmbiente(int tipoambiente) {
		this.Fk_Tbl_tipoambiente_Id_tip = tipoambiente;
	}
	@Override
        
	public String toString() {
		return this.Id_amb+", "+this.Codigo_amb+", "+this.Nombre_amb+", "+this.Descripcion_amb+", "+this.Capacidad_amb+", "+this.Estado_amb+", "+this.Fk_Tbl_tipoambiente_Id_tip;
	}    

}