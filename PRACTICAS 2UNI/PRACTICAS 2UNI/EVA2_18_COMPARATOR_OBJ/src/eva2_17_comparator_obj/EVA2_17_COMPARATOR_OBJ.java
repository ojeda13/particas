/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_comparator_obj;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author erika
 */
public class EVA2_17_COMPARATOR_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> datosPersona=new LinkedList<>();
        datosPersona.add(new Persona("Antonio","Martinez",15));
        datosPersona.add(new Persona("Tania","Rascon",24));
        datosPersona.add(new Persona("Rodrigo","Reyes",20));
        datosPersona.add(new Persona("Erika","Ojeda",21));
        datosPersona.add(new Persona());
        impLista(datosPersona);
        //COMPARATOR APELLIDO
        Comparator cmApe=new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //LOS OBJETOS SON PERSONAS
                Persona per1, per2;
                per1=(Persona)o1;
                per2=(Persona)o2;
               
                String ape1, ape2;
                ape1=per1.getApellido();
                ape2=per2.getApellido();
                
                char c1, c2;
                c1=ape1.charAt(0);
                c2=ape2.charAt(0);
                
                return c1-c2;
            }
        };   
        Collections.sort(datosPersona, cmApe);
        impLista(datosPersona);
        //COMPARATOR EDAD
        Comparator cmEdad=new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //LOS OBJETOS SON PERSONAS
                Persona per1, per2;
                per1=(Persona)o1;
                per2=(Persona)o2;
               
                int edad1, edad2;
                edad1=per1.getEdad();
                edad2=per2.getEdad();
                
                return edad1-edad2;
            }
        };   
        Collections.sort(datosPersona, cmEdad);
        impLista(datosPersona);
        //COMPARATOR APELLIDO- EDAD
        Comparator cmApeEdad=new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //LOS OBJETOS SON PERSONAS
                Persona per1, per2;
                per1=(Persona)o1;
                per2=(Persona)o2;
               
                String ape1, ape2;
                ape1=per1.getApellido();
                ape2=per2.getApellido();
                
                char c1, c2;
                c1=ape1.charAt(0);
                c2=ape2.charAt(0);
                
                return c1-c2;
            }
        }; 
    }
    
    public static void impLista(LinkedList<Persona> lista1){
        for (Persona persona : lista1) {
            System.out.println("Nombre: "+persona.getNombre());
            System.out.println("Apellido: "+persona.getApellido());
            System.out.println("Edad: "+persona.getEdad());
            System.out.println("-------------------------");
        }
    }
}

class Persona{
        private String nombre;
        private String apellido;
        private int edad;
        
        public Persona(){
            apellido="Mondragon";
            edad=42;
            nombre="Liliana";
        }

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
        
    }
