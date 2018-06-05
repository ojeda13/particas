/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_buscar_arreglos;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EVA1_17_BUSCAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int [] aiDatos = new int [5];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos [i] = (int)(Math.random() *10) +1 ;
            System.out.println(aiDatos[i]+ "");
            }
        
        Scanner scCaptu=new Scanner(System.in);
        System.err.println("que valor buscas");
        int iVal = scCaptu.nextInt();
            for (int i = 0; i < aiDatos.length; i++) {
                if (iVal == aiDatos[i]){
                    System.out.println("el valor estaa en la posicion" + i);
                    //SIQUEREMOS DETENERLO USAR UN BREACK;
                }
                
            }
        
        
    }
    
}
