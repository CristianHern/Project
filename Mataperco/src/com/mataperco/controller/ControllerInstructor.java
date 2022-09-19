package com.mataperco.controller;

import java.util.ArrayList;
import java.util.List;
import com.mataperco.dao.InstructorDaoImpl;
import com.mataperco.idao.IInstructorDao;
import com.mataperco.model.Instructor;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class ControllerInstructor {
	public ControllerInstructor() {
	}
	//llama al DAO para guardar un instructor
	public void registrar(Instructor instructor ) {
		IInstructorDao dao= new  InstructorDaoImpl();
		dao.registrar(instructor);
	}
	//llama al DAO para actualizar un instructor
	public void actualizar(Instructor instructor) {
		IInstructorDao dao= new  InstructorDaoImpl();
		dao.actualizar(instructor);
	}
	//llama al DAO para eliminar un instructor
	public void eliminar(Instructor instructor) {
		IInstructorDao dao= new  InstructorDaoImpl();
		dao.eliminar(instructor);
	}
	//llama al DAO para obtener todos los instructors y luego los muestra en la vista
	public void verInstructor(){
		List<Instructor> instructors = new ArrayList<Instructor>();
		IInstructorDao dao= new  InstructorDaoImpl();
		instructors=dao.obtener();
                
                 System.out.println("\tLista de datos ingresados\n");

                    for(int i = 0; i < instructors.size(); i++ ){
                        System.out.println( instructors.get(i) + "\n" );
                    }
              
	}
	//llama al DAO para obtener el instructors y luego los muestra en la vista
	public void consultarInstructor(Instructor instructor){
		IInstructorDao dao= new  InstructorDaoImpl();
		dao.consultarInstructor(instructor);
	}
        
        public DefaultTableModel consultarModelInstrutores() {
            //Declaramos el vector o arreglo
            List<Instructor> instructors = new ArrayList<Instructor>();
		IInstructorDao dao= new  InstructorDaoImpl();
		instructors=dao.obtener();
                
                   DefaultTableModel tableModel = new DefaultTableModel();
                try {
                    String[] columnNames = {"Id","Cedula","Nombre","Apellido","Sexo","Correo","Numerocontacto","Especialidad"};
                    tableModel.setColumnIdentifiers(columnNames);
                    Object[] fila = new Object[tableModel.getColumnCount()];

                    for (int i = 0; i < instructors.size(); i++) {            
                        fila[0] = instructors.get(i).getId();
                        fila[1] = instructors.get(i).getCedula();
                        fila[2] = instructors.get(i).getNombre();
                        fila[3] = instructors.get(i).getApellido();
                        fila[4] = instructors.get(i).getSexo();
                        fila[5] = instructors.get(i).getCorreo();
                        fila[6] = instructors.get(i).getNumerocontacto();
                        fila[7] = instructors.get(i).getEspecialidad();
                        tableModel.addRow(fila);
                    }
                }catch (Exception e) {
                    System.out.println("2.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "2.- Error al extraer los datos de la tabla");
                }
                    return tableModel;
        }
}