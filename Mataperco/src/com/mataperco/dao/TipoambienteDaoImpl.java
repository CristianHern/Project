package com.mataperco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.connection.Conexion;
import com.mataperco.idao.ITipoambienteDao;
import com.mataperco.model.Tipoambiente;

public class TipoambienteDaoImpl implements ITipoambienteDao {	
	@Override
        
	public boolean registrar(Tipoambiente tipoambiente) {
		boolean registrar = false;
		Statement stm= null;
		Connection con= null;
		String sql="INSERT INTO tbl_tipoambiente (Nombre_tip,Descripcion_tip) " + " values ('"+tipoambiente.getNombre()+"','"+tipoambiente.getDescripcion()+"')";
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
	public List<Tipoambiente> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="SELECT * FROM tbl_tipoambiente ORDER BY Id_tip";
		List<Tipoambiente> listaTipoambiente= new ArrayList<Tipoambiente>();
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Tipoambiente c=new Tipoambiente();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setDescripcion(rs.getString(3));
				listaTipoambiente.add(c);	
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase TipoambienteDaoImple, método obtener");
			e.printStackTrace();
		}
		return listaTipoambiente;
	}
        @Override
        public boolean consultarTipoambiente(Tipoambiente tipoambiente){
            boolean consultarTipoambiente = false;
            ResultSet rs = null;
            Statement stm = null;
            Connection con = null;
            
            String sql="SELECT * FROM tbl_tipoambiente WHERE Id_tip="+tipoambiente.getId();
		try {			
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			rs.next(); 
				tipoambiente.setId(rs.getInt("Id_tip"));
				tipoambiente.setNombre(rs.getString("Nombre_tip"));
				tipoambiente.setDescripcion(rs.getString("Descripcion_tip"));
			stm.close();
			rs.close();
			con.close();  
		} catch (SQLException e) {
			System.out.println("Error: Clase TipoambienteDaoImple, método consultarTipoambiente");
			e.printStackTrace();
		}
            return consultarTipoambiente;
        }
	@Override
	public boolean actualizar(Tipoambiente tipoambiente) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				 
		String sql="UPDATE tbl_tipoambiente SET Nombre_tip='"+tipoambiente.getNombre()+"', Descripcion_tip='"+tipoambiente.getDescripcion()+"' WHERE Id_tip="+tipoambiente.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase tipoambienteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
	@Override
	public boolean eliminar(Tipoambiente tipoambiente) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM tbl_tipoambiente WHERE Id_tip="+tipoambiente.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase TipoambienteDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
        
        
}