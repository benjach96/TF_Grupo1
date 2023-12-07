package org.example.Controlador;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String direccion;
    private String tipoDocumento;
    private String numeroDocumento;
    private List<Proyecto> proyectosSolicitados;


    public Cliente(String nombre, String direccion, String tipoDocumento, String numeroDocumento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.proyectosSolicitados =new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }


}
