package com.mataperco.idao;

import java.util.List;
import com.mataperco.model.Instructor;

public interface IInstructorDao {	
	public boolean registrar(Instructor instructor);
	public List<Instructor> obtener();
	public boolean consultarInstructor(Instructor instructor);
	public boolean actualizar(Instructor instructor);
	public boolean eliminar(Instructor instructor);
}