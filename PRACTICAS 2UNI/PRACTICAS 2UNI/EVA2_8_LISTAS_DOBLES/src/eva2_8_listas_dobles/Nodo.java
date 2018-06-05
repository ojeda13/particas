/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_listas_dobles;

/**
 *
 * @author erika
 */
public class Nodo {
    //Atributos: 1. dato a almacenar 2. Enlace al siguiente o anterior nodo
    private int miDato;
    private Nodo sig;
    private Nodo prev;

    public Nodo() {
        this.sig = null;
        this.prev=null;
    }

    public Nodo(Nodo prev) {
        this.prev = prev;
    }

    public Nodo(int miDato) {
        this.miDato = miDato;
        this.sig = null;
        this.prev=null;
    }

    public Nodo(int miDato, Nodo sig, Nodo prev) {
        this.miDato = miDato;
        this.sig = sig;
        this.prev=null;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getSig() {
        return sig;
    }

    public int getMiDato() {
        return miDato;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public void setMiDato(int miDato) {
        this.miDato = miDato;
    }
    
    
}
