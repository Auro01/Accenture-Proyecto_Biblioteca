/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Java
 */
public class Gestor_Libro {
     
     private ArrayList<Libro> libros;
     
     private Gestor_Biblioteca gestorBiblioteca;

    public Gestor_Libro() {
        this.libros = new ArrayList<Libro>();
        this.gestorBiblioteca = new Gestor_Biblioteca();
    }

    public Gestor_Libro(ArrayList<Libro> libros, Gestor_Biblioteca gestorBiblioteca) {
        this.libros = libros;
        this.gestorBiblioteca = gestorBiblioteca;
    }

    //Método para agregar Libro
     public void agregarLibro(Libro libro){
         //Verificar que existan bibliotecas
        if(gestorBiblioteca.getListBiblioteca().size() < 1){
             System.out.println("No puedes agregar un Libro sin bibliotecas :v");
             return;
         }
         //Recorrer las bibliotecas actuales y guardar el libro en cada un
         for(Biblioteca biblioteca: gestorBiblioteca.getListBiblioteca()){
             libro.setBibPertenezco(biblioteca);
             libros.add(libro);
         }
         System.out.println("Existencias del libro agregado correctamente");
     }
     
     //metodo borrar existencias de los libros
     public boolean borraExistenciaLibros(int id){
         for(Libro libro: libros){
                if(id == libro.getiISBN()){ 
                 System.out.println(libro.getsNombre() + " se han borrado las exitencias");
                 libros.remove(libro);
             }
        }
        System.out.println("No existe el libro con id: " + id);
        return false;
     }
     
     //Borrrar un libro en especifico en una biblioteca por id de libro y id de la biblioteca
     public boolean borrarLibro(int idLibro, int idBiblioteca){
         for(Libro libro: libros){
             //comparar ids con los del libro y biblioteca a la que pertenece
                if(idLibro == libro.getiISBN() & idBiblioteca == libro.getBibPertenezco().getiIdBiblioteca()){
                 System.out.println("Libro borrado de sucursal correctamente");
                 libros.remove(libro);
                 return true;
             }
        }
        System.out.println("No existe el libro con id: " + idLibro);
        return false;
     }
     
     //Mostrar libro 
     public void mostrarLibros(){
         for(Libro libro: libros){
             libro.Imprimir();
         }
     }
     
     //Funcion actualizar libro
     public void editarLibro(int id){
         //Obtener todos los datos 
         Scanner scan = new Scanner(System.in);
         System.out.println("Dame el nuevo nombre del libro");
         String nuevoNombre = scan.nextLine();
         System.out.println("Dame el nuevo autor del libro");
         String nuevoAutor = scan.nextLine();
         System.out.println("Dame el nuevo año");
         int nuevoAño = scan.nextInt();
        
         //Actualizar los datos del libro en cada biblioteca
         for(Libro libro: libros){
             if(id == libro.getiISBN()){
                libro.setsNombre(nuevoNombre);
                 libro.setsAutor(nuevoAutor);
                 libro.setiAnio(nuevoAño);
                 System.out.println("Libro actualizado en: " + libro.getBibPertenezco().getsNombre());
             }
         }
         
        
     }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public Gestor_Biblioteca getGestorBiblioteca() {
        return gestorBiblioteca;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void setGestorBiblioteca(Gestor_Biblioteca gestorBiblioteca) {
        this.gestorBiblioteca = gestorBiblioteca;
    }
}