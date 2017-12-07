/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Java
 */
public class Gestor_Libro {
     
     ArrayList<Libro> libros = new ArrayList<>();
     
     Gestor_Biblioteca gestorBiblioteca = new Gestor_Biblioteca();
    
     
    //Método para agregar Libro
     public void agregarLibro(Libro libro){
         //Verificar que existan bibliotecas
        if(gestorBiblioteca.bibliotecas.size() < 1){
             System.out.println("No puedes agregar un Libro sin bibliotecas :v");
             return;
         }
         //Recorrer las bibliotecas actuales y guardar el libro en cada un
         for(Biblioteca biblioteca: gestorBiblioteca.bibliotecas){
             libro.setBibPertenezco(biblioteca);
             libros.add(libro);
         }
         System.out.println("Existencias del libro agregado correctamente");
     }
     
     //metodo borrar libro
     public boolean borrarLibro(int id){
         for(Libro libro: libros){
                if(id == libro.getiISBN()){ 
                 System.out.println(libro.getsNombre() + " se han borrado las exitencias");
                 libros.remove(libro);
                 return true;
             }
        }
        System.out.println("No existe el libro con id: " + id);
        return false;
     }
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
      
     
     
  }