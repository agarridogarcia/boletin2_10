
package boletin2_10;

import javax.swing.JOptionPane;


public class Boletin2_10 {

    
    public static void main(String[] args) {
        //metemos una cantidad entera y nos la divide entre billetes de 100€, 20€, 5€ y monedasde 1€.
        int cantidadB100,cantidadB20, cantidadB5,cantidad, monedas; 
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dinero que tiene"));
        cantidadB100=cantidad/100;
        cantidadB20=cantidad%100/20;
        cantidadB5=cantidad%20/5;
        monedas=cantidad%5/1;
        
        JOptionPane.showMessageDialog(null, "La cantidad de billetes de 100 es de " + cantidadB100 + ". \n La cantidad de billetes de 20 es "+ cantidadB20 + ". \n La cantidad de billetes de 5 es " + cantidadB5 + ". \n La cantidad de monedas de 1 es" +monedas);
     
        
    }
    
}

    
    

