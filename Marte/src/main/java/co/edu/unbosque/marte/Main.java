/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import sun.security.krb5.SCDynamicStoreConfig;
/**
 *
 * @author Fabian
 */
public class Main {
    
     public static void main(String[] args) {
       
        //Variables
        BufferedReader br = null;
        Marte Marte = new Marte();
        Robot robot = new Robot();
        Coordenada CoordenadaAuxiliar = new Coordenada();
        ArrayList<String> strListaMovimiento = new ArrayList<String>();
        Movimiento movimiento  = new Movimiento();
        String strDatosMovimiento;
        File file;
        //Read File
	try {
            file = new File("C:\\CodeFile.txt");
 	    Scanner sc = new Scanner(file);
            //Crear Marte
            if (sc.hasNextLine()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            Marte = new Marte();
            Marte.x = Math.abs(x);
            Marte.y = Math.abs(y);
            }
            
            while(sc.hasNextLine())
            {
                robot = new Robot(CoordenadaAuxiliar);
                CoordenadaAuxiliar.intCoordenadaX = Math.abs(sc.nextInt());
                CoordenadaAuxiliar.intCoordenadaY = Math.abs(sc.nextInt());
                CoordenadaAuxiliar.strOrientacion = sc.next().charAt(0);
                robot.Coordenada = CoordenadaAuxiliar;
            
            //if(sc.hasNextLine())
            //{
                if(sc.hasNext())
                {
                    strDatosMovimiento = sc.next();
                    
                    for(int i=0; i<strDatosMovimiento.length();i++)
                    {
                        movimiento.ejecutarMovimiento(Character.toString(strDatosMovimiento.charAt(i)), CoordenadaAuxiliar);
                        if(CoordenadaAuxiliar.intCoordenadaX > Marte.x || CoordenadaAuxiliar.intCoordenadaY > Marte.y )
                        {
                            System.out.println("El robot se ha salido del área de cobertura ");
                            break;                            
                        }
                       // System.out.println("("+CoordenadaAuxiliar.intCoordenadaX + ", "+ CoordenadaAuxiliar.intCoordenadaY + ", " + CoordenadaAuxiliar.strOrientacion + " )");                            
                    }
                    System.out.println("("+CoordenadaAuxiliar.intCoordenadaX + ", "+ CoordenadaAuxiliar.intCoordenadaY + ", " + CoordenadaAuxiliar.strOrientacion + " )");                            
                }   
                else
                {
                    System.out.println("Fin");                            
                }
            }
            //}
	} catch (IOException e) {
            System.out.println("No fue posible encontrar el archivo o se encuentra vacio");
                    
            //e.printStackTrace();
	} 
        finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
            ex.printStackTrace();
            }
	}
    }
    
    
}
