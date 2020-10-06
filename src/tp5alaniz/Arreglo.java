/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5alaniz;

/**
 *
 * @author Alejandro
 */
public class Arreglo {
    
    public static void sumarLista(int suma[]) {
      int  totalSuma=0;       
        for(int i=0; i<suma.length; i++) {
           totalSuma=totalSuma+suma[i];
        }
         System.out.println("La suma de los numeros del arreglo son "+totalSuma);
    }
    
    
    public static void buscarMayor(int mayor[]) {
        
        int nmg = mayor[0];
        for(int i=0; i<mayor.length; i++){
             
            if(mayor[i]> nmg) 
            { nmg = mayor[i];}
            
    }
       
        System.out.println("El numero mayor del arreglo es " + nmg);
    }
    
    
    
     public static int cuentaVocales(String cadenaA){
       
        int cantidad=0;
        for(int r=0; r<cadenaA.length(); r++)
        {
        
           if(cadenaA.charAt(r)=='a')
           {cantidad++;}
             
            if(cadenaA.charAt(r)=='e')
           {cantidad++;}
           
            if(cadenaA.charAt(r)=='i')
           {cantidad++;}
         
            if(cadenaA.charAt(r)=='o')
           {cantidad++;}
        
            if(cadenaA.charAt(r)=='u')
           {cantidad++;}
    
    }
        return cantidad;
}
    
    public static int cuentaCaracter(String cadenaB, char c) {
        int cantidad=0;
        for(int i=0; i<cadenaB.length() ; i++){
            
        if (cadenaB.charAt(i)==c)
        {cantidad++;}
            }
    return cantidad;
    }  
}
