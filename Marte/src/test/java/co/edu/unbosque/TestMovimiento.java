/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;
import co.edu.unbosque.marte.Coordenada;
import co.edu.unbosque.marte.Movimiento;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 *
 * @author Fabian
 */
public class TestMovimiento {
     @Test
    public void seCreaLaClaseMovimiento(){
        Movimiento m=new Movimiento("IAAADIAD");
    }
    
    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void seEsperaLaExcepcionPorCadenaVacia(){
        Movimiento m=new Movimiento("");
    }
    
    @Test
    public void traeElSiguienteMovimiento(){
        Movimiento m=new Movimiento("IAAADIAD");
        char mov=m.getNextMov();
        Assert.assertEquals(mov, 'I');
    }
    
    @Test
    public void haySiguienteMovimiento()
    {
        Movimiento m=new Movimiento("IAAADIAD");
        boolean mov=m.haySiguienteMovimiento();
        Assert.assertEquals(mov, true);
    }
    
    
    @Test
    public void ejecutarMovimiento()
    {
        Coordenada Origen =new Coordenada(1,2,'N');
        Coordenada CoordeEsperada =new Coordenada(3,3,'E');
        
        Movimiento Movimiento = new Movimiento("IAIAIAIAA");
        char strValor;
        while(Movimiento.haySiguienteMovimiento())
        {
            strValor = Movimiento.getNextMov();
            Movimiento.ejecutarMovimiento(Origen, strValor);
        }
        Assert.assertEquals(Origen, CoordeEsperada);
    }
}
