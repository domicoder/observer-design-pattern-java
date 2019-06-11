
package com.vehiculo;

/**
 *
 * @author Zardecs, **Referencias @LatinCoder - YouTuber**
 */

import javax.swing.JOptionPane;

public class Motor implements Observador{

    @Override
    public void actualizar() {
        
        JOptionPane.showMessageDialog(null, "bumm, bumm, bumbum...", "Acelerando", JOptionPane.INFORMATION_MESSAGE);
        
    }

}
