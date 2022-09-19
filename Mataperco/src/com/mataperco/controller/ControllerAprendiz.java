package com.mataperco.controller;

import java.util.ArrayList;
import java.util.List;
import com.mataperco.dao.AprendizDaoImpl;
import com.mataperco.dao.FichaDaoImpl;
import com.mataperco.idao.IAprendizDao;
import com.mataperco.idao.IFichaDao;
import com.mataperco.model.Aprendiz;
import com.mataperco.model.Ficha;
import com.mataperco.model.FichaCombo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerAprendiz {
	public ControllerAprendiz() {
	}
	//llama al DAO para guardar un aprendiz
	public void registrar(Aprendiz aprendiz ) {
		IAprendizDao dao = new  AprendizDaoImpl();
		dao.registrar(aprendiz);
	}
	//llama al DAO para actualizar un aprendiz
	public void actualizar(Aprendiz aprendiz) {
		IAprendizDao dao= new  AprendizDaoImpl();
		dao.actualizar(aprendiz);
	}
	//llama al DAO para eliminar un aprendiz
	public void eliminar(Aprendiz aprendiz) {
		IAprendizDao dao= new  AprendizDaoImpl();
		dao.eliminar(aprendiz);
	}
	//llama al DAO para obtener todos los aprendizs y luego los muestra en la vista
	public void verAprendiz(){
		List<Aprendiz> aprendiz = new ArrayList<Aprendiz>();
		IAprendizDao dao= new  AprendizDaoImpl();
		aprendiz=dao.obtener();
                
                 System.out.println("\tLista de datos ingresados\n");

                    for(int i = 0; i < aprendiz.size(); i++ ){
                        System.out.println( aprendiz.get(i) + "\n" );
                    }
	}
	//llama al DAO para obtener el aprendizs y luego los muestra en la vista
	public void consultarAprendiz(Aprendiz aprendiz){
		IAprendizDao dao= new  AprendizDaoImpl();
		dao.consultarAprendiz(aprendiz);
               
	}
        
        public DefaultTableModel consultarModelAprendiz() {
            //Declaramos el vector o arreglo
            List<Aprendiz> aprendiz = new ArrayList<Aprendiz>();
		IAprendizDao dao= new  AprendizDaoImpl();
                 aprendiz = dao.obtener();
                
                   DefaultTableModel tableModel = new DefaultTableModel();
                try {
                    String[] columnNames = {"Id","Cedula","Nombre","Apellido","Sexo","Correo","Numerocontacto","IdFicha"};
                    tableModel.setColumnIdentifiers(columnNames);
                    Object[] fila = new Object[tableModel.getColumnCount()];

                    for (int i = 0; i < aprendiz.size(); i++) {            
                        fila[0] = aprendiz.get(i).getId();
                        fila[1] = aprendiz.get(i).getCedula();
                        fila[2] = aprendiz.get(i).getNombre();
                        fila[3] = aprendiz.get(i).getApellido();
                        fila[4] = aprendiz.get(i).getSexo();
                        fila[5] = aprendiz.get(i).getCorreo();
                        fila[6] = aprendiz.get(i).getNumerocontacto();       
                        fila[7] = aprendiz.get(i).getIdFicha(); 
                        
                        tableModel.addRow(fila);
                    }
                }catch (Exception e) {
                    System.out.println("2.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "2.- Error al extraer los datos de la tabla");
                }
                    return tableModel;
        }   
        
        
    public static DefaultComboBoxModel consultarModelComboFicha(){
        List<Ficha> fichas = new ArrayList<Ficha>();
		IFichaDao dao= new  FichaDaoImpl();
		fichas=dao.obtener();
        
        DefaultComboBoxModel fichamodel = new DefaultComboBoxModel();
        try {
            fichas.forEach((ficha) -> {
                fichamodel.addElement(new FichaCombo (ficha.getNombre(), ficha.getId()));
                //fichamodel.addElement(ficha.getCodigo()+ficha.getNombre());
           });
        } catch (Exception e) {
                    System.out.println("3.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "3.- Error al extraer los datos de la tabla, combobox");;
        }
        return fichamodel;
    }
}
