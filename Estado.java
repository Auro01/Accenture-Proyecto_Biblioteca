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
public class Estado {
    private String sNombreEstado;
    private int iIdEstado;
    
    public Estado() {
        this.sNombreEstado = "";
        this.iIdEstado = -1;
    }
    
    public Estado(String sNombreEstado, int iIdEstado) {
        this.sNombreEstado = sNombreEstado;
        this.iIdEstado = iIdEstado;
    }

    public String getsNombreEstado() {
        return sNombreEstado;
    }

    public void setsNombreEstado(String sNombreEstado) {
        this.sNombreEstado = sNombreEstado;
    }

    public int getiIdEstado() {
        return iIdEstado;
    }

    public void setiIdEstado(int iIdEstado) {
        this.iIdEstado = iIdEstado;
    }
    
    
}
