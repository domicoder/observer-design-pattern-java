
package com.tienda;

/**
 *
 * @author Zardecs
 */
public class Libros  extends Articulo implements Observador{
    
    @Override
    public void actualizar() {
        System.out.println("Los Productos 'libros' han cambiado de precio a: US$"+getPrecio()+".\n");
    }
}
