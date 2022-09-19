package com.mataperco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.connection.Conexion;
import com.mataperco.idao.ICursoDao;
import com.mataperco.model.Curso;

public class CursoDaoImpl implements ICursoDao {	
	@Override
        
	public boolean registrar(Curso curso) {
		boolean registrar = false;
		Statement stm= null;
		Connection con= null;
		String sql="INSERT INTO tbl_curso (Descripcion_cur, Fk_Tbl_Ficha_Codigoficha_fic, Fk_Tbl_Instructor_Id_Ins) " + " values ('"+curso.getDescripcion()+"','"+curso.getFicha()+"','"+curso.getInstructor()+"')";
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase CursoDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
	@Override
	public List<Curso> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="SELECT * FROM tbl_curso ORDER BY Id_cur";
		List<Curso> listaCurso= new ArrayList<Curso>();
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Curso c=new Curso();
				c.setId(rs.getInt(1));
				c.setDescripcion(rs.getString(2));
				c.setFicha(rs.getInt(3));
				c.setInstructor(rs.getInt(4));
                                listaCurso.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase CursoDaoImple, método obtener");
			e.printStackTrace();
		}
		return listaCurso;
	}
        @Override
        public boolean consultarCurso(Curso curso){
            boolean consultarCurso = false;
            ResultSet rs = null;
            Statement stm = null;
            Connection con = null;
            
            String sql="SELECT * FROM tbl_curso WHERE Descripcion_cur='"+curso.getDescripcion()+"'";
            
			
		try {			
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			rs.next(); 
				curso.setId(rs.getInt("Id_cur"));
				curso.setDescripcion(rs.getString("Descripcion_cur"));
				curso.setFicha(rs.getInt("Fk_Tbl_Ficha_Codigoficha_fic"));
				curso.setInstructor(rs.getInt("Fk_Tbl_Instructor_Id_Ins"));
				
			stm.close();
			rs.close();
			con.close();  
		} catch (SQLException e) {
			System.out.println("Error: Clase CursoDaoImple, método consultarCurso");
			e.printStackTrace();
		}
            return consultarCurso;
        }
	@Override
	public boolean actualizar(Curso curso) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
			String sql = "UPDATE tbl_curso SET "
                            + " Descripcion_cur = '"+curso.getDescripcion()+"', Fk_Tbl_Ficha_Codigoficha_fic = '"+curso.getFicha()+"', "
                            + "Fk_Tbl_Instructor_Id_ins = '"+curso.getInstructor()+"'"
                            + " WHERE Id_cur = '"+curso.getId()+"'";
		
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ICursoDaoImple, método actualizarfgfgf");
			e.printStackTrace();
		}		
		return actualizar;
	}
	@Override
	public boolean eliminar(Curso curso) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM tbl_curso WHERE Id_cur="+curso.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase CursoDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}