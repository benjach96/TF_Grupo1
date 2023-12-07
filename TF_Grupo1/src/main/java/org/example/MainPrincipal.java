package org.example;

import org.example.Controlador.EMPRESA;
import org.example.Modelo.Main;

import java.util.Scanner;


public class MainPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main mainInstance = new Main();
        mainInstance.inicializarEmpresa();
        EMPRESA empresa = mainInstance.getEmpresa();



        System.out.println("Elija una opción:");
        System.out.println("1: Imprimir información de proyectos");
        System.out.println("2: Imprimir clientes por tipo de proyecto(PRELOSA,PREVIGA,PARAPETO,FRISO))");
        System.out.println("3: Imprimir encargados por tipo de proyecto (PRELOSA,PREVIGA,PARAPETO,FRISO)");
        System.out.println("4: Imprimir proyectos por encargado");
        System.out.println("5: Imprimir detalles por código de proyecto");
        System.out.println("6: Imprimir proyecto con mayor costo");

        int opcion;
        while (true) {
            System.out.println("Elija una opción (1-6):");


            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();


                if (opcion >= 1 && opcion <= 6) {
                    break;
                } else {
                    System.out.println("Opción fuera de rango, debe estar entre 1 y 6.");
                }
            } else {
                System.out.println("Opción no válida, repetir.");
                scanner.next(); // Consumir la entrada no válida
            }
        }


        switch (opcion) {

            case 1:
                mainInstance.getEmpresa().imprimirInformacionProyectos();
                break;

            case 2:
                scanner.nextLine();
                String tipoProyecto;
                do {
                    System.out.println("Ingrese el tipo de proyecto (PRELOSA, PREVIGA, PARAPETO, FRISO):");
                    tipoProyecto = scanner.nextLine().toUpperCase();
                    if (!"PRELOSA".equals(tipoProyecto) && !"PREVIGA".equals(tipoProyecto) && !"PARAPETO".equals(tipoProyecto) && !"FRISO".equals(tipoProyecto)) {
                        System.out.println("Valor inválido, ingrese PRELOSA, PREVIGA, PARAPETO o FRISO");
                    }
                } while (!"PRELOSA".equals(tipoProyecto) && !"PREVIGA".equals(tipoProyecto) && !"PARAPETO".equals(tipoProyecto) && !"FRISO".equals(tipoProyecto));
                empresa.imprimirClientesPorTipoProyecto(tipoProyecto);
                break;

            case 3:
                scanner.nextLine(); // Limpiar el buffer del scanner
                System.out.println("Ingrese el tipo de proyecto:");
                String tipoProyectoc3= scanner.nextLine().toUpperCase();
                empresa.imprimirEncargadosPorTipoProyecto(tipoProyectoc3);
                break;

            case 4:
                scanner.nextLine(); // Limpiar el buffer del scanner
                System.out.println("Ingrese el nombre del encargado:");
                String nombreEncargado = scanner.nextLine();
                empresa.imprimirProyectosPorEncargado(nombreEncargado);
                break;


            case 5:
                scanner.nextLine(); // Limpiar el buffer del scanner
                System.out.println("Ingrese el codigo del proyecto:");
                String codigo = scanner.nextLine();
                empresa.imprimirProyectoPorCodigo(codigo);
                break;
            case 6:
                empresa.imprimirProyectoConMayorCosto();
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();

    }

}
