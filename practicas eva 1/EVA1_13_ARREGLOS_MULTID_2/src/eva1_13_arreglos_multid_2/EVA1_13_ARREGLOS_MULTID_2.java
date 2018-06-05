/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_arreglos_multid_2;

/**
 *
 * @author erika
 */
public class EVA1_13_ARREGLOS_MULTID_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]aiMatriz = new int [3][];
        System.out.println(aiMatriz);
        System.out.println(aiMatriz[0][0]);
        aiMatriz [0]= new int[2];
        System.out.println(aiMatriz[0]);
        System.out.println(aiMatriz[0][0]);
        aiMatriz [1]= new int [5];
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[1][3]);
        aiMatriz [2]= new int [10];
        System.out.println(aiMatriz[2]);
        System.out.println(aiMatriz[2][8]);
        for (int i = 0; i < aiMatriz.length; i++) {//FILAS
            for (int j = 0; j < aiMatriz[i].length; j++) {//columnas
                System.out.println(aiMatriz [i][j]);
                
            }
            
        }
    
    }
    
}
