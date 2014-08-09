/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.Marte;
import co.edu.unbosque.marte.Robot;
import org.testng.annotations.Test;
import co.edu.unbosque.marte.Coordenada;
/**
 *
 * @author Fabian
 */
public class TestMarte {
    
    @Test
    public void CrearPLaneta()
    {
        Marte Mar = new Marte(0,0);
    }
    
    @Test
    public void AdicionarRobot()
    {
        Coordenada cor = new Coordenada(0,0,'N');
        Robot ro = new Robot(cor);
        Marte mar = new Marte(0,0);
        mar.adicionarRobot(ro);
    }
}
