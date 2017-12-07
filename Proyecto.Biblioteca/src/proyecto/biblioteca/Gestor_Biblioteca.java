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
public class Gestor_Biblioteca {
    ArrayList<Biblioteca> listBiblioteca;

    //Constructores
    public Gestor_Biblioteca() {
        this.listBiblioteca = new ArrayList<Biblioteca>();
    }

    public Gestor_Biblioteca(ArrayList<Biblioteca> listBiblioteca) {
        this.listBiblioteca = listBiblioteca;
    }

    //Metodos Getters
    public ArrayList<Biblioteca> getListBiblioteca() {
        return listBiblioteca;
    }

    //Metodos Setters
    public void setListBiblioteca(ArrayList<Biblioteca> listBiblioteca) {
        this.listBiblioteca = listBiblioteca;
    }

    //metodos
    public boolean agregarBiblioteca(Biblioteca nuevaBilioteca) throws Exception{
        //checamos que no exista ya el mismo empleado
        if(!listBiblioteca.contains(nuevaBilioteca)){
            //recorremos la lista busacando que no este el id de la nueva biblioteca
            for (Biblioteca actual:listBiblioteca){
                //si lo esta
                if(actual.getiIdBiblioteca()==actual.getiIdBiblioteca()){
                    //retornamos falso que no se podia agregar dicha biblioteca
                    Exception error = new Exception("El id ya esta en uso");
                    throw error;
                }
            }
            //si no existe lo agregamos
            listBiblioteca.add(nuevaBilioteca);
            //retornamos true de que se realizo con exito la operacion
            return true;
        }
        else {
            //retornamos false de que NO se realizo la operacion
            Exception error = new Exception("El empleado ya esta en el gestor");
            throw error;
        }
    }

    public Biblioteca obtenerBiblioteca(int idBuscada){
        //recorremos la lista
        for (Biblioteca actual:listBiblioteca){
            //si encontramos una id igual a la prpoporcionada
            if (idBuscada == actual.getiIdBiblioteca()){
                //retornamos esa id
                return actual;
            }
        }
        //si no se encuentro algo devolvemos nulo
        return null;
    }

    public boolean borrarBlioteca(int idBuscada){
        //recorremos la lista
        for (Biblioteca actual:listBiblioteca){
            //si encontramos una id igual a la prpoporcionada
            if (idBuscada == actual.getiIdBiblioteca()){
                //borramos la biblioteca actual con esa id de la lista
                listBiblioteca.remove(actual);
                //retornamos true de que se realizo con exito la operacion
                return true;
            }
        }
        //retornamos false de que NO se realizo la operacion
        return false;
    }

    public boolean editarNombreBiblioteca(int idBuscada){
        //recorremos la lista
        for (Biblioteca actual:listBiblioteca){
            //si encontramos una id igual a la prpoporcionada
            if (idBuscada == actual.getiIdBiblioteca()){
                String sNuevoNombre;
                Scanner in = new Scanner(System.in);
                System.out.println("Por favor ingrese el nuevo nombre de la biblioteca");
                sNuevoNombre = in.nextLine();
                actual.setsNombre(sNuevoNombre);
                return true;
            }
        }
        //retornamos false de que NO se realizo la operacion
        return false;
    }

    public boolean editarDomicilioBiblioteca(int idBuscada){
        //recorremos la lista
        for (Biblioteca actual:listBiblioteca){
            //si encontramos una id igual a la prpoporcionada
            if (idBuscada == actual.getiIdBiblioteca()){
                String sNuevoDomicilio;
                Scanner in = new Scanner(System.in);
                System.out.println("Por favor ingrese el nuevo domicilio de la biblioteca");
                sNuevoDomicilio = in.nextLine();
                actual.setsDomicilio(sNuevoDomicilio);
                return true;
            }
        }
        //retornamos false de que NO se realizo la operacion
        return false;
    }

    public void imprimirBibliotecas(){
        System.out.println("Id\tNombre\tApellido Paterno\tApellido Materno\tEdad");
        for (Biblioteca actual:listBiblioteca) {
            actual.Imprimir();
        }
    }
    
}
