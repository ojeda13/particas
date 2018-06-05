/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_arreglos_3_obje;

/**
 *
 * @author erika
 */
public class EVA1_10_ARREGLOS_3_OBJE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Persona apGente [] = new Persona [5];
    apGente[0] =new Persona();//constructor de faull
    apGente[1]   = new Persona("erika", "ojeda",78);
    apGente[2]   = new Persona("erika", "ojeda",78);
    apGente[3]   = new Persona("erika", "ojeda",78);
    apGente[4]   = new Persona("erika", "ojeda",78);
    for (int i= 0;i < apGente.length;i++){
        System.out.println("Nombre: "+ apGente[i].getsNombre());
        System.out.println("Apellido: "+ apGente[i].getsApe());
        System.out.println("Edad: "+ apGente[i].getiEdad());
    for(int )  
        
    }
    
    }
    }    
    
    
    
    

class Persona{
    private String sNombre;
    private String sApe;
    private int iEdad;
//CONSTRUCTOR  

    public Persona() {
       sNombre = Erika;
       sApe = ojeda;
       iEdad = 21;
       
       
       
    }

    public Persona(String sNombre, String sApe, int iEdad) {
        this.sNombre = sNombre;
        this.sApe = sApe;
        this.iEdad = iEdad;
        
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }
    

    
        
    
    }

 
    
    
    

//CONSTRUCTOR CON PARAMETROS DE ENTRADA

