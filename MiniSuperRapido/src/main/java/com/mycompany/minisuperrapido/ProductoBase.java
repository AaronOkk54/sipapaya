/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minisuperrapido;

/**
 *
 * @author 4ar0n
 */
//producto y sus caractetisticas
public abstract class ProductoBase {
    private String Nombre;
    private int Codigo;
    private double Precio;
    private int Stock;

    public ProductoBase(String Nombre, int Codigo, double Precio, int Stock) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Stock = Stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    @Override
    public String toString() {
        return "ProductoBase{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + ", Precio=" + Precio + ", Stock=" + Stock + '}';
    }

  
    //metodos para descuento y total
    public abstract double PrecioFinal();
    public double PrecioDescuentos(){
        return (PrecioFinal() - getPrecio());
    }
    
}
