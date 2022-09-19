package com.mataperco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.connection.Conexion;
import com.mataperco.idao.IInstructorDao;
import com.mataperco.model.Instructor;

public class InstructorDaoImpl implements IInstructorDao{	
	@Override
        
	public boolean registrar(Instructor instructor) {
		boolean registrar = false;
		Statement stm= null;
		Connection con= null;
		String sql="INSERT INTO tbl_instructor (Cedula_ins, Nombre_ins, Apellido_ins, Sexo_ins, Correo_ins, Numerocontacto_ins, Especialidad_ins) " + " values ('"+instructor.getCedula()+"','"+instructor.getNombre()+"','"+instructor.getApellido()+"','"+instructor.getSexo()+"'," + "'"+instructor.getCorreo()+"','"+instructor.getNumerocontacto()+"','"+instructor.getEspecialidad()+"')";
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
	public List<Instructor> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="SELECT * FROM tbl_instructor ORDER BY Id_ins";
		List<Instructor> listaInstructor= new ArrayList<Instructor>();
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Instructor c=new Instructor();
				c.setId(rs.getInt(1));
				c.setCedula(rs.getString(2));
				c.setNombre(rs.getString(3));
				c.setApellido(rs.getString(4));
				c.setSexo(rs.getString(5));
				c.setCorreo(rs.getString(6));
				c.setNumerocontacto(rs.getString(7));
				c.setEspecialidad(rs.getString(8));
				listaInstructor.add(c);	
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase InstructorDaoImple, método obtener");
			e.printStackTrace();
		}
		return listaInstructor;
	}
        @Override
        public boolean consultarInstructor(Instructor instructor){
            boolean consultarInstructor = false;
            ResultSet rs = null;
            Statement stm = null;
            Connection con = null;
            
            String sql="SELECT * FROM tbl_instructor WHERE Cedula_ins="+instructor.getCedula();
		try {			
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			rs.next(); 
				instructor.setId(rs.getInt("Id_ins"));
				instructor.setCedula(rs.getString("Cedula_ins"));
				instructor.setNombre(rs.getString("Nombre_ins"));
				instructor.setApellido(rs.getString("Apellido_ins"));
				instructor.setSexo(rs.getString("Sexo_ins"));
				instructor.setCorreo(rs.getString("Correo_ins"));
				instructor.setNumerocontacto(rs.getString("Numerocontacto_ins"));
				instructor.setEspecialidad(rs.getString("Especialidad_ins"));
			stm.close();
			rs.close();
			con.close();  
		} catch (SQLException e) {
			System.out.println("Error: Clase InstructorDaoImple, método consultarInstructor");
			e.printStackTrace();
		}
            return consultarInstructor;
        }
	@Override
	public boolean actualizar(Instructor instructor) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				 
		String sql="UPDATE tbl_instructor SET"
                        + " Cedula_ins='"+instructor.getCedula()+"', Nombre_ins='"+instructor.getNombre()+"', Apellido_ins='"+instructor.getApellido()+"'" +" , Sexo_ins='"+instructor.getSexo()+"'" +" , Correo_ins='"+instructor.getCorreo()+"'" +" , Numerocontacto_ins='"+instructor.getNumerocontacto()+"'" +" , Especialidad_ins='"+instructor.getEspecialidad()+"'" +" "
                        
                        + "WHERE Id_ins="+instructor.getId();
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
	@Override
	public boolean eliminar(Instructor instructor) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM tbl_instructor WHERE Id_ins="+instructor.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase InstructorDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}