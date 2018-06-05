/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_inicio_listas;

/**
 *
 * @author erika
 */
public class EVA2_6_INICIO_LISTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo n1=new Nodo();
        n1.miDato=10;
        n1.enlace=null;
        Nodo n2=new Nodo();
        n2.miDato=20;
        n2.enlace=null;
        Nodo n3=new Nodo();
        n3.miDato=30;
        n3.enlace=null;
        //HASTA AQUÍ, CADA NODO ES INDEPENDIENTE. HAY QUE ENLAZARLOS
        //NODO1-->NODO2--->NODO3--->NULL
        n1.enlace=n2;
        n2.enlace=n3;
        //PROBAR LA CADENA DE NODOS
        System.out.println("Nodo 1= "+n1.miDato);
        System.out.println("Nodo 2= "+n2.miDato);
        System.out.println("Nodo 2(cadena)= "+n1.enlace.miDato);
        System.out.println("Nodo 3= "+n3.miDato);
        System.out.println("Nodo 3(cadena)= "+n1.enlace.enlace.miDato);
        //RECORRER UNA LISTA:
        Nodo nTemp=n1;
        while(nTemp!=null){
            System.out.println("Nodo = "+nTemp.miDato);
            nTemp=nTemp.enlace;
        }
    }
    
}
class Nodo{
    public int miDato;//ESTO ES LO QUE GUARDAMOS (DATOS)
    public Nodo enlace;//ENLACE PARA CREAR LA LISTA (CADENA DE NODOS)
}
