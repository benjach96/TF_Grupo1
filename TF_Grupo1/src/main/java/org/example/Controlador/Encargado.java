package org.example.Controlador;

public class Encargado {
    private String nombre;
    private String cargo;
    private String tipoProyecto; //PRELOSA,PREVIGA,PARAPETO//FRISO

    public Encargado(String nombre, String cargo, String tipoProyecto) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.tipoProyecto = tipoProyecto;
    }


    public String getNombre() {
        return nombre;
    }


}
