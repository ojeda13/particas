/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_ordenamiento;

/**
 *
 * @author erika
 */
public class EVA3_1_ORDENAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] aiPrueba = new int[1000];
        int [] aiPrueba2 = new int[1000];
        for (int i = 0; i < aiPrueba.length; i++) {
            aiPrueba[i] = (int)(Math.random()*100);
             aiPrueba2[i] = (int)(Math.random()*100);
           
        }
        System.out.println(" Datos de origen");
        ImprimirArreglo(aiPrueba);
        long lIni=System.nanoTime();
        selectionSort(aiPrueba);
        long lFin=System.nanoTime();
        System.out.println("tardo:"+(lFin-lIni)+ " mil segundos");
        System.out.println("Arreglo ordenado");
        ImprimirArreglo(aiPrueba);
        
        System.out.println(" Datos de origen");
        ImprimirArreglo(aiPrueba2);
        lIni=System.nanoTime();
        selectionSort(aiPrueba);
        lFin=System.nanoTime();
        System.out.println("tardo:"+(lFin-lIni)+ " mil segundos");
        System.out.println("Arreglo ordenado");
        ImprimirArreglo(aiPrueba2);
        
    }
    public static void ImprimirArreglo(int[] aiDatos){
        for(int i =0 ; i< aiDatos.length ; i++){
            System.out.print(" [ " + aiDatos[i] + " ]");
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public static void selectionSort(int[] aiDatos){
        
        for(int i =0 ; i< aiDatos.length ; i++){
            int iMin = i;
            //MARCAR LA POSICION DEL MAS ¨PEQUEÑO
            for (int j = i+1; j < aiDatos.length; j++) {
                if(aiDatos[j] < aiDatos[iMin])
                    iMin = j;
            }
            //INTERCAMBIAR CON LA PRIMERA POSICION DE LA LISTA EN DESORDEN
            int iTemp = aiDatos[iMin];
            aiDatos[iMin] = aiDatos[i];
            aiDatos[i] = iTemp;
        }
    }
    public static void insertionSort(int[] aiDatos){
        int iMin;
        int con1;
        int con2;
        for(con1 =1; con1<aiDatos.length; con1++)
           
        {
            iMin =aiDatos[con1];
            for(con2=con1-1;con2>=1 && aiDatos[con2]>iMin;con2--)
            {
               aiDatos[con2+1]=aiDatos[con2];
                aiDatos[con2]=iMin;  
            }
                
            }
 }
           public static void bubbleSort (int [] aiDatos){
               
           
           
           
           
           }    
}
          
            
            
  
            
       

        
        
        
    
    

