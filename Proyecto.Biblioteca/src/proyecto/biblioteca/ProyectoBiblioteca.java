/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class ProyectoBiblioteca {
    int accion;
    Scanner  scan = new Scanner(System.in);
    public int menu(){
        System.out.println("----------------------Menú----------------------");
        System.out.println("\t1.-\tGestor Biblioteca");
        System.out.println("\t2.-\tGestor Libros");
        System.out.println("\t3.-\tSalir");
        System.out.println("\nSeleciona una tarea (1-2) => ");
        accion = scan.nextInt();
        return accion;
    }
    
    public int menuGestorBibliotecas(){
        System.out.println("---------------Gestor Bibliotecas---------------");
        System.out.println("\t3.-\tSalir");
        System.out.println("\t4.-\tAgregar nuevo Estado"
                + "\n\t   \tpara construir bibliotecas");
        System.out.println("\t5.-\tBorrar Estado");
        System.out.println("\t6.-\tAgregar Biblioteca");
        System.out.println("\t7.-\tActualizar Biblioteca");
        System.out.println("\t8.-\tBorrar Biblioteca");
        System.out.println("\t0.-\tRegresar al menú principal");
        accion = scan.nextInt();
        return accion;
    }
    public int menuGestorLibros(){
        System.out.println("------------------Gestor Libros-----------------");
        System.out.println("\t3.-\tSalir");
        System.out.println("\t9.-\tAgregar Libro");
        System.out.println("\t10.-\tActualizar Libro");
        System.out.println("\t11.-\tBorrar Libro");
        System.out.println("\t0.-\tRegresar al menú principal");
        
        accion = scan.nextInt();
        return accion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iIDEstado;
        String sDomicilioNuevaBiblioteca,sNombreNuevaBiblioteca;
        int iIdBibliotecaNuevaBiblioteca;
        Biblioteca bibBliotecaAuxiliar = new Biblioteca();
        Scanner  scanEscaner = new Scanner(System.in);
        ProyectoBiblioteca pBiblioteca = new ProyectoBiblioteca();
        pBiblioteca.menu();

        Gestor_Estado geEstadosActuales = new Gestor_Estado();
        try {
            geEstadosActuales = ManejadorPersitencia.cargarDatos();
        }
        catch (Exception e){
            System.out.println(e);
        }
        while(pBiblioteca.accion !=3 ){
            switch(pBiblioteca.accion){
                case 1:
                    System.out.println("Escribe aquí");
                    pBiblioteca.menuGestorBibliotecas();
                    break;
                case 2:
                    System.out.println("Escribe aquí");
                    pBiblioteca.menuGestorLibros();
                    break;
                    //Escribe aquí :p
                case 4:
                    System.out.println("Escribe");
                    Estado estNuevo = new Estado();
                    String sNombreEstado;

                    //Tomar Datos
                    System.out.println("Ingrese el Nombre del estado");
                    sNombreEstado = scanEscaner.nextLine();
                    System.out.println("Ingrese el Id del estado");
                    iIDEstado = Integer.parseInt(scanEscaner.nextLine());

                    //Establecer datos al nuevo estado
                    estNuevo.setsNombreEstado(sNombreEstado);
                    estNuevo.setiIdEstado(iIDEstado);
                    //agregamos el estado
                    estNuevo.Imprimir();
                    geEstadosActuales.agregarE(estNuevo);
                    break;
                case 5:
                    System.out.println("Escribe");
                    //Tomar Datos
                    System.out.println("Ingrese el id del estado");
                    iIDEstado = Integer.parseInt(scanEscaner.nextLine());

                    geEstadosActuales.eliminarE(iIDEstado);
                    break;

                case 6:
                    System.out.println("Escribe");
                    System.out.println("Estados Disponibles");
                    geEstadosActuales.ImprimirEstados();
                    System.out.println("Ingrese el ID del estado al que desea agregar biblioteca");
                    iIDEstado = Integer.parseInt(scanEscaner.nextLine());
                    estNuevo = geEstadosActuales.selecionarEstado(iIDEstado);

                    System.out.println("Ingrese el ID de la Biblioteca");
                    iIdBibliotecaNuevaBiblioteca = Integer.parseInt(scanEscaner.nextLine());
                    System.out.println("Ingrese el Nombre de la Biblioteca");
                    sNombreNuevaBiblioteca = scanEscaner.nextLine();
                    System.out.println("Ingrese el Domicilio de la Biblioteca");
                    sDomicilioNuevaBiblioteca = scanEscaner.nextLine();

                    bibBliotecaAuxiliar = new Biblioteca();
                    bibBliotecaAuxiliar.setiIdBiblioteca(iIdBibliotecaNuevaBiblioteca);
                    bibBliotecaAuxiliar.setsDomicilio(sDomicilioNuevaBiblioteca);
                    bibBliotecaAuxiliar.setsNombre(sNombreNuevaBiblioteca);
                    bibBliotecaAuxiliar.setEstPertenezco(estNuevo);
                    try {
                        estNuevo.getgBibBibliotecasActuales().agregarBiblioteca(bibBliotecaAuxiliar);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;

                case 7:
                    System.out.println("Escribe");
                    System.out.println("Estados Disponibles");
                    geEstadosActuales.ImprimirEstados();
                    System.out.println("Ingrese el ID del estado donde esta la biblioteca que desea edita");
                    iIDEstado = Integer.parseInt(scanEscaner.nextLine());
                    estNuevo = geEstadosActuales.selecionarEstado(iIDEstado);

                    System.out.println("Ingrese el ID de la Biblioteca");
                    iIdBibliotecaNuevaBiblioteca = Integer.parseInt(scanEscaner.nextLine());

                    estNuevo.getgBibBibliotecasActuales().editarNombreBiblioteca(iIdBibliotecaNuevaBiblioteca);
                    estNuevo.getgBibBibliotecasActuales().editarDomicilioBiblioteca(iIdBibliotecaNuevaBiblioteca);

                    break;
                case 8:
                    System.out.println("Escribe");
                    System.out.println("Estados Disponibles");
                    geEstadosActuales.ImprimirEstados();
                    System.out.println("Ingrese el ID del estado donde esta la biblioteca que desea borrar");
                    iIDEstado = Integer.parseInt(scanEscaner.nextLine());
                    estNuevo = geEstadosActuales.selecionarEstado(iIDEstado);

                    System.out.println("Ingrese el ID de la Biblioteca");
                    iIdBibliotecaNuevaBiblioteca = Integer.parseInt(scanEscaner.nextLine());

                    estNuevo.getgBibBibliotecasActuales().borrarBlioteca(iIdBibliotecaNuevaBiblioteca);

                    break;
                default:
                    System.out.println("No escribiste nada papu");
                    pBiblioteca.menu();
                    break;
            }
        }
        ManejadorPersitencia.guardarDatos(geEstadosActuales);
        System.out.println("Gracias por venir :p");
        

        // TODO code application logic here
    }
    
}