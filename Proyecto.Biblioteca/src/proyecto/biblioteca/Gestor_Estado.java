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
    
ArrayList <Estado> listadeestados = new ArrayList<>();

    public void agregarE(Estado est){ 
           listadeestados.add(est);
    }
    
    public void eliminarE(Estado est){  

          for (Estado sNombreEstado : listadeestados) { 
              if(sNombreEstado == est){   
                   listadeempleados.remove(est); 
              }
          }
    }
    
    public void mostrarE(Estado est){  

        for (Estado esEnTurno : listadeestadoss) { 
                    String getsNombreEstado;
                    if(esEnTurno == sNombreEstado){  
                       System.out.println(getsNombreEstado(listadeestadoss));    
                    }
        }
    }       
}
