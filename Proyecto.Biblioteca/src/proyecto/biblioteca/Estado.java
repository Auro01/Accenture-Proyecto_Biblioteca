/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca;

/**
 *
 * @author Adrian
 */
public class Estado {
    private String sNombreEstado;
    private int iIdEstado;
    private Gestor_Biblioteca gBibBibliotecasActuales;
    
    public Estado() {
        this.sNombreEstado = "";
        this.iIdEstado = -1;
        this.gBibBibliotecasActuales = new Gestor_Biblioteca();
    }
    
    public Estado(String sNombreEstado, int iIdEstado,Gestor_Biblioteca gBibBibliotecasActuales) {
        this.sNombreEstado = sNombreEstado;
        this.iIdEstado = iIdEstado;
        this.gBibBibliotecasActuales = gBibBibliotecasActuales;
    }

    //Metodos Getters
    public String getsNombreEstado() {
        return sNombreEstado;
    }

    public int getiIdEstado() {
        return iIdEstado;
    }

    public Gestor_Biblioteca getgBibBibliotecasActuales() {
        return gBibBibliotecasActuales;
    }

    //Metodos Setters
    public void setiIdEstado(int iIdEstado) {
        this.iIdEstado = iIdEstado;
    }

    public void setsNombreEstado(String sNombreEstado) {
        this.sNombreEstado = sNombreEstado;
    }

    public void setgBibBibliotecasActuales(Gestor_Biblioteca gBibBibliotecasActuales) {
        this.gBibBibliotecasActuales = gBibBibliotecasActuales;
    }
    
    
}
