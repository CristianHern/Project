
package com.mataperco.model;


public class InstructorCombo {
     private String nombre;
    private int codigo;

    public InstructorCombo (String nombre, int codigo) {
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
