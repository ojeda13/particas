/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erika
 */
public class EVA2_7_LISTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListasSim lista1=new ListasSim();
        for(int i=0;i<10;i++){
            lista1.add(new Nodo(30));
           // System.out.println("hay "+lista1.count()+" nodo(s)");
        }
        lista1.printList();
        try {
            lista1.insertAt(new Nodo(99999), 10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("");
        lista1.printList();
        System.out.println("");

        try {
            System.out.println("Valor en posicion 2: "+lista1.getValueAt(2));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_7_LISTAS.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("");
        System.out.println("Buscamos 9999, y está en la posición: "+lista1.find(99999));
        System.out.println("Buscamos 30, y está en la posición: "+lista1.find(30));
        
        //BORRAR
        try {
            lista1.removeAt(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("");
        lista1.printList();
        lista1.add(new Nodo(1111));
        System.out.println("");
        lista1.printList();
         /*
            if(lista1.isEmpty()){
            System.out.println("Lista vacia");
            }else
            System.out.println("Hay elementos en la lista");
            lista1.printList();
            try {
            lista1.insertAt(new Nodo(5), -7);
            } catch (Exception ex) {
            ex.printStackTrace();
            }*/
    }
    
}
//LOS COLLECTION EN JAVA (Y OTROS AMBIENTES) USAN DOS CLASES: UNA
//CLASE PARA LA ESTRUCTURA DE DATOS (LISTA, COLA, PILA, ETC.)