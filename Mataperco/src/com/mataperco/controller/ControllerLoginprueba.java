package com.mataperco.controller;

import com.mataperco.dao.LoginDaoImpl;
import com.mataperco.idao.ILoginpruebaDao;
import com.mataperco.model.Loginprueba;

public class ControllerLoginprueba {
    
	public ControllerLoginprueba() {
	}
	
	//llama al DAO para obtener el instructors y luego los muestra en la vista
	public boolean consultarLoginprueba(Loginprueba loginprueba){
            boolean resultado =false;
		ILoginpruebaDao dao= new  LoginDaoImpl();
		resultado= dao.consultarLoginPrueba(loginprueba);
                return resultado;
	}
       

}
