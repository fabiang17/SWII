/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.ControladorArchivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import junit.framework.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestControlArchivo {
    @BeforeTest
    public void setTest() throws IOException
    {
        File f = new File("d:/juego.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        fw.append("7 8");
        fw.append("\n 0 0 N");
        fw.append("\nAAIAADDIA");
        fw.close();
    }
    @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ControladorArchivo ca=new ControladorArchivo("d:/juego.txt");
    }
    
    @Test
    public void obtenerTamanoTablero() throws FileNotFoundException
    {
        ControladorArchivo ca=new ControladorArchivo("d:/juego.txt");
        String line = ca.getPrimeraLinea();
        Assert.assertEquals(line, "AIAIAIAIAIAI"); 
   }
}
