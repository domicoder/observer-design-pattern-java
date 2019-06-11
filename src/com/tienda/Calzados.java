
package com.tienda;

/**
 *
 * @author Zardecs
 */
public class Calzados extends Articulo implements Observador{

    @Override
    public void actualizar() {
        System.out.println("Los Productos 'Calzados' han cambiado de precio a US$"+getPrecio()+".\n");
    }
}
