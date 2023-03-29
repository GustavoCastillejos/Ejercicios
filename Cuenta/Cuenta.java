/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta;

/**
 *
 * Gustavo Castillejos Benitez
 */
public class Cuenta { //Inicio de la clase Cuenta
    
    private double saldo; //Declaracion de variables tipos privada
    
    public Cuenta(double saldoInicial){ //Inicio de constructor 
        if (saldoInicial > 0.0) //Condicional si el saldo es mayor a 0
            saldo = saldoInicial;
        else
            saldo=saldoInicial;
    }
    
    public void abonar(double monto){ //Metodo para abonar saldo
        saldo = saldo + monto;
    }
 public double obtenerSaldo(){ //metodo para obtener saldo
     return saldo;
 }
 public void cargar(double monto){ //metodo para cargar monto
     if(monto > saldo){ //condicional si el monto supera el saldo
         System.out.println("El monto a cargar excede el saldo de la cuenta");
         }
         else{
                 saldo-=monto;
                 }
     
 }
}


