package com.mataperco.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.connection.Conexion;
import com.mataperco.idao.ILoginpruebaDao;
import com.mataperco.model.Loginprueba;
import javax.swing.JOptionPane;

public class LoginDaoImpl implements ILoginpruebaDao {	
	
      @Override
        public boolean consultarLoginPrueba(Loginprueba loginprueba){
            boolean consultarLoginprueba = false;
            ResultSet rs = null;
            Statement stm = null;
            Connection con = null;
            //
            String sql="SELECT * FROM usuarios WHERE "
                          + " Name_usu='"+loginprueba.getNombre()+"' and "
                          + " Password_usu='"+loginprueba.getClave()+"' ";
		try {	
                    //
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
                       if (rs.next()){
                        //hay algo
				loginprueba.setId(rs.getInt("Id_usu"));
				loginprueba.setNombre(rs.getString("Name_usu"));
				loginprueba.setClave(rs.getString("Password_usu"));
                                loginprueba.setRol(rs.getInt("Fk_Roles_Id_rol"));
                            stm.close();
                            rs.close();
                            con.close();
                            consultarLoginprueba=true;
                            
                        }else{
                        //es un result set vacío
                            consultarLoginprueba=false;
                             JOptionPane.showMessageDialog(null, "Mensaje: El usuario y contraseña son incorrecto, por favor valide y vuelva a intentar");
                             
                        }
		} catch (SQLException e) {
			System.out.println("Error: Clase AmbienteDaoImple, método consultarAmbiente");
			e.printStackTrace();
		}
            return consultarLoginprueba;
        }
	
	//
}
