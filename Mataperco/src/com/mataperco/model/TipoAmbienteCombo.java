
package com.mataperco.model;


public class TipoAmbienteCombo {
     private String nombre;
    private int codigo;

    public TipoAmbienteCombo (String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString(){
      return nombre;
    }
}
