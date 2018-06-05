/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_1_tipos_primitivos;

import com.sun.jmx.snmp.BerDecoder;

/**
 *
 * @author erika
 */
public class EVA1_1_TIPOS_PRIMITIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int INumMax=Integer.MAX_VALUE;
        System.out.println(INumMax);
        int INumMin=Integer.MIN_VALUE;
        System.out.println(INumMin);
        INumMax++;
        System.out.println(INumMax);
        long INumerote = Integer.MAX_VALUE;
        INumerote++;
        System.out.println("Numerote " + INumerote);
        
    }
    
}
