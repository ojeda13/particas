/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_un_millon;

/**
 *
 * @author erika
 */
public class EVA2_1_UN_MILLON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arre= new int[300000000];
        for(int i=0;i<arre.length;i++){
            arre[i]=(int) ((Math.random()*1000)+1);
        }
    }
    
}
