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
public class Biblioteca {
    private String sDomicilio,sNombre;
    private int iIdBiblioteca;
    private boolean bAlgoRentado;
    private Estado estPertenezco;
    private Gestor_Libro gLibLibrosActuales;

    //Constructores
    public Biblioteca() {
        this.sDomicilio = "";
        this.sNombre = "";
        this.iIdBiblioteca = -1;
        this.bAlgoRentado = false;
        this.estPertenezco = new Estado();
        this.gLibLibrosActuales = new Gestor_Libro();
    }
    
    public Biblioteca(String sDomicilio, String sNombre, int iIdBiblioteca, boolean bAlgoRentado, Estado estPertenezco,
                      Gestor_Libro gLibLibrosActuales) {
        this.sDomicilio = sDomicilio;
        this.sNombre = sNombre;
        this.iIdBiblioteca = iIdBiblioteca;
        this.bAlgoRentado = bAlgoRentado;
        this.estPertenezco = estPertenezco;
        this.gLibLibrosActuales = gLibLibrosActuales;
    }

    //Metodos Getters
    public String getsDomicilio() {
        return sDomicilio;
    }

    public String getsNombre() {
        return sNombre;
    }

    public int getiIdBiblioteca() {
        return iIdBiblioteca;
    }

    public boolean isbAlgoRentado() {
        return bAlgoRentado;
    }

    public Estado getEstPertenezco() {
        return estPertenezco;
    }

    public Gestor_Libro getgLibLibrosActuales() {
        return gLibLibrosActuales;
    }

    //Metodos Setters
    public void setsDomicilio(String sDomicilio) {
        this.sDomicilio = sDomicilio;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public void setiIdBiblioteca(int iIdBiblioteca) {
        this.iIdBiblioteca = iIdBiblioteca;
    }

    public void setbAlgoRentado(boolean bAlgoRentado) {
        this.bAlgoRentado = bAlgoRentado;
    }

    public void setEstPertenezco(Estado estPertenezco) {
        this.estPertenezco = estPertenezco;
    }

    public void setgLibLibrosActuales(Gestor_Libro gLibLibrosActuales) {
        this.gLibLibrosActuales = gLibLibrosActuales;
    }
    
}
