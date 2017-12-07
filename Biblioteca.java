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
public class Biblioteca {
    private String sDomicilio,sNombre;
    private int iIdBiblioteca;

    public Biblioteca() {
        this.sDomicilio = "";
        this.sNombre = "";
        this.iIdBiblioteca = -1;
    }
    
    public Biblioteca(String sDomicilio, String sNombre, int iIdBiblioteca) {
        this.sDomicilio = sDomicilio;
        this.sNombre = sNombre;
        this.iIdBiblioteca = iIdBiblioteca;
    }

    
    
    public String getsDomicilio() {
        return sDomicilio;
    }

    public void setsDomicilio(String sDomicilio) {
        this.sDomicilio = sDomicilio;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getiIdBiblioteca() {
        return iIdBiblioteca;
    }

    public void setiIdBiblioteca(int iIdBiblioteca) {
        this.iIdBiblioteca = iIdBiblioteca;
    }
    
}
