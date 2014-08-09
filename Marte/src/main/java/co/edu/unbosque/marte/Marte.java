/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class Marte {
    int x = 0;
    int y = 0;
    public ArrayList<Robot> lstRobot = new ArrayList<Robot>();
    
    public Marte(int i, int i0) {
        this.x = i;
        this.y = i0;
    }

    Marte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void adicionarRobot(Robot ro) {
       lstRobot.add(ro);
    }
   
}
