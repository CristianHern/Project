package com.mataperco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.connection.Conexion;
import com.mataperco.idao.IAmbienteDao;
import com.mataperco.model.Ambiente;

public class AmbienteDaoImpl implements IAmbienteDao {	
	@Override
        
	public boolean registrar(Ambiente ambiente) {
		boolean registrar = false;
		Statement stm= null;
		Connection con= null;
		String sql="INSERT INTO tbl_ambiente (Codigo_amb, Nombre_amb, Descripcion_amb, Capacidad_amb, Estado_amb, Fk_Tbl_tipoambiente_Id_tip)" 
                + " values ('"+ambiente.getCodigo()+"','"+ambiente.getNombre()+"','"+ambiente.getDescripcion()+"',"
                +"'"+ambiente.getCapacidad()+"','"+ambiente.getEstado()+"','"+ambiente.getTipoAmbiente()+"')";
                
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AmbienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
	@Override
    
	public List<Ambiente> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		String sql="SELECT * FROM tbl_ambiente ORDER BY Id_amb";
		List<Ambiente> listaAmbiente= new ArrayList<Ambiente>();
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Ambiente c=new Ambiente();
				c.setId(rs.getInt(1));
				c.setCodigo(rs.getString(2));
				c.setNombre(rs.getString(3));
				c.setDescripcion(rs.getString(4));
				c.setCapacidad(rs.getString(5));
				c.setEstado(rs.getString(6));
                                c.setTipoAmbiente(rs.getInt(7));
				listaAmbiente.add(c);	
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AmbienteDaoImpl, método obtener");
			e.printStackTrace();
		}
		return listaAmbiente;
	}
        @Override
        public boolean consultarAmbiente(Ambiente ambiente){
            boolean consultarAmbiente = false;
            ResultSet rs = null;
            Statement stm = null;
            Connection con = null;
            
            String sql="SELECT * FROM tbl_ambiente WHERE Codigo_amb="+ambiente.getCodigo();
		try {			
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			rs.next(); 
				ambiente.setId(rs.getInt("Id_amb"));
				ambiente.setCodigo(rs.getString("Codigo_amb"));
				ambiente.setNombre(rs.getString("Nombre_amb"));
				ambiente.setDescripcion(rs.getString("Descripcion_amb"));
				ambiente.setCapacidad(rs.getString("Capacidad_amb"));
				ambiente.setEstado(rs.getString("Estado_amb"));
                                ambiente.setTipoAmbiente(rs.getInt("Fk_Tbl_tipoambiente_Id_tip"));
			stm.close();
			rs.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AmbienteDaoImple, método consultarAmbiente");
			e.printStackTrace();
		}
            return consultarAmbiente;
        }
	@Override
	public boolean actualizar(Ambiente ambiente) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				 
		String sql="UPDATE tbl_ambiente SET" + " Codigo_amb='"+ambiente.getCodigo()+"', Nombre_amb='"+ambiente.getNombre()+
                        "', Descripcion_amb='"+ambiente.getDescripcion()+"'" +" , Capacidad_amb='"+ambiente.getCapacidad()+"'" +
                        " , Estado_amb='"+ambiente.getEstado()+"'"+", Fk_Tbl_tipoambiente_Id_tip='"+ambiente.getTipoAmbiente()+"'" + "WHERE Id_amb="+ambiente.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase AmbienteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
	@Override
	public boolean eliminar(Ambiente ambiente) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM tbl_ambiente WHERE Id_amb="+ambiente.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase AmbienteDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}
