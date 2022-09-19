package com.mataperco.controller;

import java.util.ArrayList;
import java.util.List;
import com.mataperco.dao.AmbienteDaoImpl;
import com.mataperco.dao.TipoambienteDaoImpl;
import com.mataperco.idao.IAmbienteDao;
import com.mataperco.idao.ITipoambienteDao;
import com.mataperco.model.Ambiente;
import com.mataperco.model.AmbienteCombo;
import com.mataperco.model.TipoAmbienteCombo;
import com.mataperco.model.Tipoambiente;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerAmbiente {

	public ControllerAmbiente() {
	}
	//llama al DAO para guardar un instructor
	public void registrar(Ambiente ambiente) {
		IAmbienteDao dao= new AmbienteDaoImpl();
		dao.registrar(ambiente);
	}
	//llama al DAO para actualizar un instructor
	public void actualizar(Ambiente ambiente) {
		IAmbienteDao dao= new  AmbienteDaoImpl();
		dao.actualizar(ambiente);
	}
	//llama al DAO para eliminar un instructor
	public void eliminar(Ambiente ambiente) {
		IAmbienteDao dao= new  AmbienteDaoImpl();
		dao.eliminar(ambiente);
	}
	//llama al DAO para obtener todos los instructors y luego los muestra en la vista
	public void verAmbiente(){
		List<Ambiente> ambientes = new ArrayList<Ambiente>();
		IAmbienteDao dao= new  AmbienteDaoImpl();
		ambientes=dao.obtener();
                
                 System.out.println("\tLista de datos ingresados\n");

                    for(int i = 0; i < ambientes.size(); i++ ){
                        System.out.println( ambientes.get(i) + "\n" );
                    }
              
	}
	//llama al DAO para obtener el instructors y luego los muestra en la vista
	public void consultarAmbiente(Ambiente ambiente){
		IAmbienteDao dao= new  AmbienteDaoImpl();
		dao.consultarAmbiente(ambiente);
	}
        
        public DefaultTableModel consultarModelAmbiente() {
            //Declaramos el vector o arreglo
            List<Ambiente> ambientes = new ArrayList<Ambiente>();
		IAmbienteDao dao= new  AmbienteDaoImpl();
		ambientes=dao.obtener();
                
                   DefaultTableModel tableModel = new DefaultTableModel();
                try {
                    String[] columnNames = {"Id","Codigo","Nombre","Descripcion","Capacidad","Estado","TipoAmbiente"};
                    tableModel.setColumnIdentifiers(columnNames);
                    Object[] fila = new Object[tableModel.getColumnCount()];

                    for (int i = 0; i < ambientes.size(); i++) {            
                        fila[0] = ambientes.get(i).getId();
                        fila[1] = ambientes.get(i).getCodigo();
                        fila[2] = ambientes.get(i).getNombre();
                        fila[3] = ambientes.get(i).getDescripcion();
                        fila[4] = ambientes.get(i).getCapacidad();
                        fila[5] = ambientes.get(i).getEstado();
                        fila[6] = ambientes.get(i).getTipoAmbiente();
                        
                        tableModel.addRow(fila);
                    }
                }catch (Exception e) {
                    System.out.println("2.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "2.- Error al extraer los datos de la tabla");
                }
                    return tableModel;
        }

      public static DefaultComboBoxModel consultarModelComboTipoAmbiente(){
        List<Tipoambiente> tipoambientes = new ArrayList<Tipoambiente>();
		ITipoambienteDao dao= new  TipoambienteDaoImpl();
		tipoambientes=dao.obtener();
        
        DefaultComboBoxModel tipoambientemodel = new DefaultComboBoxModel();
        try {
            tipoambientes.forEach((tipoa) -> {
                tipoambientemodel.addElement(new TipoAmbienteCombo (tipoa.getNombre(), tipoa.getId()));
                //fichamodel.addElement(ficha.getCodigo()+ficha.getNombre());
           });
        } catch (Exception e) {
                    System.out.println("3.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "3.- Error al extraer los datos de la tabla, combobox");;
        }
        return tipoambientemodel;
    }

    public static DefaultComboBoxModel consultarModelComboAmbiente() {
         List<Ambiente> ambientes = new ArrayList<Ambiente>();
		IAmbienteDao dao= new  AmbienteDaoImpl();
		ambientes=dao.obtener();
        
        DefaultComboBoxModel ambientemodel = new DefaultComboBoxModel();
        try {
            ambientes.forEach((ambiente) -> {
                ambientemodel.addElement(new AmbienteCombo (ambiente.getNombre(), ambiente.getId()));
                //fichamodel.addElement(ficha.getCodigo()+ficha.getNombre());
           });
        } catch (Exception e) {
                    System.out.println("3.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "3.- Error al extraer los datos de la tabla, combobox");;
        }
        return ambientemodel;
    }
   
}
