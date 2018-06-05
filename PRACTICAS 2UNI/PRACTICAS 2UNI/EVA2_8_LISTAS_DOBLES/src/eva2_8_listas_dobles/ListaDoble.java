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
public class ListaDoble {
    private Nodo nIni;
    private Nodo nFin;
    private int contador;
    
    public ListaDoble() {
        this.nIni = null;
        this.nFin = null;
        contador=0;
    }

    public ListaDoble(Nodo nNodo) {
        this.nIni = nIni;
        this.nFin = nIni;
        contador=1;
    }
    
    public void add(Nodo nNodo){
         if (nIni == null) {//la lista esta vacia
            nIni = nNodo;
            nFin = nNodo;
        } else {//la lista tiene elementos
            //hay que overnos al final de la lista
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
        contador++;
    }
    
    public void printList(){
        Nodo nTemp=nIni;
        System.out.println("");
        System.out.println("Orden normal:");
        while(nTemp!=null){
            System.out.print(nTemp.getMiDato()+" - ");
            nTemp=nTemp.getSig();
        }
        System.out.println("");
        System.out.println("Orden hacia atrás:");
        nTemp=nFin;
        while(nTemp!=null){
            System.out.print(nTemp.getMiDato()+" - ");
            nTemp=nTemp.getPrev();
        }
    }
    
    public void clear(){
        nIni=null;
        nFin=null;
    }
    
    public boolean isEmpty(){
        if(nIni!=null){
            return false;//SI HAY NODOS EN LA LISTA
        }else
            return true;//NO HAY NODOS EN LA LISTA
    }
    
    public int count(){
        int contador=0;
            Nodo nTemp=nIni;
        while(nTemp!=null){
            contador++;
            nTemp=nTemp.getSig();
        }
        return contador;
    }
    
    public void insertAt(Nodo nNodo, int pos) throws Exception{
        //ANALICEN LOS DIFERENTES CASOS
        if(pos<0){//LA PRIMER POSICION ES CERO
            throw new Exception("No se pueden insertar nodos en posiciones antes que el cero");
        }else if(pos>count()){//SI QUEREMOS INSERTAR MÁS ALLÁ DEL TAMAÑO DE LA LISTA
            throw new Exception("No se pueden insertar nodos en posiciones mayores al tamaño de la lista");
        }else if(pos==0){//SE QUIERE INSERTAR AL INICIO DE LA LISTA
            nNodo.setSig(nIni);//Nuevo.siguiente=nIni
            nIni.setPrev(nNodo);
            nIni=nNodo;
        }else{
            Nodo nTemp=nIni;
            for(int i=0;i<(pos-1);i++){
                nTemp=nTemp.getSig();
            }
            nNodo.setSig(nTemp.getSig());
            nNodo.setPrev(nTemp);
            Nodo nTemp2=nTemp.getSig();
            nTemp.setSig(nNodo);
            nTemp2.setPrev(nNodo);
        }
        contador++;
    }
    
    public int getValueAt(int pos) throws Exception{
        if(pos<0){//LA PRIMER POSICION ES CERO
            throw new Exception("No se pueden insertar nodos en posiciones antes que el cero");
        }else if(pos>count()){//SI QUEREMOS INSERTAR MÁS ALLÁ DEL TAMAÑO DE LA LISTA
            throw new Exception("No se pueden insertar nodos en posiciones mayores al tamaño de la lista");
        }
        Nodo nTemp=nIni;
        for(int i=0;i<pos;i++){
            nTemp=nTemp.getSig();
        }
        return nTemp.getMiDato();
    }
    
     public int find(int val){
        int resul=-1;
        //BUSCAR EL ELEMENTO
        int pos=0;
        Nodo nTemp=nIni;
        while(nTemp!=null){
            if(nTemp.getMiDato()==val){
                resul=pos;
                break;
            }
            nTemp=nTemp.getSig();
            pos++;
        }
        return resul;
    }
     
     public void removeAt(int pos) throws Exception{
        if(pos<0){//LA PRIMER POSICION ES CERO
            throw new Exception("No se pueden insertar nodos en posiciones antes que el cero");
        }else if(pos>count()){//SI QUEREMOS INSERTAR MÁS ALLÁ DEL TAMAÑO DE LA LISTA
            throw new Exception("No se pueden insertar nodos en posiciones mayores al tamaño de la lista");
        }else{//AQUÍ SI PUEDEN BORRAR
            //SI EL NODO A BORRAR ES EL CERO Y SOLOHAY UN NODO EN LA LISTA
            if((pos==0)&&(count()==1)){
                nIni=null;
                nFin=null;
            }
            Nodo nTemp=nIni;
            for(int i=0;i<(pos-1);i++){
            nTemp=nTemp.getSig();
            }
            Nodo nTemp2=nTemp.getSig().getSig();
            if(nTemp2==null){
                nFin=nTemp.getSig();
            }else{
                nTemp2.setPrev(nTemp);
            }
            nTemp.setSig(nTemp.getSig().getSig());
            if(nTemp.getSig()==null){//BORRAMOS EL ÚLTIMO NODO DE LA LISTA
                nFin=nTemp;
            }
            contador--;//SI BORRAMOS UN NODO, DECREMENTAMOS EL CONTEO
        }
    }
}

