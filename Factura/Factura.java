package Factura;
        
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Factura { //Inicio de clase
    
    //Declaracion de variables
    private String numpieza,descripcion;
    private int compra;
    private double precio,monto;
   
    //Inicio de constructor con parametros
    public Factura(String np, String d, int cc, double p, double m){
        numpieza = np;
        descripcion = d;
       compra = cc;
        precio = p;
        monto = m;
    }
        //Inicio de metodos Set y Get
    public void setNpieza(String np) {
        this.numpieza = np;
    }
    public String getNpieza() {
        return numpieza;
    }
    
    public void setDescripcion(String d) {
        this.descripcion = d;
    }
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setCompra(int cc) {
        this.compra = cc;
    }
    public int getCompra() {
        return compra;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }
    public double getPrecio() {
        return precio;
    }
    public double getMonto(){ //Calcular el monto o el costo total de la compra
        monto = compra * precio;
        return this.monto;
        }     
}
