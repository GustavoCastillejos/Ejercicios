/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.util.Scanner;
/**
 *
 * @author personal
 */
public class PruebaEmpleados { //Inicio de clase
    public static void main (String []args){ //Metodo main para ejecutar
        
        //Creacion del primer objeto con los parametros que pide
        Empleado empleado1 = new Empleado("Gustavo","Castillejos", 2000.00);
        
        //Impresion del objeto con sus parametros
        System.out.printf("Tu nombre es: " + empleado1.getNombre() +
                          "\nTu apellido es: " + empleado1.getApellido() +
                          "\nTu Salario anual es: " + empleado1.getSalarioAnu());
        
        //Creacion del segundo objeto para introducir datos
        Empleado empleado2 = new Empleado();
        Scanner entrada = new Scanner(System.in);
        
        //Pedir al usuario los datos que se necesitan
        System.out.println("\n\nIngrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        empleado2.setNombre(nombre);
        
        System.out.println("Ingrese Apellido parterno del empleado: ");
        String apellido = entrada.nextLine();
        empleado2.setApellido(apellido);
        
        System.out.println("Ingrese salario mensual del empleado: ");
        double SalarioMen = entrada.nextDouble();
        empleado2.setSalarioMen(SalarioMen);
           
        //Imprimir los datos registrados por el usuario y sacar el calculo para un salario anual
        System.out.printf("\n\nTu nombre es: " + empleado2.getNombre() + 
                          "\nTu apellido es: " + empleado2.getApellido() +
                          "\nTu Salario anual es: " + empleado2.getSalarioAnu());
        
            //Impresion del salario anual con un abono del 10%
          System.out.print("\n\nGuSalario con abono del 10%: ");
            System.out.printf("\nSalario del primer empleado: " + empleado1.NuevoSueldo());
            System.out.printf("\nSalario del segundo empleado: " + empleado2.NuevoSueldo());
    }
    
}
