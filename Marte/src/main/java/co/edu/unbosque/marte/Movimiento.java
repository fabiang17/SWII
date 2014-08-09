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
public class Movimiento {

    String movimientos;
    char mov[];
    int i;
    public Movimiento(String iaaadiad) {
        
        if(movimientos.isEmpty())
            throw new IllegalArgumentException("Los movimientos no pueden estar vacios");
        if(!movimientos.matches("[IAD]*"))
            throw new IllegalArgumentException("Los movimientos tienen caracteres invalidos");
        this.movimientos=movimientos;
        i=-1;
    }

    Movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void ejecutarMovimiento(Coordenada Origen, char strValor) {
        
        if (strValor == 'A' ||strValor == 'I' || strValor == 'D' )
        {
            if(strValor == 'D')
            {
                if(Coordenada.strOrientacion == 'N')
                    Coordenada.strOrientacion = 'E';
                else if(Coordenada.strOrientacion == 'E')
                    Coordenada.strOrientacion = 'S';
                else if(Coordenada.strOrientacion == 'S')
                    Coordenada.strOrientacion = 'W';
                else
                    Coordenada.strOrientacion = 'N';
            }
            else if(strValor == 'I')
            {
                if(Coordenada.strOrientacion == 'N')
                    Coordenada.strOrientacion ='W';
                else if(Coordenada.strOrientacion == 'W')
                    Coordenada.strOrientacion = 'S';
                else if(Coordenada.strOrientacion == 'S')
                    Coordenada.strOrientacion = 'E';
                else
                    Coordenada.strOrientacion = 'N';
            }
            else 
            {
                if(Coordenada.strOrientacion == 'N')
                    Coordenada.intCoordenadaY = Coordenada.intCoordenadaY+1;
                else if(Coordenada.strOrientacion == 'E')
                    Coordenada.intCoordenadaX = Coordenada.intCoordenadaX-1;
                else if(Coordenada.strOrientacion == 'S')
                    Coordenada.intCoordenadaY = Coordenada.intCoordenadaY-1;
                else
                    Coordenada.intCoordenadaX = Coordenada.intCoordenadaX+1;
            }
        }
    }

    public boolean haySiguienteMovimiento() {
        mov=this.movimientos.toCharArray();
        return true;
    }

    public char getNextMov() {
        mov=this.movimientos.toCharArray();
        i++;
        return mov[i];
    }
}
