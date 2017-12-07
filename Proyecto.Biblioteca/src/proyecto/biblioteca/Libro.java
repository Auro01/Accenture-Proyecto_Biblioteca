/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class Libro {
    private String sNombre,sAutor;
    private int iISBN,iAnio;
    private boolean bRentado;
    private Biblioteca bibPertenezco;

    /*
    * Libro
    *
    * Metodo para la creacion de un objecto Libro sin parametros.
    * @param sNombre es el <code>Nombre<code> del objecto.
    * @param sAutor es el <code>Autor<code> del objecto.
    * @param iISBN es el <code>ISBN<code> del objecto.
    * @param iAnio es el <code>Anio<code> del objecto.
    * @param bRentado es el <code>Estatus de rentando<code> del objecto.
     */
    public Libro() {
        this.sNombre = "";
        this.sAutor = "";
        this.iISBN = -1;
        this.iAnio = -1;
        this.bRentado = false;
        this.bibPertenezco = new Biblioteca();
    }

    /*
    * Libro
    *
    * Metodo para la creacion de un objecto Libro dados ciertos parametros.
    * @param sNombre es el <code>Nombre<code> del objecto.
    * @param sAutor es el <code>Autor<code> del objecto.
    * @param iISBN es el <code>ISBN<code> del objecto.
    * @param iAnio es el <code>Anio<code> del objecto.
    * @param bRentado es el <code>Estatus de rentando<code> del objecto.
     */
    public Libro(String sNombre, String sAutor, int iISBN, int iAnio, boolean bPrestado) {
        this.sNombre = sNombre;
        this.sAutor = sAutor;
        this.iISBN = iISBN;
        this.iAnio = iAnio;
        this.bRentado = bPrestado;
    }

    //Metodos Getters
    /*
    * getsNombre
    *
    * Metodo para recuperar el nombre del objecto.
    * @return sNombre es el <code>Nombre<code> del objecto.
     */
    public String getsNombre() {
        return sNombre;
    }

    /*
   * getsAutor
   *
   * Metodo para recuperar el autor del objecto.
   * @return sAutor es el <code>Autor<code> del objecto.
    */
    public String getsAutor() {
        return sAutor;
    }

    /*
    * getiISBN
    *
    * Metodo para recuperar el ISBN del objecto.
    * @return iISBN es el <code>ISBN<code> del objecto.
     */
    public int getiISBN() {
        return iISBN;
    }

    /*
    * getiAnio
    *
    * Metodo para recuperar el anio del objecto.
    * @return iAnio es el <code>Anio<code> del objecto.
     */
    public int getiAnio() {
        return iAnio;
    }

    /*
    * isbRentado
    *
    * Metodo para recuperar el estatus de si esta rentando o no del objecto.
    * @return bRentado es el <code>Estatus de rentando<code> del objecto.
     */
    public boolean isbRentado() {
        return bRentado;
    }

    /*
    * getBibPertenezco
    *
    * Metodo para recuperar la biblioteca al que pertenece objecto.
    * @return bibPertenezco es el <code>Biblioteca<code> al que pertenece el objecto.
     */
    public Biblioteca getBibPertenezco() {
        return bibPertenezco;
    }

    //Metodos Setters
    /*
    * setsNombre
    *
    * Metodo modificador del nombre del objecto.
    * @param sNombre es el <code>Nombre<code> del objecto.
     */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /*
    * setsAutor
    *
    * Metodo modificador del autor del objecto.
    * @param sAutor es el <code>Autor<code> del objecto.
     */
    public void setsAutor(String sAutor) {
        this.sAutor = sAutor;
    }

    /*
    * setiISBN
    *
    * Metodo modificador del ISBN del objecto.
    * @param iISBN es el <code>ISBN<code> del objecto.
     */
    public void setiISBN(int iISBN) {
        this.iISBN = iISBN;
    }

    /*
    * setiAnio
    *
    * Metodo modificador del anio del objecto.
    * @param iAnio es el <code>Anio<code> del objecto.
     */
    public void setiAnio(int iAnio) {
        this.iAnio = iAnio;
    }

    /*
    * setbRentado
    *
    * Metodo modificador del estatus de si esta rentando o no del objecto.
    * @param bRentado es el <code>Estatus de rentando<code> del objecto.
     */
    public void setbRentado(boolean bRentado) {
        this.bRentado = bRentado;
    }

    /*
    * setBibPertenezco
    *
    * Metodo modificador de la biblioteca al que pertenece objecto.
    * @param bibPertenezco es el <code>Biblioteca<code> al que pertenece el objecto.
     */
    public void setBibPertenezco(Biblioteca bibPertenezco) {
        this.bibPertenezco = bibPertenezco;
    }

    //Metodos
    /*
    * Imprimir
    *
    * Metodo para imprimir la informacion perrtinente al objecto
     */
    public void Imprimir(){
        System.out.print("ISBN: " + this.getiISBN() + "Nombre: " + this.getsNombre() + "Autor: " +
                this.getsAutor() + "Año: " + this.getiAnio() + "Estatus: ");
        if (this.isbRentado()){
            System.out.print("Rentado\n");
        }
        else {
            System.out.print("Disponible\n");
        }
    }
}
