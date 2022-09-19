package com.mataperco.idao;

import java.util.List;
import com.mataperco.model.Curso;

public interface ICursoDao {
    public boolean registrar(Curso curso);
    public List<Curso> obtener();
    public boolean consultarCurso(Curso curso);
    public boolean actualizar(Curso curso);
    public boolean eliminar(Curso curso);
}
