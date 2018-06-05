/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_memoria_objetos;

/**
 *
 * @author erika
 */
public class EVA1_2_MEMORIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iOtroVal = 10;
        double dSalario = 500.50;
        Prueba pObj = new Prueba();
        System.out.println("iOtroVal = "+ iOtroVal);
        System.out.println("dSalario = "+ dSalario);//ESTOY IMPRIMIENDO LA REFERENCIA
        //(DIRECCION EN MEMORIA)
        System.out.println("pObj= "+ pObj);
        System.out.println("valor de iVal = "+ pObj.iVal);
    }
    
}

class Prueba {
    int iVal = 5;
}
