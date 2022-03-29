
package com.arjuncodes.tareauniversidad;

import javax.swing.JOptionPane;

public class TareaU 
{
    public static void main (String[] args)
    {

    int suma = 0;
    int i,perfecto;
                
                perfecto = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                
                for ( i = 1; i < perfecto; i++ )
                {
                    if (perfecto % i == 0 ){
                        suma= suma + i;
                    }        
                }
                
                if (suma == perfecto){                    
                    JOptionPane.showMessageDialog(null,"Es un numero Perfecto" );     
                } 
                else { 
                    JOptionPane.showMessageDialog(null,"No es un numero perfecto" );
                }               
    }
}

            