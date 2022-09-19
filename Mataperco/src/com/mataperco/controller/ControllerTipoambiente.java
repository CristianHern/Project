package com.mataperco.controller;

import java.util.ArrayList;
import java.util.List;
import com.mataperco.dao.TipoambienteDaoImpl;
import com.mataperco.idao.ITipoambienteDao;
import com.mataperco.model.Tipoambiente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerTipoambiente {
	public ControllerTipoambiente() {
	}
	//llama al DAO para guardar un Tipoambiente
	public void registrar(Tipoambiente tipoambiente ) {
		ITipoambienteDao dao= new  TipoambienteDaoImpl();
		dao.registrar(tipoambiente);
	}
        
        //llama al DAO para actualizar un Tipoambiente
	public void actualizar(Tipoambiente tipoambiente) {
		ITipoambienteDao dao= new  TipoambienteDaoImpl();
		dao.actualizar(tipoambiente);
	}
	//llama al DAO para eliminar un tipoambiente
	public void eliminar(Tipoambiente tipoambiente) {
		ITipoambienteDao dao= new  TipoambienteDaoImpl();
		dao.eliminar(tipoambiente);
	}
	//llama al DAO para obtener todos los tipoambiente y luego los muestra en la vista
	public void verInstructor(){
		List<Tipoambiente> tipoambientes = new ArrayList<Tipoambiente>();
		ITipoambienteDao dao= new  TipoambienteDaoImpl();
		tipoambientes=dao.obtener();
                
                 System.out.println("\tLista de datos ingresados\n");

                    for(int i = 0; i < tipoambientes.size(); i++ ){
                        System.out.println( tipoambientes.get(i) + "\n" );
                    }
              
	}
	//llama al DAO para obtener el instructors y luego los muestra en la vista
	public void consultarInstructor(Tipoambiente instructor){
		ITipoambienteDao dao= new  TipoambienteDaoImpl();
		dao.consultarTipoambiente(instructor);
                 }
        
        public DefaultTableModel consultarModelTipoambiente() {
            //Declaramos el vector o arreglo
            List<Tipoambiente> tipoambientes = new ArrayList<Tipoambiente>();
		ITipoambienteDao dao= new  TipoambienteDaoImpl();
		tipoambientes=dao.obtener();
                
                   DefaultTableModel tableModel = new DefaultTableModel();
                try {
                    String[] columnNames = {"Id","Nombre","Descripcion"};
                    tableModel.setColumnIdentifiers(columnNames);
                    Object[] fila = new Object[tableModel.getColumnCount()];

                    for (int i = 0; i < tipoambientes.size(); i++) {            
                        fila[0] = tipoambientes.get(i).getId();
                        fila[1] = tipoambientes.get(i).getNombre();
                        fila[2] = tipoambientes.get(i).getDescripcion();
                        tableModel.addRow(fila);
                    }
                }catch (Exception e) {
                    System.out.println("2.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "2.- Error al extraer los datos de la tabla");
                }
                    return tableModel;
        }

    
}
