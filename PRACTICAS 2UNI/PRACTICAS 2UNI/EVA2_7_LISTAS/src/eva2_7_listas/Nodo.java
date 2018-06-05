/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_listas;

/**
 *
 * @author erika
 */
public class Nodo {
    //ATRIBUTOS: 1. DATO A ALMACENAR. 2. ENLACE AL SIG. O ANTERIOR NODO
    private int miDato;
    private Nodo sig;

    public Nodo() {
    }

    public Nodo(int miDato, Nodo sig) {
        this.miDato = miDato;
        this.sig = sig;
    }

    public Nodo(int miDato) {
        this.sig=null;
        this.miDato = miDato;
    }

    public int getMiDato() {
        return miDato;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setMiDato(int miDato) {
        this.miDato = miDato;
    }
    
    
}
