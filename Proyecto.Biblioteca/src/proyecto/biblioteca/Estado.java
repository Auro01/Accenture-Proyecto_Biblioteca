/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class Estado {
    private String sNombreEstado;
    private int iIdEstado;
    private Gestor_Biblioteca gBibBibliotecasActuales;
    /*
    * Estado
    *
    * Metodo para la creacion de un objecto Estado dados sin parametros.
     */
    public Estado() {
        this.sNombreEstado = "";
        this.iIdEstado = -1;
        this.gBibBibliotecasActuales = new Gestor_Biblioteca();
    }

    /*
    * Estado
    *
    * Metodo para la creacion de un objecto Estado dados ciertos parametros.
    * @param sNombreEstado es el <code>Nombre<code> del objecto.
    * @param iIdEstado es el <code>Id<code> del objecto.
    * @param gBibBibliotecasActuales es el <code>Gestor de Bibliotecas<code> del objecto.
     */
    public Estado(String sNombreEstado, int iIdEstado,Gestor_Biblioteca gBibBibliotecasActuales) {
        this.sNombreEstado = sNombreEstado;
        this.iIdEstado = iIdEstado;
        this.gBibBibliotecasActuales = gBibBibliotecasActuales;
    }

    //Metodos Getters
    /*
    * getsNombreEstado
    *
    * Metodo para recuper el nombre del objecto.
    * @return sNombreEstado es el <code>Nombre<code> del objecto.
     */
    public String getsNombreEstado() {
        return sNombreEstado;
    }

    /*
    * getiIdEstado
    *
    * Metodo para recuper el ID del objecto.
    * @return iIdEstado es el <code>ID<code> del objecto.
     */
    public int getiIdEstado() {
        return iIdEstado;
    }

    /*
    * getgBibBibliotecasActuales
    *
    * Metodo para recuper el gestor de libros del objecto.
    * @return gBibBibliotecasActuales es el <code>Gestor de Libros<code> del objecto.
     */
    public Gestor_Biblioteca getgBibBibliotecasActuales() {
        return gBibBibliotecasActuales;
    }

    //Metodos Setters
    /*
    * setiIdEstado
    *
    * Metodo modificador el ID del objecto.
    * @param iIdEstado es el <code>ID<code> del objecto.
     */
    public void setiIdEstado(int iIdEstado) {
        this.iIdEstado = iIdEstado;
    }

    /*
    * setsNombreEstado
    *
    * Metodo modificador del nombre del objecto.
    * @param sNombreEstado es el <code>Nombre<code> del objecto.
     */
    public void setsNombreEstado(String sNombreEstado) {
        this.sNombreEstado = sNombreEstado;
    }

    /*
    * setgBibBibliotecasActuales
    *
    * Metodo modificador el gestor de libros del objecto.
    * @param gBibBibliotecasActuales es el <code>Gestor de Bibliotecas<code> del objecto.
     */
    public void setgBibBibliotecasActuales(Gestor_Biblioteca gBibBibliotecasActuales) {
        this.gBibBibliotecasActuales = gBibBibliotecasActuales;
    }
    //Metodos
    /*
    * Imprimir
    *
    * Metodo para imprimir la informacion perrtinente al objecto
     */
    public void Imprimir(){
        System.out.println("Id: " + this.getiIdEstado() + "Nombre: " + this.getsNombreEstado());
    }
}
