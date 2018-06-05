/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_copia_arreglos_2;

/**
 *
 * @author erika
 */
public class EVA1_8_COPIA_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int aiDatosOrigen[] = new int[5];
    aiDatosOrigen[0] =10;
    aiDatosOrigen[1] =20;
    aiDatosOrigen[2] =30;
    aiDatosOrigen[3] =40;
    //MI COPIA DEL ARREGLO
    int aiCopia[] = new int[aiDatosOrigen.length];
    //NO SIRVE
    //aiCopia =aiDatosOrigen;
    for(int i =0; i< aiDatosOrigen.length; i++){
        aiCopia [i]=aiDatosOrigen[i];
        System.out.println(aiCopia[i]);
    }
    //mMODIFICAR ORIGUINAL
    aiDatosOrigen[3] = 99999;
    //imprimir copia
    System.out.println("reimprimir la copea");
    for(int i =0; i< aiCopia.length; i++){
        System.out.println(aiCopia[i]);
    }
    System.out.println(aiDatosOrigen);
    System.out.println(aiCopia);
    
    }
    
    
    }
    

