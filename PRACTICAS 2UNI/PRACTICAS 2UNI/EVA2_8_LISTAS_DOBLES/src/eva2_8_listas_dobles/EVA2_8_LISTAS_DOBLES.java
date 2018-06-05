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
public class EVA2_8_LISTAS_DOBLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble lista1 = new ListaDoble();
        lista1.add(new Nodo(10));
        lista1.add(new Nodo(20));
        lista1.add(new Nodo(30));
        lista1.add(new Nodo(40));
        lista1.add(new Nodo(50));
        lista1.add(new Nodo(60));
        lista1.add(new Nodo(70));
        lista1.printList();
        try {
            lista1.insertAt(new Nodo(99), 4);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        lista1.printList();
        try {
            lista1.removeAt(4);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        lista1.printList();
    }
    
}
