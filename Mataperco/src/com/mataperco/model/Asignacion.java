package com.mataperco.model;
public class Asignacion {
	private int Id_asi;
	private String Descripcion;
	private String Horainicio_amb;
	private String Horafin_amb;
	private String Dia_asi;
	private int Fk_Tbl_Ambiente_Id_amb;
	private int Fk_Tbl_Curso_Id_cur;
        
	public Asignacion() {
	}
	public Asignacion(String descripcion, String horainicio, String horafin, String dia, int ambiente, int curso) {
		
		this.Descripcion = descripcion;
		this.Horainicio_amb = horainicio;
		this.Horafin_amb = horafin;
		this.Dia_asi = dia;
		this.Fk_Tbl_Ambiente_Id_amb = ambiente;
		this.Fk_Tbl_Curso_Id_cur = curso;
		
	}
        
	public int getId() {
		return Id_asi;
	}
	public void setId(int id) {
		this.Id_asi = id;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}
	public String getHorainicio() {
		return Horainicio_amb;
	}
	public void setHorainicio(String horainicio) {
		this.Horainicio_amb = horainicio;
	}
	public String getHorafin() {
		return Horafin_amb;
	}
	public void setHorafin(String horafin) {
		this.Horafin_amb = horafin;
	}
	public String getDia() {
		return Dia_asi;
	}
	public void setDia(String dia) {
		this.Dia_asi = dia;
	}
	public int getAmbiente() {
		return Fk_Tbl_Ambiente_Id_amb;
	}
	public void setAmbiente(int ambiente) {
		this.Fk_Tbl_Ambiente_Id_amb = ambiente;
	}
	public int getCurso() {
		return Fk_Tbl_Curso_Id_cur;
	}
	public void setCurso(int curso) {
		this.Fk_Tbl_Curso_Id_cur = curso;
	}
	
	@Override
	public String toString() {
		return this.Id_asi+", "+this.Descripcion+", "+this.Horainicio_amb+", "+this.Horafin_amb+", "+this.Dia_asi+", "+this.Fk_Tbl_Ambiente_Id_amb+", "+this.Fk_Tbl_Curso_Id_cur;
	}
}
