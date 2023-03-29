/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fechas;

/**
 *
 * @author personal
 */
public class Fecha { //inicio de la clase Fecha
    //Declaración de variables
    int mes;
    int dia;
    int año;
    
    public Fecha(){
       
    }
    public Fecha(int a, int m, int d){ //Inicio de constructor con parametros
        dia = d;
        año = a;
        mes = m;
    }
    //Inicio de metodos para establecer y obtener las variables declaradas
    public void establecerDia(int dia){
    this.dia = dia; 
}
    public int obtenerDia(){
        return dia;
    }
    
    public void establecerMes(int mes){
    this.mes = mes; 
}
    public int obtenerMes(){
        return mes;
    }
    
    public void establecerAño(int año){
    this.año = año; 
}
    public int obtenerAño(){
        return año;
    }
    public void mostrarFecha(){ //Impresión para mostrar mensaje obtenido
        System.out.printf("%s %d/%d/%d", "Fecha: ",dia,mes,año);

}

   
}

