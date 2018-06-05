/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

/**
 *
 * @author erika
 */
public class MyQueue {
    private Nodo nIni;
    private Nodo nFin;
    private int contador;

    public MyQueue() {
        this.nIni = null;
        this.nFin = null;
        contador=0;
    }
    public MyQueue(Nodo nIni) {
        this.nIni = nIni;
        this.nFin = nIni;
        contador=1;
    }
    
    public void add(Nodo nNodo){
         if (nIni == null) {//la lista esta vacia
            nIni = nNodo;
            nFin = nNodo;

        } else {//la lista tiene elementos
            //hay que movernos al final de la lista
            Nodo nTemp=nIni;
            while(nTemp.getSig()!=null){
                nTemp=nTemp.getSig();
            }
            //CONECTAR EL NUEVO NODO AL FINAL DE LA LISTA
            nTemp.setSig(nNodo);
            nNodo.setPrev(nTemp);
            nFin.setSig(nNodo);
            nFin=nNodo;
         }
    }
    public int peek() throws Exception{//lee primer nodo de la lista
        if(nIni==null){//LISTA VACIA
            throw new Exception("No hay elementos en la lista");
        }
        return nIni.getMiDato();
    }
    public int pop() throws Exception{//LEE EL NODO Y LO ELIMINA (PRIMER NODO)
        if(nIni==null){
            throw new Exception("No hay elementos en la lista");
        }if(nIni.getSig()==null){
            Nodo nTemp=nIni;
            nIni=null;
            nFin=null;
            return nTemp.getMiDato();
        }else{
            Nodo nTemp=nIni;
            nIni.getSig().setPrev(null);
            nIni=nIni.getSig();
            return nTemp.getMiDato();
        }
        //es una lista doble, hay que reconectar en ambos sentidos
        //verifique los casos: no hay nodos, un nodo, hay n nodos.
        //que pasa con nIni y nFin
    }
}
