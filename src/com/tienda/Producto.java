
package com.tienda;

import java.util.ArrayList;

/**
 *
 * @author Zardecs
 */
public class Producto implements Sujeto{

    private ArrayList<Observador> listaObservadores;
    
    public Producto(){
        listaObservadores = new ArrayList<Observador>();
    }
    
    public void cambiarPrecio(Articulo articulo, int precio){
        articulo.setPrecio(precio);
        notificar(articulo);
    }
    
    public void enlazarObservadores(Observador observador){
        listaObservadores.add(observador);
    }
    
    public void enlazarObservadores(ArrayList<Observador> observadores){
        listaObservadores.addAll(observadores);
    }
    
    @Override
    public void notificar(Articulo articulo) {
        if(listaObservadores.contains(articulo)){
            articulo.actualizar();
        }
    }
        
}
