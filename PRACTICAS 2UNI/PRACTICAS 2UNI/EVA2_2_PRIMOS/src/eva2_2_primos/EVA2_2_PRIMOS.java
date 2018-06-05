/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_primos;

/**
 *
 * @author erika
 */
public class EVA2_2_PRIMOS {

    /**
     * @param args the command line arguments
     */
    static int rapido;
    static int lento;
    public static void main(String[] args) {
        // TODO code application logic here
        int num=27;
        if(primoL(num)){
            System.out.println("El número "+num+" es primo");
            System.out.println("Lento: "+lento);
        }else{
            System.out.println("El número "+num+" no es primo");
        }
        if(primoR(num)){
            System.out.println("El número "+num+" es primo");
            System.out.println("Rápido: "+rapido);
        }else{
            System.out.println("El número "+num+" no es primo");
        }
    }
    
    public static boolean primoL(int num){
        boolean bandera=true;
        lento=0;
        for(int i=2;i<num;i++){
            int residuo=num%i;
            if(residuo==0){
                bandera=false;
                break;
            }
            lento++;
        }
        return bandera;
    }

    public static boolean primoR(int num){
        boolean bandera=true;
        int raiz=(int) Math.sqrt(num)+1;
        rapido=0;
        for(int i=2;i<raiz;i++){
            int residuo=num%i;
            if(residuo==0){
                bandera=false;
                break;
            }
            rapido++;
        }
        return bandera;
    }
}
