/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_arreglos_1;

/**
 *
 * @author erika
 */
public class EVA1_7_COPIA_ARREGLOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int aiDatosOrigen[]= new int[5];
    aiDatosOrigen[0] =10;
    aiDatosOrigen[1] =20;
    aiDatosOrigen[2] =30;
    aiDatosOrigen[3] =40;
    //MI COPIA DEL ARREGLO
    int aiCopia[];
    aiCopia = aiDatosOrigen;
    //IMPRIMIR COPIA
    for(int i =0; i< aiCopia.length; i++){
        System.out.println(aiCopia[i]);
    }
    System.out.println(aiDatosOrigen);
    System.out.println(aiCopia);
                }
   
    }
    

