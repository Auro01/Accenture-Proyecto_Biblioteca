/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 * @author Java
 */
public class Gestor_Estado {

    ArrayList<Estado> listaEstados ;

    public Gestor_Estado() {
        this.listaEstados = new ArrayList<Estado>();
    }

    public Gestor_Estado(ArrayList<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public void agregarE(Estado est) {
        System.out.println("HI");
        listaEstados.add(est);
    }

    public void eliminarE(int idEstado) {
        int index = 0;
        for (Estado estActual : listaEstados) {
            if (idEstado == estActual.getiIdEstado()) {
                System.out.println(estActual.getsNombreEstado() + " se ha removido");
                listaEstados.remove(index);
                return;
            }
            index++;
        }
        System.out.println("No existe el estado con id: " + idEstado);
        return;
    }

    public void mostrarE(int idEstado) {

        for (Estado estActual : listaEstados) {
            if (estActual.getiIdEstado() == idEstado) {
                System.out.println(estActual.getsNombreEstado());
            }
        }
    }

    public void ImprimirEstados(){
        for (Estado estActual : listaEstados) {
            estActual.Imprimir();
        }
    }
    public Estado selecionarEstado(int idEstado){
        for (Estado estActual : listaEstados) {
            if (estActual.getiIdEstado() == idEstado) {
                return estActual;
            }
        }
        return null;
    }
}
