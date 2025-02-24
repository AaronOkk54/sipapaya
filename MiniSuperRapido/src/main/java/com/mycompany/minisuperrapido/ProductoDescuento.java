/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minisuperrapido;

/**
 *
 * @author 4ar0n
 */
public class ProductoDescuento extends Producto {
   private double descuento;  

    public ProductoDescuento(String Nombre, int Codigo, double Precio, int Stock, double descuento) {
        super(Nombre, Codigo, Precio, Stock);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double PrecioFinal() {
        return getPrecio() * (1 - descuento);  // Aplica el descuento al precio
    }
}

    

