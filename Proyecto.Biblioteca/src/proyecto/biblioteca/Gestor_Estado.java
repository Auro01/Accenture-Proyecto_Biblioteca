/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Java
 */
public class Gestor_Estado {
    ArrayList<Estado> estados = new ArrayList<>();
    
    
    public void agregarEstado(Estado edo){
        estados.add(edo);
        System.out.println("Estado agregado correctamente");
    }
    
    public int borrarEstado(int id){
        int index = 0;
        for(Estado edo: estados){
            if(id == edo.getiIdEstado()){ 
                System.out.println("Estado: " + edo.getsNombreEstado() + " fue removido exitosamente");
                estados.remove(index);
                return 1;
           }
           index++;
       }
       System.out.println("No existe el usuario con id: " + id);
       return 0;
        
    }
}
