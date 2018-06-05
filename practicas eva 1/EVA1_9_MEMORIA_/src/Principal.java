/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erika
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     principal Pobj = new principal1();
     //PARA DESACERSE DE LA MEMORIA DE UN OBJETO
     pObje = null; //liberemos la memoria creada para el objeto.
     //TODO OBJETO EN MEMORIA QUE NO ES REFERENCIADO POR ALGUNA VARIABLE EN EL 
     //PROGRAMA, ES ELIMINADA POR EL GARBAGE COLLECTO
     Principal pObje2 = new Principal();
     Principal pCopia = pObj2;//NO SUPLICAMOS EL OBJETO, PORQUE COPIA SIGUE APUNTADO
     //QUEREMOS ELIMINAR pObj2
     pObj = null; //NO SE ELIMINA EL OBJTO, PORQUE COPIA SIGUE APUNTADO 
     
    }
    
}
