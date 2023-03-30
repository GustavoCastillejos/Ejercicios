/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author personal
 */
public class Empleado { //Creacion de la clase
    
    //Declaracion de variables necesarias
    String nombre, apellido;
    double SalarioMen, SalarioAnu;
    
    public Empleado(String n, String a, double SM){ //Creacion del constructor para el primer objeto
        nombre = n;
        apellido = a;
        SalarioMen = SM;  
    }
    public Empleado(){ //Creacion del constructor para el segundo objeto
        
    }
    //Inicio de los metodos set y get 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMen() {
        return SalarioMen;
    }

    public void setSalarioMen(double SalarioMen) { 
        if(SalarioMen > 0) //Condicional para que el salario mensual sea mayor a 0
        this.SalarioMen = SalarioMen;
    }
    
    public double getSalarioAnu(){ //Metodo para obtener el salario anual con el salario mensual
        SalarioAnu = SalarioMen*12;
        return SalarioAnu;
    }
    
    public double NuevoSueldo(){ //Metodo para obtener el abono del 10%
	
		return (SalarioMen + (SalarioMen *0.1)) * 12;
	}
}
