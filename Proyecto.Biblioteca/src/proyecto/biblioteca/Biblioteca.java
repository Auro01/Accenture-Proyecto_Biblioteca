/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class Biblioteca {
    private String sDomicilio,sNombre;
    private int iIdBiblioteca;
    private boolean bAlgoRentado;
    private Estado estPertenezco;
    private Gestor_Libro gLibLibrosActuales;

    //Constructores
    /*
    *Biblioteca
    *
    *Metodo para la creacion de un objecto biblioteca sin parametros.
    *
     */
    public Biblioteca() {
        this.sDomicilio = "";
        this.sNombre = "";
        this.iIdBiblioteca = -1;
        this.bAlgoRentado = false;
        this.estPertenezco = new Estado();
        this.gLibLibrosActuales = new Gestor_Libro();
    }
    /*
    * Biblioteca
    *
    * Metodo para la creacion de un objecto biblioteca dados ciertos parametros.
    * @param sDomicilio es el <code>Domicilio<code> del objecto.
    * @param sNombre es el <code>Nombre<code> del objecto.
    * @param iIdBiblioteca es el <code>Id<code> del objecto.
    * @param bAlgoRentado es un booleano corrependiente <code>Todos los libros estan disponibles<code> del objecto.
    * @param estPertenezco es el <code>Estado<code> al que pertence el objecto.
    * @param gLibLibrosActuales es el <code>Gestor de Libros<code> del objecto.
     */
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

    /*
    * getsDomicilio
    *
    * Metodo para recuper el domicilio del objecto.
    * @return sDomicilio es el <code>Domicilio<code> del objecto.
     */
    public String getsDomicilio() {
        return sDomicilio;
    }

    /*
    * getsNombre
    *
    * Metodo para recuper el nombre del objecto.
    * @return sNombre es el <code>Nombre<code> del objecto.
     */
    public String getsNombre() {
        return sNombre;
    }

    /*
    * getiIdBiblioteca
    *
    * Metodo para recuper el ID del objecto.
    * @return iIdBiblioteca es el <code>ID<code> del objecto.
     */
    public int getiIdBiblioteca() {
        return iIdBiblioteca;
    }

    /*
    * isbAlgoRentado
    *
    * Metodo para recuper el estado del booleano correpondiente a si todos los libros estan disponibles.
    * @return bAlgoRentado es un booleano correpondiente <code>Todos los libros estan disponibles<code> del objecto.
     */
    public boolean isbAlgoRentado() {
        return bAlgoRentado;
    }

    /*
    * getEstPertenezco
    *
    * Metodo para recuper el Estado al que pertence el objecto.
    * @return estPertenezco es el <code>Nombre<code> al que pertence el objecto.
     */
    public Estado getEstPertenezco() {
        return estPertenezco;
    }

    /*
    * getgLibLibrosActuales
    *
    * Metodo para recuper el gestor de libros del objecto.
    * @return gLibLibrosActuales es el <code>Gestor de Libros<code> del objecto.
     */
    public Gestor_Libro getgLibLibrosActuales() {
        return gLibLibrosActuales;
    }

    //Metodos Setters

    /*
    * setsDomicilio
    *
    * Metodo modificador del domicilio del objecto.
    * @param sDomicilio es el <code>Domicilio<code> del objecto.
     */
    public void setsDomicilio(String sDomicilio) {
        this.sDomicilio = sDomicilio;
    }

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
    * setiIdBiblioteca
    *
    * Metodo modificador el ID del objecto.
    * @param iIdBiblioteca es el <code>ID<code> del objecto.
     */

    public void setiIdBiblioteca(int iIdBiblioteca) {
        this.iIdBiblioteca = iIdBiblioteca;
    }
    /*
    * setbAlgoRentado
    *
    * Metodo modificador del estado del booleano correpondiente a si todos los libros estan disponibles.
    * @param bAlgoRentado es un booleano correpondiente <code>Todos los libros estan disponibles<code> del objecto.
     */
    public void setbAlgoRentado(boolean bAlgoRentado) {
        this.bAlgoRentado = bAlgoRentado;
    }

    /*
    * setEstPertenezco
    *
    * Metodo modificador el Estado al que pertence el objecto.
    * @param estPertenezco es el <code>Nombre<code> al que pertence el objecto.
     */
    public void setEstPertenezco(Estado estPertenezco) {
        this.estPertenezco = estPertenezco;
    }

    /*
    * setgLibLibrosActuales
    *
    * Metodo modificador el gestor de libros del objecto.
    * @param gLibLibrosActuales es el <code>Gestor de Libros<code> del objecto.
     */
    public void setgLibLibrosActuales(Gestor_Libro gLibLibrosActuales) {
        this.gLibLibrosActuales = gLibLibrosActuales;
    }

    //Metodos
    /*
    * Imprimir
    *
    * Metodo para imprimir la informacion perrtinente al objecto
     */
    public void Imprimir(){
        System.out.println("Id: " + this.getiIdBiblioteca() + "Nombre: " + this.getsNombre() + "Domcilio: " +
                this.getsDomicilio() + "Estado: " + this.getEstPertenezco().getsNombreEstado());
    }

    /*
    * Imprimir
    *
    * Metodo para imprimir la informacion perrtinente al objecto
     */
    public void ImprimirLibrosDisponibles(){
            System.out.println("Libros Disponbles:");

            for (Libro actual : this.gLibLibrosActuales.getLibros()) {
                if (actual.isbRentado()) {
                    actual.Imprimir();
                }
            }
        }



    /*
    * Imprimir
    *
    * Metodo para imprimir la informacion perrtinente al objecto
     */
    public void ImprimirLibrosRentados(){
        if (this.isbAlgoRentado()) {
            System.out.println("Libros Disponbles:");

            for (Libro actual : this.gLibLibrosActuales.getLibros()) {
                if (actual.isbRentado()) {
                    actual.Imprimir();
                }
            }
        }
        else {
            System.out.println("No hay ningun libro rentado");
        }
    }
}
