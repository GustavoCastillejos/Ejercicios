/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fechas;
import java.util.Scanner;

/**
 *
 * @author personal
 */
public class PruebaFecha { //inicio de la clase PruebaFecha
    public static void main(String [] args){ //Metodo main para ejecución del programa
        
        Scanner entrada = new Scanner(System.in);
        
        Fecha fechas = new Fecha();
        //Pedir al usuario que registre el dia, mes y año
        System.out.print("Dia: ");
        int d = entrada.nextInt();
        System.out.print("Mes: ");
        int m = entrada.nextInt();
        System.out.print("Año: ");
        int a = entrada.nextInt();
        
        fechas.establecerDia(d);
        fechas.establecerMes(m);
        fechas.establecerAño(a);
        //Metodo para mostrar mensaje con las fechas establecidas
        fechas.mostrarFecha();
}
}
