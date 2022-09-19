package com.mataperco.idao;

import java.util.List;
import com.mataperco.model.Ambiente;

public interface IAmbienteDao {	
	public boolean registrar(Ambiente ambiente);
	public List<Ambiente> obtener();
	public boolean consultarAmbiente(Ambiente ambiente);
	public boolean actualizar(Ambiente ambiente);
	public boolean eliminar(Ambiente ambiente);
}