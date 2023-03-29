/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta;
import java.util.Scanner;

/**
 *
 * @author personal
 */
public class PruebaCuenta { //Inicio de la clase PruebaCuenta
    public static void main(String []args){ //metodo main para la ejecución del programa
        Cuenta cuenta1 = new Cuenta(50.00); //Valor de la cuenta uno
        Cuenta cuenta2 = new Cuenta (-7.53); //Valor de la cuenta dos
        
        System.out.printf("Saldo de cuenta1: $%.2f\n", //Impresion de la cuenta 1
                cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n", //Impresion de la cuenta 2
                cuenta2.obtenerSaldo());
        
        Scanner entrada = new Scanner(System.in);
        double monto;
        //Pedir al usuario datos y almacenarlas en respectivas variables
        System.out.print("Escriba el monto a depositar para cuenta1: ");
        monto = entrada.nextDouble();
        System.out.printf("\nsumando %.2f al saldo de cuenta1\n\n",
                monto);
        cuenta1.abonar(monto);
        
        System.out.print("Escriba el monto a cargar para cuenta1: ");
        monto = entrada.nextDouble();
        cuenta1.cargar(monto);
        System.out.printf("\n%s %.2f %s\n","Saldo actualizado de cuenta1:",
                cuenta1.obtenerSaldo(),"Bs.");
        
        System.out.printf("Saldo cuenta1: $%.2f\n",
        cuenta1.obtenerSaldo());
         System.out.printf("Saldo cuenta2: $%.2f\n",
        cuenta2.obtenerSaldo());
         
         System.out.print("Escriba el monto a depositar para cuenta2: ");
        monto = entrada.nextDouble();
        System.out.printf("\nsumando %.2f al saldo de cuenta1\n\n",
                monto);
        cuenta2.abonar(monto);
        
             System.out.print("Escriba el monto a cargar para cuenta1: ");
        monto = entrada.nextDouble();
        cuenta2.cargar(monto);
        System.out.printf("\n%s %.2f %s\n","Saldo actualizado de cuenta2:",
                cuenta2.obtenerSaldo(),"Bs.");
        //Imprimir el saldo de la Cuenta 1 y 2 con carga ya registrada
        System.out.printf("Saldo cuenta1: $%.2f\n",
        cuenta1.obtenerSaldo());
         System.out.printf("Saldo cuenta2: $%.2f\n",
        cuenta2.obtenerSaldo());
    }
}