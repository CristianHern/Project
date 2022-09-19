package com.mataperco.controller;

import java.util.ArrayList;
import java.util.List;
import com.mataperco.dao.CursoDaoImpl;
import com.mataperco.dao.InstructorDaoImpl;
import com.mataperco.idao.ICursoDao;
import com.mataperco.idao.IInstructorDao;
import com.mataperco.model.Curso;
import com.mataperco.model.CursoCombo;
import com.mataperco.model.Instructor;
import com.mataperco.model.InstructorCombo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerCurso {
    
	public ControllerCurso() {
	}
	//llama al DAO para guardar un instructor
	public void registrar(Curso curso) {
		ICursoDao dao= new  CursoDaoImpl();
		dao.registrar(curso);
	}
	//llama al DAO para actualizar un instructor
	public void actualizar(Curso curso) {
		ICursoDao dao= new  CursoDaoImpl();
		dao.actualizar(curso);
	}
	//llama al DAO para eliminar un instructor
	public void eliminar(Curso curso) {
		ICursoDao dao= new  CursoDaoImpl();
		dao.eliminar(curso);
	}
	//llama al DAO para obtener todos los instructors y luego los muestra en la vista
	public void verCurso(){
		List<Curso> cursors = new ArrayList<Curso>();
		ICursoDao dao= new  CursoDaoImpl();
		cursors=dao.obtener();
                
                 System.out.println("\tLista de datos ingresados\n");

                    for(int i = 0; i < cursors.size(); i++ ){
                        System.out.println( cursors.get(i) + "\n" );
                    }
              
	}
	//llama al DAO para obtener el instructors y luego los muestra en la vista
	public void consultarCurso(Curso curso){
		ICursoDao dao= new  CursoDaoImpl();
		dao.consultarCurso(curso);
	}
        
        public DefaultTableModel consultarModelCurso() {
            //Declaramos el vector o arreglo
            
            List<Curso> cursors = new ArrayList<Curso>();
		ICursoDao dao= new  CursoDaoImpl();
		cursors=dao.obtener();
                
                   DefaultTableModel tablemodel = new DefaultTableModel();
                try {
                    String[] columnNames = {"Id","Descripcion","Ficha","Instructor"};
                    tablemodel.setColumnIdentifiers(columnNames);
                    Object[] fila = new Object[tablemodel.getColumnCount()];

                    for (int i = 0; i < cursors.size(); i++) {            
                        fila[0] = cursors.get(i).getId();
                        fila[1] = cursors.get(i).getDescripcion();
                        fila[2] = cursors.get(i).getFicha();
                        fila[3] = cursors.get(i).getInstructor();  
                        tablemodel.addRow(fila);
                    }
                }catch (Exception e) {
                    System.out.println("2.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "2.- Error al extraer los datos de la tabla");
                }
                    return tablemodel;
        }
        
          public static DefaultComboBoxModel consultarModelComboInstructor(){
        List<Instructor> instructors = new ArrayList<Instructor>();
		IInstructorDao dao= new  InstructorDaoImpl();
		instructors=dao.obtener();
        
        DefaultComboBoxModel instructormodel = new DefaultComboBoxModel();
        try {
            instructors.forEach((instructor) -> {
                instructormodel.addElement(new InstructorCombo (instructor.getNombre(), instructor.getId()));
                //fichamodel.addElement(ficha.getCodigo()+ficha.getNombre());
           });
        } catch (Exception e) {
                    System.out.println("3.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "3.- Error al extraer los datos de la tabla, combobox");;
        }
        return instructormodel;
    }

    public static DefaultComboBoxModel consultarModelComboCurso() {
        List<Curso> Cursos = new ArrayList<Curso>();
		ICursoDao dao= new  CursoDaoImpl();
		Cursos=dao.obtener();
        
        DefaultComboBoxModel cursomodel = new DefaultComboBoxModel();
        try {
            Cursos.forEach((curso) -> {
                cursomodel.addElement(new CursoCombo (curso.getDescripcion(), curso.getId()));
                //fichamodel.addElement(ficha.getCodigo()+ficha.getNombre());
           });
        } catch (Exception e) {
                    System.out.println("3.- Exception e= " + e);
                    JOptionPane.showMessageDialog(null, "3.- Error al extraer los datos de la tabla, combobox");;
        }
        return cursomodel; //To change body of generated methods, choose Tools | Templates.
    }

}
