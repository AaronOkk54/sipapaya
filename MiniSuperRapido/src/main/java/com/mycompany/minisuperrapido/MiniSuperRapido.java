/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minisuperrapido;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author 4ar0n
 */
public class MiniSuperRapido {

    public static void main(String[] args) {
        //Inventario de productos sin descuento 
        Producto PanCuadrado = new Producto("PanCuadrado",0001,1500.0,50);
        Producto Gaseosa = new Producto("Gaseosa",0002,700.0,50);
        Producto Detergente = new Producto("Detergente",0003,3000.0,50);
        //Productos con Su descuento
        ProductoDescuento Leche = new ProductoDescuento("Leche",0004,900.0,10,0.5);
        ProductoDescuento Banano = new ProductoDescuento("Banano",0005,200.0,10,0.2);
        ProductoDescuento BolsaHielo = new ProductoDescuento("Hielo",0006,1000.0,10,0.7);

        
    }
}
