/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_factorial;

/**
 *
 * @author Tania
 */
public class EVA2_5_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5= "+numF(5));
        System.out.println("Sumatoria de 5= "+numS(5));
    }
    
    public static int numF(int x){
        //UNA CONDICION PARA DETENER
        if(x==0){
            return 1;
        }
        //UNA LLAMADA RECURSIVA
        else{
            return x*numF(x-1);
        }
    }
    //CALCULAR LA SUMATORIA RECURSIVAMENTE
    public static int numS(int y){
        if(y==0){
            return 0;
        }else{
            return y+numS(y-1);
        }
    }
}
