/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_comparator;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


/**
 *
 * @author erika
 */
public class EVA2_17_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> ListaOrdInv = new LinkedList<>();
        ListaOrdInv.add("Juan");
        ListaOrdInv.add("Alonso");
        ListaOrdInv.add("Zaire");
        ListaOrdInv.add("Barrientos");
        ListaOrdInv.add("Barriendo");
        System.out.println(ListaOrdInv);
        Collections.sort(ListaOrdInv);
        System.out.println(ListaOrdInv);
        //ORDENAR DE LA Z A LA A
        //Comparator cmOrdenaZ A;
        Comparator cmOrdenaZ_A = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String cade1, cade2;
                cade1=(String)o1;
                cade2=(String)o2;
                int resu=0, resta=0, largo=0;
                char c1, c2;
                c1=cade1.charAt(0);
                c2=cade2.charAt(0);
                resu=c2-c1;
                resta=cade2.length()-cade1.length();
                if(resta<0){
                    largo=cade1.length();
                }else{
                    largo=cade2.length();
                }
                if(resu==0){
                    for(int i=0;i<largo;i++){
                        c1=cade1.charAt(i);
                        c2=cade2.charAt(i);
                        resu=c2-c1;
                        if(resu!=0){
                            i=largo;
                        }
                    }
                }
                return resu;
            }
        };
        Collections.sort(ListaOrdInv, cmOrdenaZ_A);
        System.out.println(ListaOrdInv);
    }
    
}
