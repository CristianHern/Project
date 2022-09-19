package com.mataperco.controller;

import java.util.ArrayList;
import java.util.List;
import com.mataperco.dao.FichaDaoImpl;
import com.mataperco.idao.IFichaDao;
import com.mataperco.model.Ficha;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerFicha {
    
	public ControllerFicha() {
	}
	//llama al DAO para guardar un instructor
	public void registrar(Ficha ficha) {
		IFichaDao dao= new  FichaDaoImpl();
		dao.registrar(ficha);
	}
	//llama al DAO para actualizar un instructor
	public void actualizar(Ficha ficha) {
		IFichaDao dao= new  FichaDaoImpl();
		dao.actualizar(ficha);
	}
	//llama al DAO para eliminar un instructor
	public void eliminar(Ficha ficha) {
		IFichaDao dao= new  FichaDaoImpl();
		dao.eliminar(ficha);
	}
	//llama al DAO para obtener todos los instructors y luego los muestra en la vista
	public void verFicha(){
		List<Ficha> fichas = new ArrayList<Ficha>();
		IFichaDao dao= new  FichaDaoImpl();
		fichas=dao.obtener();
                 System.out.println("\tLista de datos ingresados\n");

                    for(int i = 0; i < fichas.size(); i++ ){
                        System.out.println( fichas.get(i) + "\n" );
                    }
              
	}
	//llama al DAO para obtener el instructors y luego los muestra en la vista
	public void consultarFicha(Ficha ficha){
		FichaDaoImpl dao= new  FichaDaoImpl();
		dao.consultarFicha(ficha);
	}

    

    public DefaultTableModel consultarModelFicha() {
        //Declaramos el vector o arreglo
            List<Ficha> fichas = new ArrayList<Ficha>();
		IFichaDao dao= new  FichaDaoImpl();
		fichas=dao.obtener();
                
                   DefaultTableModel tablemodel = new DefaultTableModel();
                try {
                    String[] columnNames = {"Id","Codigo","Nombre","Capacidad","Descripcion"};
                    tablemodel.setColumnIdentifiers(columnNames);
                    Object[] fila = new Object[tablemodel.getColumnCount()];

                    for (int i = 0; i < fichas.size(); i++) {            
                        fila[0] = fichas.get(i).getId();
                        fila[1] = fichas.get(i).getCodigo();
                        fila[2] = fichas.get(i).getNombre();
                        fila[3] = fichas.get(i).getCapacidad();
                        fila[4] = fichas.get(i).getDescripcion();
                        
                        tablemodel.addRow(fila);
                    }
                }catch (Exception e) {
                    System.out.println("2.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "2.- Error al extraer los datos de la tabla");
                }
                    return tablemodel;
    }   
}
