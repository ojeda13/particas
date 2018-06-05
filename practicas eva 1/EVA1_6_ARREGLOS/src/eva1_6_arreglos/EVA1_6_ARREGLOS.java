/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_arreglos;

import java.util.Scanner;

/**
 *
 * @author Tania
 */
public class EVA1_6_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edades[];
        Scanner scCaptu=new Scanner(System.in);//CAPTURA DESDE TECLADO
        //System.out.println(edades[5]); ERROR, SE DEBE INICIALIZAR (NEW)
        System.out.println("Introduce la cantidad de esades a capturar: ");
        int cant=scCaptu.nextInt();//CAPTURA DESDE EL TECLADO, AL DAR ENTER, UN ENTERO
        edades=new int[cant];
        for(int i=0;i<edades.length;i++){
            System.out.println("Introduce la edad: ");
            edades[i]=scCaptu.nextInt();
        }
        //IMPRIMIR EDAD
        //for(variable:arreglo) for-each--> para-cada
        for(int b:edades){
            System.out.println("Edad = "+b);
        }
    }
    
}