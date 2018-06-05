/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erika
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("inicia MAIN");
        A();
        System.out.println("termina MAIN");
    }
    
    public static void A(){
        System.out.println("inicia A");
        B();
        System.out.println("termina A");
        
    }
    public static void B(){
        System.out.println("inicia B");
        C();
        System.out.println("termina B");
    }
    public static void C(){
        System.out.println("inicia C");
        D();
        System.out.println("termina C");
    }
    public static void D(){
        System.out.println("inicia D");
        System.out.println("termina D");
    }
        
    
}
