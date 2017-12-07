/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca;

/**
 *
 * @author Lorena
 */
public class Gestor_Estado {

// Se crea un array para almacenar estados
ArrayList <Estado> listadeestados = new ArrayList<>();

    //Metodo AgregarE para agregar estados a la lista
    public void agregarE(Estado est){ 
           listadeestados.add(est);
    }

    //Metodo Eliminar para buscar estado por id y eliminarlo de la lista
    public void eliminarE(int id){
       int index = 0;
       for(Estado estActual: listadeestados){
           if(id ==estActual.getId()){ 
               //aviso para el usuario de que ya fue eliminado
               System.out.println(estActual.getNombreEstado() + " se ha removido");
               listadeestados.remove(index);
               return;
           }
           index++;
       }
        //en caso de no encontrarse el estado en la base de datos segpun su id
       System.out.println("No existe el estado con id: " + id);
       return;
   }
    //Metodo para imprimir el estado en turno y su información
    public void mostrarE(Estado est){  

        for (Estado estActual : listadeestadoss) { 
                    String getsNombreEstado;
                    if(estActual == sNombreEstado){  
                       System.out.println(getsNombreEstado(listadeestadoss));    
                    }
        }
    }       
}
