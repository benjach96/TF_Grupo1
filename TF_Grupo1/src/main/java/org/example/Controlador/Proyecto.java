package org.example.Controlador;

public class Proyecto {
    private String codigo;
    private String nombre;
    private int anioInicio;
    private Encargado encargado;
    private Cliente cliente;
    private double metradoTotal;
    private String tipoProyecto;
    private String nombreempresa;


    // Constructor, getters y setters...

    public Proyecto(String codigo, String nombre, int anioInicio, Encargado encargado, Cliente cliente, double metradoTotal, String tipoProyecto, String nombreempresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioInicio = anioInicio;
        this.encargado = encargado;
        this.cliente = cliente;
        this.metradoTotal = metradoTotal;
        this.tipoProyecto = tipoProyecto;
        this.nombreempresa = nombreempresa;
    }




    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMetradoTotal() {
        return metradoTotal;
    }

    public void setMetradoTotal(double metradoTotal) {
        this.metradoTotal = metradoTotal;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(String tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }


    private double obtenerFactorPr() {
        switch (tipoProyecto) {
            case "PRELOSA":
                return 55.24;
            case "PREVIGA":
                return 33.15;
            case "PARAPETO":
                return 25.44;
            case "FRISO":
                return 26.44;
            default:
                return 40; // Factor por defecto si el tipo de proyecto no está definido
        }

    }


    public double calcularCostoVenta() {
        double factorPr = obtenerFactorPr();
        return metradoTotal * factorPr;
    }


}
