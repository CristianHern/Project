package com.mataperco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.connection.Conexion;
import com.mataperco.idao.IAprendizDao;
import com.mataperco.model.Aprendiz;

public class AprendizDaoImpl implements IAprendizDao {	
	@Override
        
	public boolean registrar(Aprendiz aprendiz) {
		boolean registrar = false;
		Statement stm= null;
		Connection con= null;
		String sql="INSERT INTO tbl_aprendiz (Cedula_apr, Nombre_apr, Apellido_apr, Sexo_apr, Correo_apr, Numerocontacto_apr, fk_tbl_ficha_Id_fic) " 
                        + " values ('"+aprendiz.getCedula()+"','"+aprendiz.getNombre()+"','"+aprendiz.getApellido()+"','"+aprendiz.getSexo()+"'," + "'"+aprendiz.getCorreo()+"','"+aprendiz.getNumerocontacto()+"','"+aprendiz.getIdFicha()+"')";
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AprendizDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
	@Override
	public List<Aprendiz> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="SELECT * FROM tbl_aprendiz ORDER BY Id_apr";
		List<Aprendiz> listaAprendiz= new ArrayList<Aprendiz>();
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Aprendiz c=new Aprendiz();
				c.setId(rs.getInt(1));
				c.setCedula(rs.getString(2));
				c.setNombre(rs.getString(3));
				c.setApellido(rs.getString(4));
				c.setSexo(rs.getString(5));
				c.setCorreo(rs.getString(6));
				c.setNumerocontacto(rs.getString(7));
                                c.setIdFicha(rs.getInt(8));
				
				listaAprendiz.add(c);	
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AprendizDaoImple, método obtener");
			e.printStackTrace();
		}
		return listaAprendiz;
	}
        @Override
        public boolean consultarAprendiz(Aprendiz aprendiz){
            boolean consultarAprendiz = false;
            ResultSet rs = null;
            Statement stm = null;
            Connection con = null;
            
            String sql="SELECT * FROM tbl_aprendiz WHERE Cedula_apr="+aprendiz.getCedula();
		try {			
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			rs.next(); 
				aprendiz.setId(rs.getInt("Id_apr"));
				aprendiz.setCedula(rs.getString("Cedula_apr"));
				aprendiz.setNombre(rs.getString("Nombre_apr"));
				aprendiz.setApellido(rs.getString("Apellido_apr"));
				aprendiz.setSexo(rs.getString("Sexo_apr"));
				aprendiz.setCorreo(rs.getString("Correo_apr"));
				aprendiz.setNumerocontacto(rs.getString("Numerocontacto_apr"));
                                aprendiz.setIdFicha(rs.getInt("fk_tbl_ficha_Id_fic"));
			stm.close();
			rs.close();
			con.close();  
		} catch (SQLException e) {
			System.out.println("Error: Clase AprendizDaoImple, método consultarAprendiz");
			e.printStackTrace();
		}
            return consultarAprendiz;
        }
	       
	public boolean actualizar(Aprendiz aprendiz) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				 
		String sql="UPDATE tbl_aprendiz SET"
                        + " Cedula_apr='"+aprendiz.getCedula()+"', Nombre_apr='"+aprendiz.getNombre()+"', Apellido_apr='"+aprendiz.getApellido()+"'" +" , Sexo_apr='"+aprendiz.getSexo()+"'" +" , Correo_apr='"+aprendiz.getCorreo()+"'" +" , Numerocontacto_apr='"+aprendiz.getNumerocontacto()+"'" + " , fk_tbl_ficha_Id_fic='"+aprendiz.getIdFicha()+"'"+""
                        
                        + "WHERE Id_apr="+aprendiz.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase AprendizDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
        
	
        
	public boolean eliminar(Aprendiz aprendiz) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM tbl_aprendiz WHERE Id_apr="+aprendiz.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase AprendizDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}
