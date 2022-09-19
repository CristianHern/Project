package com.mataperco.idao;

import java.util.List;
import com.mataperco.model.Aprendiz;

public interface IAprendizDao {
        public boolean registrar(Aprendiz aprendiz);
	public List<Aprendiz> obtener();
	public boolean consultarAprendiz(Aprendiz aprendiz);
	public boolean actualizar(Aprendiz aprendiz);
	public boolean eliminar(Aprendiz aprendiz);
}
