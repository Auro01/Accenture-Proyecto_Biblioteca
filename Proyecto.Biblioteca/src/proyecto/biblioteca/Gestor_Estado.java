/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca;

/**
 *
 * @author Java
 */
public class Gestor_Estado {
    
ArrayList <Estado> listadeestados = new ArrayList<>();

    public void agregarE(Estado est){ 
           listadeestados.add(est);
    }
    
public void eliminarE(int id){
       int index = 0;
       for(Estado estActual: listadeestados){
           if(id ==estActual.getId()){ 
               System.out.println(estActual.getNombreEstado() + " se ha removido");
               listadeestados.remove(index);
               return;
           }
           index++;
       }
       System.out.println("No existe el estado con id: " + id);
       return;
   }
    
    public void mostrarE(Estado est){  

        for (Estado estActual : listadeestadoss) { 
                    String getsNombreEstado;
                    if(estActual == sNombreEstado){  
                       System.out.println(getsNombreEstado(listadeestadoss));    
                    }
        }
    }       
}
