package org.example.Controlador;

import java.util.ArrayList;
import java.util.List;

public class EMPRESA {

    private String nombre;
    private List<Proyecto> proyectos;
    private List<Cliente> clientes;

    public EMPRESA(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    //  Imprimir información de todos los proyectos
    public void imprimirInformacionProyectos() {
        List<String> proyectosImpresos = new ArrayList<>();

        for (Proyecto p : proyectos) {
            String proyectoInfo = "Proyecto: " + p.getNombre() + ", Código: " + p.getCodigo() + ", Año: " + p.getAnioInicio() + ", Encargado: " + p.getEncargado().getNombre() + ", Cliente: " + p.getCliente().getNombre() + ", Metrado Total: " + p.getMetradoTotal() + ", Costo de Venta: " + p.calcularCostoVenta();
            if (!proyectosImpresos.contains(proyectoInfo)) {
                System.out.println(proyectoInfo);
                proyectosImpresos.add(proyectoInfo);
            }
        }
    }

    // Imprimir clientes por tipo de proyecto
    public void imprimirClientesPorTipoProyecto(String tipoProyecto) {
        List<String> clientesImpresos = new ArrayList<>();

        for (Proyecto p : proyectos) {
            if (p.getTipoProyecto().equals(tipoProyecto)) {
                String clienteInfo = "Proyecto: " + p.getNombre() + ", Cliente: " + p.getCliente().getNombre();
                if (!clientesImpresos.contains(clienteInfo)) {
                    System.out.println(clienteInfo);
                    clientesImpresos.add(clienteInfo);
                }
            }
        }
    }

    //Imprimir encargados por tipo de proyecto
    public void imprimirEncargadosPorTipoProyecto(String tipoProyecto) {
        List<String> encargadosImpresos = new ArrayList<>();
        boolean proyectoEncontrado = false;

        for (Proyecto p : proyectos) {
            if (p.getTipoProyecto().equals(tipoProyecto)) {
                String encargadoInfo = "Proyecto: " + p.getNombre() + ", Encargado: " + p.getEncargado().getNombre();
                if (!encargadosImpresos.contains(encargadoInfo)) {
                    System.out.println(encargadoInfo);
                    encargadosImpresos.add(encargadoInfo);
                    proyectoEncontrado = true;
                }
            }
        }

        if (!proyectoEncontrado) {
            System.out.println("Tipo de proyecto no encontrado");
        }
    }



    // Imprimir proyectos por nombre del encargado
    public void imprimirProyectosPorEncargado(String nombreEncargado) {
        boolean encargadoEncontrado = false;
        List<String> proyectosImpresos = new ArrayList<>();

        try {
            for (Proyecto p : proyectos) {
                if (p.getEncargado() != null && p.getEncargado().getNombre().equals(nombreEncargado) && !proyectosImpresos.contains(p.getNombre())) {
                    System.out.println("Proyecto: " + p.getNombre() + ", Encargado: " + nombreEncargado);
                    proyectosImpresos.add(p.getNombre());
                    encargadoEncontrado = true;
                }
            }
            if (!encargadoEncontrado) {
                System.out.println("Error de digitación: Usuario no encontrado");
            }
        } catch (NullPointerException e) {
            System.out.println("Error de digitación: Información nula encontrada");
        }
    }



    //Imprimir el proyecto con mayor costo de venta
    public void imprimirProyectoConMayorCosto() {
        Proyecto mayorCostoProyecto = null;
        for (Proyecto p : proyectos) {
            if (mayorCostoProyecto == null || p.calcularCostoVenta() > mayorCostoProyecto.calcularCostoVenta()) {
                mayorCostoProyecto = p;
            }
        }

        if (mayorCostoProyecto != null) {
            System.out.println("Proyecto con mayor costo de venta: " + mayorCostoProyecto.getNombre() + ", Costo: " + mayorCostoProyecto.calcularCostoVenta());
        }
    }

    public void imprimirProyectoPorCodigo(String codigoBuscado) {
        List<String> codigosImpresos = new ArrayList<>();

        try {
            for (Proyecto proyecto : proyectos) {
                if (proyecto.getCodigo().equals(codigoBuscado) && !codigosImpresos.contains(codigoBuscado)) {
                    System.out.println("Código: " + proyecto.getCodigo());
                    System.out.println("Nombre: " + proyecto.getNombre());
                    System.out.println("Año de Inicio: " + proyecto.getAnioInicio());
                    System.out.println("Encargado: " + (proyecto.getEncargado() != null ? proyecto.getEncargado().getNombre() : "N/A"));
                    System.out.println("Cliente: " + proyecto.getCliente().getNombre());
                    System.out.println("Metrado Total: " + proyecto.getMetradoTotal());
                    System.out.println("Tipo de Proyecto: " + proyecto.getTipoProyecto());
                    System.out.println("Costo de Venta: " + proyecto.calcularCostoVenta());
                    codigosImpresos.add(codigoBuscado);
                    return;
                }
            }
            System.out.println("Proyecto con código " + codigoBuscado + " no encontrado.");
        } catch (Exception e) {
            System.out.println("Respuesta inválida");
        }
    }
}



