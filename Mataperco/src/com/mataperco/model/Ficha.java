package com.mataperco.model;


public class Ficha {
        private int Id_fic;
        private String Codigoficha_fic;
	private String Nombre_fic;
	private int Capacidad_fic;
        private String Descripcion_fic;
    
       
	public Ficha() {
	}
	public Ficha(String codigo,String nombre,int capacidad,String descripcion) {
                this.Codigoficha_fic = codigo;
		this.Nombre_fic = nombre;
                this.Capacidad_fic = capacidad;
		this.Descripcion_fic = descripcion;
	}

       
       public int getId() {
		return Id_fic;
	}
	public void setId(int id) {
		this.Id_fic = id;
	}
        public String getCodigo() {
		return Codigoficha_fic;
	}
	public void setCodigo(String codigo) {
		this.Codigoficha_fic = codigo;
	}
	public String getNombre() {
		return Nombre_fic;
	}
	public void setNombre(String nombre) {
		this.Nombre_fic = nombre;
	}
	public int getCapacidad() {
		return Capacidad_fic;
	}
	public void setCapacidad(int capacidad) {
		this.Capacidad_fic = capacidad;
	}
        public String getDescripcion() {
		return Descripcion_fic;
	}
	public void setDescripcion(String descripcion) {
		this.Descripcion_fic = descripcion;
	}
        @Override
        public String toString() {
		return this.Id_fic+", "+this.Codigoficha_fic+", "+this.Nombre_fic+", "+this.Capacidad_fic+", "+this.Descripcion_fic;
	}  

    public String setCapacidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}