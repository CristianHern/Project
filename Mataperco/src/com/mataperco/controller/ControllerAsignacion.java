package com.mataperco.controller;

import java.util.ArrayList;
import java.util.List;
import com.mataperco.dao.AsignacionDaoImpl;
import com.mataperco.idao.IAsignacionDao;
import com.mataperco.model.Asignacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerAsignacion {
    public ControllerAsignacion() {
    }
    
    public void registrar(Asignacion asignacion) {
        IAsignacionDao dao= new  AsignacionDaoImpl();
	dao.registrar(asignacion);
    }

    public void actualizar(Asignacion asignacion) {
        IAsignacionDao dao= new  AsignacionDaoImpl();
	dao.actualizar(asignacion);
    }

    public void eliminar(Asignacion asignacion) {
        IAsignacionDao dao= new  AsignacionDaoImpl();
	dao.eliminar(asignacion);
    }
    
    public void verAsignacion(){
		List<Asignacion> asignacions = new ArrayList<Asignacion>();
		IAsignacionDao dao= new  AsignacionDaoImpl();
		asignacions=dao.obtener();
                
                 System.out.println("\tLista de datos ingresados\n");

                    for(int i = 0; i < asignacions.size(); i++ ){
                        System.out.println( asignacions.get(i) + "\n" );
                    }
              
	}
    
    public void consultarAsignacion(Asignacion asignacion){
		IAsignacionDao dao= new  AsignacionDaoImpl();
	        dao.consultarAsignacion(asignacion);
		//vista.verTipoambiente(tipoambiente);
	}
    
    public DefaultTableModel consultarModelAsignacion() {
            //Declaramos el vector o arreglo
            List<Asignacion> asignacions = new ArrayList<Asignacion>();
		IAsignacionDao dao= new  AsignacionDaoImpl();
		asignacions=dao.obtener();
                
                   DefaultTableModel tableModel = new DefaultTableModel();
                try {
                    String[] columnNames = {"Id","Descripcion","Horainicio","Horafin","Dia","Ambiente","Curso"};
                    tableModel.setColumnIdentifiers(columnNames);
                    Object[] fila = new Object[tableModel.getColumnCount()];
                        for (int i = 0; i < asignacions.size(); i++) {            
                            fila[0] = asignacions.get(i).getId();
                            fila[1] = asignacions.get(i).getDescripcion();
                            fila[2] = asignacions.get(i).getHorainicio();
                            fila[3] = asignacions.get(i).getHorafin();
                            fila[4] = asignacions.get(i).getDia();
                            fila[5] = asignacions.get(i).getAmbiente();
                            fila[6] = asignacions.get(i).getCurso();
                            tableModel.addRow(fila);
                        }
                }catch (Exception e) {
                    System.out.println("2.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "2.- Error al extraer los datos de la tabla");
                }
                    return tableModel;
        }
    
    
    public DefaultTableModel consultarModelAsignacionEspecifica(Asignacion asignacion) {
            //Declaramos el vector o arreglo
            List<Asignacion> asignacions = new ArrayList<Asignacion>();
		IAsignacionDao dao= new  AsignacionDaoImpl();
		asignacions=dao.obtenerAsignacionEspecifica(asignacion);
                
                   DefaultTableModel tableModel = new DefaultTableModel();
                try {
                    String[] columnNames = {"Id","Descripcion","Horainicio","Horafin","Dia","Ambiente","Curso"};
                    tableModel.setColumnIdentifiers(columnNames);
                    Object[] fila = new Object[tableModel.getColumnCount()];
                        for (int i = 0; i < asignacions.size(); i++) {            
                            fila[0] = asignacions.get(i).getId();
                            fila[1] = asignacions.get(i).getDescripcion();
                            fila[2] = asignacions.get(i).getHorainicio();
                            fila[3] = asignacions.get(i).getHorafin();
                            fila[4] = asignacions.get(i).getDia();
                            fila[5] = asignacions.get(i).getAmbiente();
                            fila[6] = asignacions.get(i).getCurso();
                            tableModel.addRow(fila);
                        }
                }catch (Exception e) {
                    System.out.println("2.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "2.- Error al extraer los datos de la tabla");
                }
                    return tableModel;
        }
}
