package com.mataperco.idao;
import java.util.List;
import com.mataperco.model.Ficha;
public interface IFichaDao {
        public boolean registrar(Ficha ficha);
	public List<Ficha> obtener();
	public boolean consultarFicha(Ficha ficha);
	public boolean actualizar(Ficha ficha);
	public boolean eliminar(Ficha ficha);
}
