package com.mataperco.idao;

import java.util.List;
import com.mataperco.model.Asignacion;

public interface IAsignacionDao {
      public boolean registrar(Asignacion asignacion);
      public List<Asignacion> obtener();
      public List<Asignacion> obtenerAsignacionEspecifica(Asignacion asignacion);
      public boolean consultarAsignacion(Asignacion asignacion);
      public boolean actualizar(Asignacion asignacion);
     public boolean eliminar(Asignacion asignacion);

}
