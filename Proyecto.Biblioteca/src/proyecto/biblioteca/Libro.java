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
public class Libro {
    private String sNombre,sAutor;
    private int iISBN,iAnio;
    private boolean bRentado;
    private Biblioteca bibPertenezco;

    public Libro() {
        this.sNombre = "";
        this.sAutor = "";
        this.iISBN = -1;
        this.iAnio = -1;
        this.bRentado = false;
        this.bibPertenezco = new Biblioteca();
    }
    
    public Libro(String sNombre, String sAutor, int iISBN, int iAnio, boolean bPrestado) {
        this.sNombre = sNombre;
        this.sAutor = sAutor;
        this.iISBN = iISBN;
        this.iAnio = iAnio;
        this.bRentado = bPrestado;
    }

    //Metodos Getters
    public String getsNombre() {
        return sNombre;
    }

    public String getsAutor() {
        return sAutor;
    }

    public int getiISBN() {
        return iISBN;
    }

    public int getiAnio() {
        return iAnio;
    }

    public boolean isbRentado() {
        return bRentado;
    }

    public Biblioteca getBibPertenezco() {
        return bibPertenezco;
    }

    //Metodos Setters
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setsAutor(String sAutor) {
        this.sAutor = sAutor;
    }

    public void setiISBN(int iISBN) {
        this.iISBN = iISBN;
    }

    public void setiAnio(int iAnio) {
        this.iAnio = iAnio;
    }

    public void setbRentado(boolean bRentado) {
        this.bRentado = bRentado;
    }

    public void setBibPertenezco(Biblioteca bibPertenezco) {
        this.bibPertenezco = bibPertenezco;
    }
    
}
