
package com.mataperco.model;


public class AmbienteCombo {
     private String nombre;
    private int codigo;

    public AmbienteCombo (String nombre, int codigo) {
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
