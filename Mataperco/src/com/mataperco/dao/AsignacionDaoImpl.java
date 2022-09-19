package com.mataperco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.connection.Conexion;
import com.mataperco.idao.IAsignacionDao;
import com.mataperco.model.Asignacion;

public class AsignacionDaoImpl implements IAsignacionDao {	
	
        
	public boolean registrar(Asignacion asignacion) {
		boolean registrar = false;
		Statement stm= null;
		Connection con= null;
		String sql="INSERT INTO tbl_asignacion (Descripcion, Horainicio_amb, Horafin_amb, Dia_asi, Fk_Tbl_Ambiente_Id_amb, Fk_Tbl_Curso_Id_cur) " + " values ('"+asignacion.getDescripcion()+"','"+asignacion.getHorainicio()+"','"+asignacion.getHorafin()+"','"+asignacion.getDia()+"'," + "'"+asignacion.getAmbiente()+"','"+asignacion.getCurso()+"')";
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase InstructorDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
	@Override
	public List<Asignacion> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="SELECT * FROM tbl_asignacion ORDER BY Id_asi";
		List<Asignacion> listaAsignacion= new ArrayList<Asignacion>();
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Asignacion c=new Asignacion();
				c.setId(rs.getInt(1));
				c.setDescripcion(rs.getString(2));
				c.setHorainicio(rs.getString(3));
				c.setHorafin(rs.getString(4));
				c.setDia(rs.getString(5));
				c.setAmbiente(rs.getInt(6));
				c.setCurso(rs.getInt(7));
				listaAsignacion.add(c);	
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase InstructorDaoImple, método obtener");
			e.printStackTrace();
		}
		return listaAsignacion;
	}
        
	@Override
	public List<Asignacion> obtenerAsignacionEspecifica(Asignacion asignacion) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="SELECT * FROM tbl_asignacion where "
                          + " Fk_Tbl_Ambiente_Id_amb='"+asignacion.getAmbiente()+"' or "
                          + " Dia_asi='"+asignacion.getDia()+"' ";
                
		List<Asignacion> listaAsignacionesp= new ArrayList<Asignacion>();
		try {		
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Asignacion c=new Asignacion();
				c.setId(rs.getInt(1));
				c.setDescripcion(rs.getString(2));
				c.setHorainicio(rs.getString(3));
				c.setHorafin(rs.getString(4));
				c.setDia(rs.getString(5));
				c.setAmbiente(rs.getInt(6));
				c.setCurso(rs.getInt(7));
				listaAsignacionesp.add(c);	
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AsignacionEspecificaDaoImple, método obtenerAsignacionEspecifica");
			e.printStackTrace();
		}
		return listaAsignacionesp;
	}
        
        @Override
        public boolean consultarAsignacion(Asignacion asignacion){
            boolean consultarAsignacion = false;
            ResultSet rs = null;
            Statement stm = null;
            Connection con = null;
            
            String sql="SELECT * FROM tbl_asignacion WHERE Id_asi="+asignacion.getId();
		try {			
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			rs.next(); 
				asignacion.setId(rs.getInt("Id_asi"));
				asignacion.setDescripcion(rs.getString("Descripcion"));
				asignacion.setHorainicio(rs.getString("Horainicio_amb"));
				asignacion.setHorafin(rs.getString("Horafin_amb"));
				asignacion.setDia(rs.getString("Dia_asi"));
				asignacion.setAmbiente(rs.getInt("Fk_Tbl_Ambiente_Id_amb"));
				asignacion.setCurso(rs.getInt("Fk_Tbl_Curso_Id_cur"));
			stm.close();
			rs.close();
			con.close();  
		} catch (SQLException e) {
			System.out.println("Error: Clase AsignacionDaoImple, método consultarAsignacion");
			e.printStackTrace();
		}
            return consultarAsignacion;
        }
        
	
	public boolean actualizar(Asignacion asignacion) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				 
		String sql="UPDATE tbl_asignacion SET"
                        + " Descripcion='"+asignacion.getDescripcion()+"', Horainicio_amb='"+asignacion.getHorainicio()+"', Horafin_amb='"+asignacion.getHorafin()+"'" +" , Dia_asi='"+asignacion.getDia()+"'" +" , Fk_Tbl_Ambiente_Id_amb='"+asignacion.getAmbiente()+"'" +" , Fk_Tbl_Curso_Id_cur='"+asignacion.getCurso()+"'WHERE Id_asi="+asignacion.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase InstructorDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
        
	
	public boolean eliminar(Asignacion asignacion) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM tbl_asignacion WHERE Id_asi="+asignacion.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase AsignacionDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}