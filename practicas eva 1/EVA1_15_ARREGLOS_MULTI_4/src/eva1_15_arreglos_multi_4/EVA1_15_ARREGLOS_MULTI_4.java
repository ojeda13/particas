/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_arreglos_multi_4;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EVA1_15_ARREGLOS_MULTI_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [][] aiEdades;
    int iNoGrp, iNoAlu;
    Scanner scCaptu = new Scanner(System.in);
    
        System.out.println("introduce el# de grupos: ");
        iNoGrp = scCaptu.nextInt();
        
        aiEdades = new int [iNoGrp][];
        
        
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("cuantos alumnos tiene el grupo" +(i+1)+":");
            iNoAlu =scCaptu.nextInt();
            aiEdades[i] = new int[iNoAlu];
             }
        //CAPTURA LAS EDADES : RECORREL EL ARREGLO
        for (int i = 0; i < aiEdades.length; i++) {//filas (grupos)
            for (int j = 0; j < aiEdades[i].length; j++) {//ALUMNOS PARA EL GRUPO
            System.out.println("cual es la edad grupo " + i + " -alumno " + j + "?");{
            aiEdades[i][j]= scCaptu.nextInt();//capturamos la edad
            }
            }
        }
            //imprimir la edades capturadas
             for (int i = 0; i < aiEdades.length; i++) {//filas (grupos)
            for (int j = 0; j < aiEdades[i].length; j++) {//ALUMNOS PARA EL GRUPO
            System.out.println("cual es la edad grupo " + i + " -alumno " + j + aiEdades[i][j]);
           }
            
             }
             //calcular el promedio de edades
            int iAcum, iAcumTodos = 0, iAcumNoAlu = 0;
                 for (int i = 0; i < aiEdades.length; i++) {
                 iAcum = 0;
                 iAcumNoAlu = iAcumNoAlu + aiEdades [i].length;
                     for (int j = 0; j < aiEdades[i].length; j++) {
                     iAcum = iAcum + aiEdades [i][j];
                     iAcumTodos = iAcumTodos +aiEdades [i][j];
                    }
                 
                     System.out.println("el promedio pare el grupo"+ i + "=" + (iAcum /aiEdades[i].length));
    }
                    System.out.println("el promedio de todos los grupos es"+(iAcumTodos / iAcumNoAlu)); 

}
        
}



            
            
    

