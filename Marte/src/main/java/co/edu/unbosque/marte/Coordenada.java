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
public class Coordenada {

    public static int intCoordenadaY;
    public static int intCoordenadaX;
    public static char strOrientacion;
    
    public Coordenada(int x, int y, char orientacion) {
       if(x<0 || y<0)
           throw  new IllegalArgumentException("Coordenadas x,y invalidas");
       String tmp=""+orientacion;
       if (!tmp.matches("[NSEO]*"))
           throw new IllegalArgumentException("Orientacon no valida");
       this.intCoordenadaX=x;
       this.intCoordenadaY=y;
       this.strOrientacion=orientacion;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    Coordenada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getX() {
        return intCoordenadaX;
    }   
    
      public void setX(int x) {
        this.intCoordenadaX = x;
    }
      
      public int getY() {
        return intCoordenadaY;
    }
      
      public void setY(int y) {
        this.intCoordenadaY = y;
    }
      
       public char getOrientacion() {
        return strOrientacion;
    }
       
       public void setOrientacion(char orientacion) {
        this.strOrientacion = orientacion;
    }
}
