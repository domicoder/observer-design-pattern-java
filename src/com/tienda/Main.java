
package com.tienda;

import java.util.ArrayList;

/**
 *
 * @author Zardecs
 */
public class Main {
    public static void main(String[] args) {
        
        Articulo libros = new Libros();
        Articulo calzados = new Calzados();
        
        ArrayList<Observador> misCosas = new ArrayList<Observador>();
        misCosas.add(libros);
        misCosas.add(calzados);
        
        Producto producto = new Producto();
        producto.enlazarObservadores(misCosas);
//        producto.enlazarObservadores(libros);
//        producto.enlazarObservadores(calzados);
//        producto.enlazarObservadores(lol);
        
        for(Observador lista : misCosas){
            producto.cambiarPrecio((Articulo)lista, 52);
        }
        producto.cambiarPrecio(libros, 100);
        producto.cambiarPrecio(calzados, 250);
        
    }
}
