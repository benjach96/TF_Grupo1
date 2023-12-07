package org.example.Modelo;

import org.example.Controlador.Cliente;
import org.example.Controlador.EMPRESA;
import org.example.Controlador.Encargado;
import org.example.Controlador.Proyecto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private EMPRESA empresa;

    public Main() {
        empresa = new EMPRESA("BETON DECKEN");
        inicializarEmpresa();
    }

    public void inicializarEmpresa() {

        // Crear y agregar encargados
        Encargado encargado1 = new Encargado("Luis Rodríguez", "Jefe de Obra", "PRELOSA");
        Encargado encargado2 = new Encargado("María Fernández", "Coordinadora de Proyecto", "PREVIGA");
        Encargado encargado3 = new Encargado("Carlos Jiménez", "Supervisor de Campo", "PARAPETO");
        Encargado encargado4 = new Encargado("Ana Torres", "Ingeniera de Proyectos", "FRISO");
        
        // Crear y agregar clientes
        Cliente cliente1 = new Cliente("Grupo Constructor Zeta", "Avenida Principal 123", "RUC", "20547896541");
        Cliente cliente2 = new Cliente("Inmobiliaria El Sol", "Calle Los Laureles 456", "RUC", "20587412365");
        Cliente cliente3 = new Cliente("Corporación Alta Vista", "Jr. Los Cedros 789", "RUC", "20659874512");
        Cliente cliente4 = new Cliente("Desarrollos Urbanos Gamma", "Av. Las Flores 321", "RUC", "20541236987");
        Cliente cliente5 = new Cliente("Empresas Delta", "Calle del Bosque 101", "RUC", "20598765432");
        Cliente cliente6 = new Cliente("Constructora Estrella", "Avenida del Mar 202", "RUC", "20654321987");
        Cliente cliente7 = new Cliente("Urbanizaciones Orion", "Callejón del Valle 303", "RUC", "20732145698");
        Cliente cliente8 = new Cliente("Grupo Inmobiliario Andes", "Avenida de los Alpes 404", "RUC", "20821436587");
        Cliente cliente9 = new Cliente("Desarrollos Pegasus", "Paseo de los Olivos 505", "RUC", "20965412378");
        Cliente cliente10 = new Cliente("Corporación Nova", "Calle de la Luna 606", "RUC", "20147896532");
        Cliente cliente11 = new Cliente("Proyectos Centauri", "Avenida Cosmos 707", "RUC", "20236987451");
        Cliente cliente12 = new Cliente("Edificaciones Orion", "Calle de la Estrella 808", "RUC", "20325814763");
        Cliente cliente13 = new Cliente("Inversiones Sirius", "Jr. Galaxia 909", "RUC", "20414725836");
        Cliente cliente14 = new Cliente("Construcciones Pictor", "Avenida del Eclipse 121", "RUC", "20596385214");
        Cliente cliente15 = new Cliente("Grupo Lyra", "Calle del Cometa 131", "RUC", "20685274139");
        Cliente cliente16 = new Cliente("Desarrollos Phoenix", "Av. del Asteroide 141", "RUC", "20774196352");
        Cliente cliente17 = new Cliente("Inmobiliaria Cosmos", "Calle de Andrómeda 151", "RUC", "20863957416");
        Cliente cliente18 = new Cliente("Edificaciones Taurus", "Avenida del Pulsar 161", "RUC", "20952841637");
        Cliente cliente19 = new Cliente("Proyectos Aquarius", "Jr. del Meteorito 171", "RUC", "21041763958");
        Cliente cliente20 = new Cliente("Grupo Constructor Draco", "Calle del Cosmos 181", "RUC", "21130685279");
        Cliente cliente21 = new Cliente("Urbanizaciones Leo", "Av. de la Vía Láctea 191", "RUC", "21229517460");
        Cliente cliente22 = new Cliente("Constructora Gemini", "Calle del Quasar 202", "RUC", "21318429681");
        Cliente cliente23 = new Cliente("Desarrollos Virgo", "Avenida de la Nebulosa 212", "RUC", "21407341892");
        Cliente cliente24 = new Cliente("Corporación Aries", "Jr. del Agujero Negro 222", "RUC", "21596253013");
        Cliente cliente25 = new Cliente("Inmobiliaria Capricornio", "Calle de la Supernova 232", "RUC", "21685164234");
        Cliente cliente26 = new Cliente("Proyectos Sagitario", "Avenida del Big Bang 242", "RUC", "21774075445");
        Cliente cliente27 = new Cliente("Edificaciones Libra", "Calle de la Estación Espacial 252", "RUC", "21862986656");
        Cliente cliente28 = new Cliente("Grupo Constructor Escorpio", "Av. de la Aurora Boreal 262", "RUC", "21951897867");
        Cliente cliente29 = new Cliente("Urbanizaciones Cáncer", "Jr. del Telescopio 272", "RUC", "22040708978");
        Cliente cliente30 = new Cliente("Constructora Piscis", "Calle de la Sonda Espacial 282", "RUC", "22139620189");
        Cliente cliente31 = new Cliente("Desarrollos Tauro", "Avenida del Observatorio 292", "RUC", "22228531290");
        Cliente cliente32 = new Cliente("Corporación Pisces", "Calle del Radiotelescopio 302", "RUC", "22317442301");
        Cliente cliente33 = new Cliente("Inmobiliaria Aquila", "Jr. de la Estrella Fugaz 312", "RUC", "22406353412");
        Cliente cliente34 = new Cliente("Proyectos Vega", "Avenida de la Constelación 322", "RUC", "22595264523");
        Cliente cliente35 = new Cliente("Edificaciones Cygnus", "Calle del Cometa Halley 332", "RUC", "22684175634");
        Cliente cliente36 = new Cliente("Grupo Constructor Orion", "Av. de la Galaxia Espiral 342", "RUC", "22773086745");

        // Crear y agregar proyectos
        Proyecto proyecto1 = new Proyecto("PROY001", "Torres Gemelas", 2020, encargado1, cliente1, 500, "PRELOSA", "Grupo Constructor Zeta");
        Proyecto proyecto2 = new Proyecto("PROY002", "Centro Comercial El Dorado", 2021, encargado2, cliente2, 750, "PREVIGA", "Inmobiliaria El Sol");
        Proyecto proyecto3 = new Proyecto("PROY003", "Parque Industrial Omega", 2019, encargado3, cliente3, 600, "PARAPETO", "Corporación Alta Vista");
        Proyecto proyecto4 = new Proyecto("PROY004", "Conjunto Residencial Los Almendros", 2022, encargado4, cliente4, 450, "FRISO", "Desarrollos Urbanos Gamma");
        Proyecto proyecto5 = new Proyecto("PROY005", "TW2", 2020, encargado1, cliente1, 500, "PRELOSA", "Grupo Constructor Zeta");
        Proyecto proyecto6 = new Proyecto("PROY006", "Edificio Aurora", 2023, encargado2, cliente2, 700, "PREVIGA", "Inmobiliaria El Sol");
        Proyecto proyecto7 = new Proyecto("PROY007", "Complejo Deportivo Estrella", 2023, encargado3, cliente3, 800, "PARAPETO", "Corporación Alta Vista");
        Proyecto proyecto8 = new Proyecto("PROY008", "Edificaciones Orion", 2023, encargado4, cliente4, 600, "FRISO", "Desarrollos Urbanos Gamma");
        Proyecto proyecto9 = new Proyecto("PROY009", "Inversiones Sirius", 2023, encargado1, cliente5, 550, "PRELOSA", "Empresas Delta");
        Proyecto proyecto10 = new Proyecto("PROY010", "Construcciones Pictor", 2023, encargado2, cliente6, 720, "PREVIGA", "Constructora Estrella");
        Proyecto proyecto11 = new Proyecto("PROY011", "Grupo Lyra", 2023, encargado3, cliente7, 670, "PARAPETO", "Urbanizaciones Orion");
        Proyecto proyecto12 = new Proyecto("PROY012", "Desarrollos Phoenix", 2023, encargado4, cliente8, 490, "FRISO", "Grupo Inmobiliario Andes");
        Proyecto proyecto13 = new Proyecto("PROY013", "Inmobiliaria Cosmos", 2023, encargado1, cliente9, 530, "PRELOSA", "Desarrollos Pegasus");
        Proyecto proyecto14 = new Proyecto("PROY014", "Edificaciones Taurus", 2023, encargado2, cliente10, 720, "PREVIGA", "Corporación Nova");
        Proyecto proyecto15 = new Proyecto("PROY015", "Proyectos Aquarius", 2023, encargado3, cliente11, 620, "PARAPETO", "Proyectos Centauri");
        Proyecto proyecto16 = new Proyecto("PROY016", "Grupo Constructor Draco", 2023, encargado4, cliente12, 470, "FRISO", "Edificaciones Orion");
        Proyecto proyecto17 = new Proyecto("PROY017", "Urbanizaciones Leo", 2023, encargado1, cliente13, 540, "PRELOSA", "Inversiones Sirius");
        Proyecto proyecto18 = new Proyecto("PROY018", "Constructora Gemini", 2023, encargado2, cliente14, 710, "PREVIGA", "Construcciones Pictor");
        Proyecto proyecto19 = new Proyecto("PROY019", "Desarrollos Virgo", 2023, encargado3, cliente15, 660, "PARAPETO", "Grupo Lyra");
        Proyecto proyecto20 = new Proyecto("PROY020", "Corporación Aries", 2023, encargado4, cliente16, 480, "FRISO", "Desarrollos Phoenix");
        Proyecto proyecto21 = new Proyecto("PROY021", "Inmobiliaria Capricornio", 2023, encargado1, cliente17, 520, "PRELOSA", "Inmobiliaria Cosmos");
        Proyecto proyecto22 = new Proyecto("PROY022", "Proyectos Sagitario", 2023, encargado2, cliente18, 710, "PREVIGA", "Edificaciones Taurus");
        Proyecto proyecto23 = new Proyecto("PROY023", "Edificaciones Libra", 2023, encargado3, cliente19, 630, "PARAPETO", "Proyectos Aquarius");
        Proyecto proyecto24 = new Proyecto("PROY024", "Grupo Constructor Escorpio", 2023, encargado4, cliente20, 450, "FRISO", "Grupo Constructor Draco");
        Proyecto proyecto25 = new Proyecto("PROY025", "Urbanizaciones Cáncer", 2023, encargado1, cliente21, 540, "PRELOSA", "Urbanizaciones Leo");
        Proyecto proyecto26 = new Proyecto("PROY026", "Constructora Piscis", 2023, encargado2, cliente22, 700, "PREVIGA", "Constructora Gemini");
        Proyecto proyecto27 = new Proyecto("PROY027", "Desarrollos Tauro", 2023, encargado3, cliente23, 630, "PARAPETO", "Desarrollos Virgo");
        Proyecto proyecto28 = new Proyecto("PROY028", "Corporación Pisces", 2023, encargado4, cliente24, 450, "FRISO", "Corporación Aries");
        Proyecto proyecto29 = new Proyecto("PROY029", "Inmobiliaria Aquila", 2023, encargado1, cliente25, 540, "PRELOSA", "Inmobiliaria Capricornio");
        Proyecto proyecto30 = new Proyecto("PROY030", "Proyectos Vega", 2023, encargado2, cliente26, 710, "PREVIGA", "Proyectos Sagitario");
        Proyecto proyecto31 = new Proyecto("PROY031", "Edificaciones Cygnus", 2023, encargado3, cliente27, 630, "PARAPETO", "Edificaciones Libra");
        Proyecto proyecto32 = new Proyecto("PROY032", "Grupo Constructor Orion", 2023, encargado4, cliente28, 450, "FRISO", "Grupo Constructor Escorpio");
        Proyecto proyecto33 = new Proyecto("PROY033", "Centro Empresarial Nova", 2023, encargado1, cliente29, 540, "PRELOSA", "Urbanizaciones Cáncer");
        Proyecto proyecto34 = new Proyecto("PROY034", "Residencial Estelar", 2023, encargado2, cliente30, 710, "PREVIGA", "Constructora Piscis");
        Proyecto proyecto35 = new Proyecto("PROY035", "Torre Panorámica", 2023, encargado3, cliente31, 630, "PARAPETO", "Desarrollos Tauro");
        Proyecto proyecto36 = new Proyecto("PROY036", "Plaza Comercial Galaxia", 2023, encargado4, cliente32, 450, "FRISO", "Corporación Pisces");


        empresa.agregarCliente(cliente1);
        empresa.agregarCliente(cliente2);
        empresa.agregarCliente(cliente3);
        empresa.agregarCliente(cliente4);
        empresa.agregarCliente(cliente1);
        empresa.agregarCliente(cliente2);
        empresa.agregarCliente(cliente3);
        empresa.agregarCliente(cliente4);
        empresa.agregarCliente(cliente5);
        empresa.agregarCliente(cliente6);
        empresa.agregarCliente(cliente7);
        empresa.agregarCliente(cliente8);
        empresa.agregarCliente(cliente9);
        empresa.agregarCliente(cliente10);
        empresa.agregarCliente(cliente11);
        empresa.agregarCliente(cliente12);
        empresa.agregarCliente(cliente13);
        empresa.agregarCliente(cliente14);
        empresa.agregarCliente(cliente15);
        empresa.agregarCliente(cliente16);
        empresa.agregarCliente(cliente17);
        empresa.agregarCliente(cliente18);
        empresa.agregarCliente(cliente19);
        empresa.agregarCliente(cliente20);
        empresa.agregarCliente(cliente21);
        empresa.agregarCliente(cliente22);
        empresa.agregarCliente(cliente23);
        empresa.agregarCliente(cliente24);
        empresa.agregarCliente(cliente25);
        empresa.agregarCliente(cliente26);
        empresa.agregarCliente(cliente27);
        empresa.agregarCliente(cliente28);
        empresa.agregarCliente(cliente29);
        empresa.agregarCliente(cliente30);
        empresa.agregarCliente(cliente31);
        empresa.agregarCliente(cliente32);
        empresa.agregarCliente(cliente33);
        empresa.agregarCliente(cliente34);
        empresa.agregarCliente(cliente35);
        empresa.agregarCliente(cliente36);

        empresa.agregarProyecto(proyecto1);
        empresa.agregarProyecto(proyecto2);
        empresa.agregarProyecto(proyecto3);
        empresa.agregarProyecto(proyecto4);
        empresa.agregarProyecto(proyecto5);
        empresa.agregarProyecto(proyecto6);
        empresa.agregarProyecto(proyecto7);
        empresa.agregarProyecto(proyecto8);
        empresa.agregarProyecto(proyecto9);
        empresa.agregarProyecto(proyecto10);
        empresa.agregarProyecto(proyecto11);
        empresa.agregarProyecto(proyecto12);
        empresa.agregarProyecto(proyecto13);
        empresa.agregarProyecto(proyecto14);
        empresa.agregarProyecto(proyecto15);
        empresa.agregarProyecto(proyecto16);
        empresa.agregarProyecto(proyecto17);
        empresa.agregarProyecto(proyecto18);
        empresa.agregarProyecto(proyecto19);
        empresa.agregarProyecto(proyecto20);
        empresa.agregarProyecto(proyecto21);
        empresa.agregarProyecto(proyecto22);
        empresa.agregarProyecto(proyecto23);
        empresa.agregarProyecto(proyecto24);
        empresa.agregarProyecto(proyecto25);
        empresa.agregarProyecto(proyecto26);
        empresa.agregarProyecto(proyecto27);
        empresa.agregarProyecto(proyecto28);
        empresa.agregarProyecto(proyecto29);
        empresa.agregarProyecto(proyecto30);
        empresa.agregarProyecto(proyecto31);
        empresa.agregarProyecto(proyecto32);
        empresa.agregarProyecto(proyecto33);
        empresa.agregarProyecto(proyecto34);
        empresa.agregarProyecto(proyecto35);
        empresa.agregarProyecto(proyecto36);
    }

    public EMPRESA getEmpresa() {
        return empresa;
    }

    public static void main(String[] args) {
        new Main();
    }


}