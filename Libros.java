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
public class Libros {
    private String sNombre,sAutor;
    private int iISBN,iAnio;
    private boolean bPrestado;

    public Libros() {
        this.sNombre = "";
        this.sAutor = "";
        this.iISBN = -1;
        this.iAnio = -1;
        this.bPrestado = false;
    }
    
    public Libros(String sNombre, String sAutor, int iISBN, int iAnio, boolean bPrestado) {
        this.sNombre = sNombre;
        this.sAutor = sAutor;
        this.iISBN = iISBN;
        this.iAnio = iAnio;
        this.bPrestado = bPrestado;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsAutor() {
        return sAutor;
    }

    public void setsAutor(String sAutor) {
        this.sAutor = sAutor;
    }

    public int getiISBN() {
        return iISBN;
    }

    public void setiISBN(int iISBN) {
        this.iISBN = iISBN;
    }

    public int getiAnio() {
        return iAnio;
    }

    public void setiAnio(int iAnio) {
        this.iAnio = iAnio;
    }

    public boolean isbPrestado() {
        return bPrestado;
    }

    public void setbPrestado(boolean bPrestado) {
        this.bPrestado = bPrestado;
    }
    
}
