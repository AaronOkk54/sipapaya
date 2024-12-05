/*
Nombre: Macrobiotica Vida Sana
Autores: Marcelo Quevedo Ramírez
Fecha: 7/11/24
Univercidad: Fidelitas
Version: 1.0
*/

package com.mycompany.vidasana;

import javax.swing.JOptionPane;

public class VidaSana {

    public static void main(String[] args) {
        //Declaracion de variables
        
        String Usuario="Admin";
        String Contraseña= "$123456$";
        String NombreDelCliente="";
        int eleccionMenu = 0;
        
        //Solisitud de credenciales
        Usuario=JOptionPane.showInputDialog("Ingrese el nombre");
        Contraseña=JOptionPane.showInputDialog("Ingrese la contraseña:");
        NombreDelCliente=JOptionPane.showInputDialog("Ingrese su nombre Con apellidos: ");
        
        
        //Condiciones para despliegue de opciones
        if (Usuario.equals("Admin")){
            //Verdadero
            
            if (Contraseña.equals("$123456$")){
                //Verdadero
                JOptionPane.showMessageDialog(null, "Inicio de sesion correcto");
                
                while (eleccionMenu!=13) {
                    eleccionMenu=Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO " + NombreDelCliente +
                                                                      "\n Que desea comprar?" 
                                                                      + "\n1-Arroz integral"
                                                                      + "\n2-Cebada"
                                                                      + "\n3-Avena integral"
                                                                      + "\n4-Quinoa"       
                                                                      + "\n5-Garbanzos"        
                                                                      + "\n6-Algas "        
                                                                      + "\n7-Miso"
                                                                      + "\n8-Frutas secas "
                                                                      + "\n9-Aceite de sésamo"
                                                                      + "\n10-Aceite de coco"
                                                                      + "\n11-Té de jengibre"
                                                                      + "\n12-Miel"                                                                              
                                                                      + "\n13-Salir y mostrar factura"));
                    switch(eleccionMenu){
                        
                       case 1:
                           
                           // arroz integral
                           break;
                       case 2:
                           // cebada
                           break;
                       case 3:
                           // Avena integra
                           break;
                       case 4:
                           // Garbanzos
                           break;
                       case 5:
                           // miso
                           break;
                       case 6:
                           // Algas
                           break;
                       case 7:
                           // Miso
                           break;
                       case 8:
                           // Frutas secas
                           break;
                       case 9:
                           // Aceite de sésamo
                           break;
                       case 10:
                           // Aceite de coco
                           break;
                       case 11:
                           // Té de jengibre
                           break;
                       case 12:
                           // Miel
                           break;
                       case 13:
                           // Aceite de coco
                           break;
                           
                       default:
                           JOptionPane.showMessageDialog(null, "Seleccione un número válido");
                           break;
                    }
                }  
            }
        }else{
            //Falso
            
            JOptionPane.showMessageDialog(null, "Contraseña o Usario incorrecto");
        }
        
    }
}
