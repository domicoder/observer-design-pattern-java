
package com.vehiculo;

/**
 *
 * @author Zardecs, **Referencias @LatinCoder - YouTuber**
 */

public class Main {
    public static void main(String[] args) {
        
        Motor motorAlternante = new Motor();
        
        Acelerador acelManual = new Acelerador();
        
        acelManual.enlazarObservador(motorAlternante);
        
        acelManual.Acelerar();
    }
}
