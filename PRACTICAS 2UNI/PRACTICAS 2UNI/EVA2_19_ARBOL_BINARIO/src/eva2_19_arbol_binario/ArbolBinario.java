/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_arbol_binario;

/**
 *
 * @author erika
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        root=null;
    }

    public ArbolBinario(Nodo root) {
        this.root = root;
    }
    
    public void addNodo(Nodo nuevo) throws Exception{
        if(root==null){
            root=nuevo;
        }else{
            addNodoRec(root, nuevo);
        }

    }
    
    private void addNodoRec(Nodo nuevo, Nodo actual) throws Exception{
        if(nuevo.getMiDato()>actual.getMiDato()){//MAYOR VA A LA DERECHA
            if(actual.getSig()==null){//VERIFICAMOS SI ESTÁ VACIO (NULL)
                actual.setSig(nuevo);
            }else{//NO ESTÁ VACIA, HAY QUE SEGUIRLE
                addNodoRec(nuevo, actual.getSig());
            }
        }else if(nuevo.getMiDato()<actual.getMiDato()){//MENOR VA A LA IZQUIERDA
            if(actual.getPrev()==null){//VERIFICAMOS SI ESTÁ VACIO (NULL)
                actual.setPrev(nuevo);
            }else{//NO ESTÁ VACIA, HAY QUE SEGUIRLE
                addNodoRec(nuevo, actual.getPrev());
            }
        }else{
            throw new Exception("No se valen valores repetidos");
        }
    }
}
