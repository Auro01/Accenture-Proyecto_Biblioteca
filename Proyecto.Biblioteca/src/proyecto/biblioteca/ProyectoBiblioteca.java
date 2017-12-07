/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca;

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
        
        ProyectoBiblioteca pBiblioteca = new ProyectoBiblioteca();
        pBiblioteca.menu();
        while(pBiblioteca.accion !=3 ){
            switch(pBiblioteca.accion){
                case 1:
                    System.out.println("Escribe aquí");
                    pBiblioteca.menuGestorBibliotecas();
                    break;
                case 2:
                    System.out.println("Escribe aquí");
                    pBiblioteca.menu();
                    break;
                    //Escribe aquí :p
                case 4:
                    System.out.println("Escribe");
                    break;
                default:
                    System.out.println("No escribiste nada papu");
                    pBiblioteca.menu();
                    break;
            }
        }
        
        System.out.println("Gracias por venir :p");
        
        
        // TODO code application logic here
    }
    
}