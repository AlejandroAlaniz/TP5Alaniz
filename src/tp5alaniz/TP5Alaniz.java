/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5alaniz;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class TP5Alaniz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglo pruebaArreglo= new Arreglo();
        int cantCaract=pruebaArreglo.cuentaCaracter("Mendigo", 'a');
        System.out.println(cantCaract);
        
        int cantVocal=pruebaArreglo.cuentaVocales("Alejandro");
        System.out.println(cantVocal);
        
        int suma[]={3,5,34,72};
        Arreglo.sumarLista(suma);
      
        int mayor[]={2,22,59,4,34};
        Arreglo.buscarMayor(mayor);
        
    }
    
    
}
