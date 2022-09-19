package com.mataperco.model;
public class Loginprueba {
        private int Id_usu;
	private String Name_usu;
	private String Password_usu;
	private int Fk_Roles_Id_rol;
	
        
	public Loginprueba() {
	}
	public Loginprueba(String id, String nombre, String clave,int rol) {
		//this.Id_ins = Id_ins;
		this.Name_usu = nombre;
		this.Password_usu = clave;
		this.Fk_Roles_Id_rol = rol;
	}
   
        public int getId() {
		return Id_usu;
	}
	public void setId(int id) {
		this.Id_usu = id;
	}
	
	public String getNombre() {
		return Name_usu;
	}
	public void setNombre(String nombre) {
		this.Name_usu = nombre;
	}
	
	public String getClave() {
		return Password_usu;
	}
	public void setClave(String clave) {
		this.Password_usu = clave;
	}
	public int getRol() {
		return Fk_Roles_Id_rol;
	}
	public void setRol(int rol) {
		this.Fk_Roles_Id_rol = rol;
	}
        
        public String toString() {
        return this.Name_usu+", "+this.Password_usu;
    }
}