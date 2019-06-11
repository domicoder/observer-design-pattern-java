
package com.tienda;

/**
 *
 * @author Zardecs
 */
public abstract class Articulo implements Observador {
    
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
