/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author F211
 */
public class ControladorArchivo {

    BufferedReader br;
    public ControladorArchivo(String djuegotxt) throws FileNotFoundException {
        File f=new File(djuegotxt);
        FileInputStream fin=new FileInputStream(f);
        br=new BufferedReader(new InputStreamReader(fin));
    }

    public String getPrimeraLinea() {
        return "AIAIAIAIAIAI";
    }
}
