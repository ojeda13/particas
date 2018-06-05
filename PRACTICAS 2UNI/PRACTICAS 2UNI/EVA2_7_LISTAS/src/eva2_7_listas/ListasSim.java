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
public class ListasSim {
    private Nodo nIni;//EL NODO QUE MARCA EL INICIO DE LA LISTA
    private Nodo nFin;
    private int contador;
    public ListasSim(){
        nIni=null;
        nFin=null;
        contador=0;
    }

    public ListasSim(Nodo nIni) {
        this.nIni = nIni;
        this.nFin = nIni;
        contador=1;
    }
    
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add(Nodo nNodo){
        if(nIni==null){//LA LISTA ESTÁ VACIA
            nIni=nNodo;
            nFin=nNodo;
        }else{//LA LISTA TIENE ELEMENTOS
            //HAY QUE MOVERNOS AL FINAL DE LA LISTA
            Nodo nTemp=nIni;
            while(nTemp.getSig()!=null){
                nTemp=nTemp.getSig();
            }
            //CONECTAR EL NUEVO NODO AL FINAL DE LA LISTA
            nTemp.setSig(nNodo);
            nFin.setSig(nNodo);
            nFin=nNodo;
        }
        contador++;//CADA VEZ QUE AGREGAMOS UN NODO, INCREMENTAMOS 
    }
    //IMPRIMIR DATOS DE LA LISTA
    public void printList(){
        Nodo nTemp=nIni;
        while(nTemp!=null){
            System.out.print(nTemp.getMiDato()+" - ");
            nTemp=nTemp.getSig();
        }
    }
    //ELIMINAR TODOS LOS ELEMENTOS DE LA LISTA:
    public void clear(){
        nIni=null;
        nFin=null;
    }
    //DEVUELVE TRUE SI LA LISTA ESTÁ VACÍA
    public boolean isEmpty(){
        if(nIni!=null){
            return false;//SI HAY NODOS EN LA LISTA
        }else
            return true;//NO HAY NODOS EN LA LISTA
    }
    //CONTAR LOS ELEMENTOS EN LA LISTA
    public int count(){
        /*int contador=0;
            Nodo nTemp=nIni;
        while(nTemp!=null){
            contador++;
            nTemp=nTemp.getSig();
        }
        return contador;*/
        return contador;
    }
    //INSERTAR EN UNA POSICIÓN ESPECIFICA
    public void insertAt(Nodo nNodo, int pos) throws Exception{
        //ANALICEN LOS DIFERENTES CASOS
        if(pos<0){//LA PRIMER POSICION ES CERO
            throw new Exception("No se pueden insertar nodos en posiciones antes que el cero");
        }else if(pos>count()){//SI QUEREMOS INSERTAR MÁS ALLÁ DEL TAMAÑO DE LA LISTA
            throw new Exception("No se pueden insertar nodos en posiciones mayores al tamaño de la lista");
        }else if(pos==0){//SE QUIERE INSERTAR AL INICIO DE LA LISTA
            nNodo.setSig(nIni);//Nuevo.siguiente=nIni
            nIni=nNodo;
        }else{
            Nodo nTemp=nIni;
            for(int i=0;i<(pos-1);i++){
                nTemp=nTemp.getSig();
            }
            nNodo.setSig(nTemp.getSig());
            nTemp.setSig(nNodo);
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
    //ENCONTRAR UN ELEMENTO (DEVOLVER SU POSICION)
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
    //ELIMINAR UN NODO EN UNA POSICIÓN
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
            nTemp.setSig(nTemp.getSig().getSig());
            if(nTemp.getSig()==null){//BORRAMOS EL ÚLTIMO NODO DE LA LISTA
                nFin=nTemp;
            }
            contador--;//SI BORRAMOS UN NODO, DECREMENTAMOS EL CONTEO
        }
    }
}
