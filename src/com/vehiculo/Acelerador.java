
package com.vehiculo;

/**
 *
 * @author Zardecs, **Referencias @LatinCoder - YouTuber**
 */

import java.util.ArrayList;

public class Acelerador implements Sujeto{
    
    private ArrayList<Observador> observadores;
    
    public Acelerador(){
        observadores = new ArrayList<>();
    }
    
    public void Acelerar(){
        notificar();
    }
    
    public void enlazarObservador(Observador obsver){
        observadores.add(obsver);
    }
    
    @Override
    public void notificar() {
        for (Observador ob: observadores) {
            ob.actualizar();
        }
    }
    
}
