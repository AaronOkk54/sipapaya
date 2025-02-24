/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minisuperrapido;

/**
 *
 * @author 4ar0n
 */
public class Producto extends ProductoBase {

    public Producto(String Nombre, int Codigo, double Precio, int Stock) {
        super(Nombre, Codigo, Precio, Stock);
    }
    //el precio pero sin el descuento 
    public double PrecioFinal(){
        return getPrecio();
    
    }
}
