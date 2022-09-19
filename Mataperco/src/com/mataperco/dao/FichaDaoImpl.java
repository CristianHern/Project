package com.mataperco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.connection.Conexion;
import com.mataperco.idao.IFichaDao;
import com.mataperco.model.Ficha;


public class FichaDaoImpl implements IFichaDao {	
	@Override
        
	public boolean registrar(Ficha ficha) {
		boolean registrar = false;
		Statement stm= null;
		Connection con= null;
		String sql="INSERT INTO tbl_ficha (Codigoficha_fic, Nombre_fic, Capacidad_fic, Descripcion_fic) " + " values ('"+ficha.getCodigo()+"','"+ficha.getNombre()+"','"+ficha.getCapacidad()+"','"+ficha.getDescripcion()+"')";
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase FichaDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
	@Override
	public List<Ficha> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="SELECT * FROM tbl_ficha ORDER BY Id_fic";
                    List<Ficha> listaFicha= new ArrayList<Ficha>();
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Ficha c=new Ficha();
				c.setId(rs.getInt(1));
				c.setCodigo(rs.getString(2));
				c.setNombre(rs.getString(3));
				c.setCapacidad(rs.getInt(4));
				c.setDescripcion(rs.getString(5));
				
				listaFicha.add(c);	
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase FichaDaoImple, método obtener");
			e.printStackTrace();
		}
		return listaFicha;
	}
        @Override
        public boolean consultarFicha(Ficha ficha){
            boolean consultarFicha = false;
            ResultSet rs = null;
            Statement stm = null;
            Connection con = null;
            
            String sql="SELECT * FROM tbl_ficha WHERE Codigoficha_fic="+ficha.getCodigo();
		try {			
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			rs.next(); 
				ficha.setId(rs.getInt("Id_fic"));
				ficha.setCodigo(rs.getString("Codigoficha_fic"));
				ficha.setNombre(rs.getString("Nombre_fic"));
                                ficha.setCapacidad(rs.getInt("Capacidad_fic"));
				ficha.setDescripcion(rs.getString("Descripcion_fic"));
				
			stm.close();
			rs.close();
			con.close();  
		} catch (SQLException e) {
			System.out.println("Error: Clase FichaDaoImple, método consultarFicha");
			e.printStackTrace();
		}
            return consultarFicha;
        }
	@Override
	public boolean actualizar(Ficha ficha) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				 
		String sql="UPDATE tbl_ficha SET"
                        + "'Codigo_fic='"+ficha.getCodigo()+"', Nombre_fic='"+ficha.getNombre()+"', Capacidad_fic='"+ficha.getCapacidad()+"'" +" , Descripcion_fic='"+ficha.getDescripcion()+"'"
                        
                        + "WHERE Id_fic="+ficha.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase FichaDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
	@Override
	public boolean eliminar(Ficha ficha) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM tbl_ficha WHERE Id_fic="+ficha.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase FichaDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
   
}