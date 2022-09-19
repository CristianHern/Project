package com.mataperco.model;
public class Aprendiz {
	private int Id_apr;
	private String Cedula_apr;
	private String Nombre_apr;
	private String Apellido_apr;
	private String Sexo_apr;
	private String Correo_apr;
	private String Contacto_apr;
	private int fk_tbl_ficha_Id_fic;
        
	public Aprendiz() {
	}
        
	public Aprendiz(String cedula, String nombre, String apellido, String sexo, String correo, String contacto, int Idfic) {
	
		this.Cedula_apr = cedula;
		this.Nombre_apr = nombre;
		this.Apellido_apr = apellido;
		this.Sexo_apr = sexo;
		this.Correo_apr = correo;
		this.Contacto_apr = contacto;
		this.fk_tbl_ficha_Id_fic = Idfic;
	}
        
	public int getId() {
		return Id_apr;
	}
	public void setId(int id) {
		this.Id_apr = id;
	}
	public String getCedula() {
		return Cedula_apr;
	}
	public void setCedula(String cedula) {
		this.Cedula_apr = cedula;
	}
	public String getNombre() {
		return Nombre_apr;
	}
	public void setNombre(String nombre) {
		this.Nombre_apr = nombre;
	}
        
	public String getApellido() {
		return Apellido_apr;
	}
	public void setApellido(String apellido) {
		this.Apellido_apr = apellido;
	}
	public String getSexo() {
		return Sexo_apr;
	}
	public void setSexo(String sexo) {
		this.Sexo_apr = sexo;
	}
	public String getCorreo() {
		return Correo_apr;
	}
	public void setCorreo(String correo) {
		this.Correo_apr = correo;
	}
	public String getNumerocontacto() {
		return Contacto_apr;
	}
	public void setNumerocontacto(String contacto) {
		this.Contacto_apr = contacto;
	}
	public int getIdFicha() {
		return fk_tbl_ficha_Id_fic;
	}
	public void setIdFicha(int Idfic) {
		this.fk_tbl_ficha_Id_fic = Idfic;
	}
	@Override
	public String toString() {
		return this.Id_apr+", "+this.Cedula_apr+", "+this.Nombre_apr+", "+this.Apellido_apr+", "+this.Sexo_apr+", "+this.Correo_apr+", "+this.Contacto_apr+", "+this.fk_tbl_ficha_Id_fic;
	}

}