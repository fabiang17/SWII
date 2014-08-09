/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

/**
 *
 * @author Fabian
 */
public class Robot {
    public Coordenada Coordenada;
    public Robot(Coordenada c) {
            Coordenada = c;
    }

    Robot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ejecutar(char c) {
        Movimiento mov = new Movimiento();
        mov.ejecutarMovimiento(this.Coordenada, c);
    }

    public Coordenada getCoordenada() {
        return this.Coordenada;
    }
}
