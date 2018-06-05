/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_collection_sort;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author erika
 */
public class EVA2_16_COLLECTION_SORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> Milista = new LinkedList<>();
        Milista.add("Hola");
        Milista.add(" ");
        Milista.add("Mundo");
        Milista.add(" ");
        Milista.add("cruel");
        Milista.add("!!");
        System.out.println(Milista);
        Collections.sort(Milista);
        System.out.println("");
        for(String string : Milista){
            System.out.println(string);
        }
        
        LinkedList <Integer> Milista2 = new LinkedList<>();
        Milista2.add(10);
        Milista2.add(50);
        Milista2.add(20);
        Milista2.add(15);
        Milista2.add(54);
        Milista2.add(96);
        System.out.println(Milista2);
        Collections.sort(Milista2);
        System.out.println("");
        for(Integer integer : Milista2){
            System.out.println(integer);
        }
    }
    
}
