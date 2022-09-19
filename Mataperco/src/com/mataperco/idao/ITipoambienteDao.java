package com.mataperco.idao;

import java.util.List;
import com.mataperco.model.Tipoambiente;

public interface ITipoambienteDao {
    public boolean registrar(Tipoambiente tipoambiente);
    public List<Tipoambiente> obtener();
    public boolean consultarTipoambiente(Tipoambiente tipoambiente);
    public boolean actualizar(Tipoambiente tipoambiente);
    public boolean eliminar(Tipoambiente tipoambiente);
}
