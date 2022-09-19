package com.mataperco.model;
public class Curso {
	private int Id_cur;
	private String Descripcion_cur;
	private int Fk_Tbl_Ficha_Codigoficha_fic;
	private int Fk_Tbl_Instructor_Id_ins;
	
	public Curso() {
	}
	public Curso(String descripcion, int ficha, int instructor) {
		this.Descripcion_cur = descripcion;
		this.Fk_Tbl_Ficha_Codigoficha_fic = ficha;
		this.Fk_Tbl_Instructor_Id_ins = instructor;
	}  
	public int getId() {
		return Id_cur;
	}
	public void setId(int id) {
		this.Id_cur = id;
	}
	public String getDescripcion() {
		return Descripcion_cur;
	}
	public void setDescripcion(String descripcion) {
		this.Descripcion_cur = descripcion;
	}
	public int getFicha() {
		return Fk_Tbl_Ficha_Codigoficha_fic;
	}
	public void setFicha(int ficha) {
		this.Fk_Tbl_Ficha_Codigoficha_fic = ficha;
	}
	public int getInstructor() {
		return Fk_Tbl_Instructor_Id_ins;
	}
	public void setInstructor(int instructor) {
		this.Fk_Tbl_Instructor_Id_ins = instructor;
	}
	@Override
	public String toString() {
		return this.Id_cur+", "+this.Descripcion_cur+", "+this.Fk_Tbl_Ficha_Codigoficha_fic+", "+this.Fk_Tbl_Instructor_Id_ins;
	}

  
}