package Cardio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaCardio { //Inicio de la clase para ejecutar la clase Cardio
    
    
    public static  void main (String [] args){ //inicio del metodo main para la ejecucion del programa
        Cardio miCardio = new Cardio("Gustavo","Castillejos","07","07",2003,50,150,200); // Crecion del objeto Cardio con parametros
        
        System.out.printf("Tu nombre es: "+miCardio.getNombre()+" "+miCardio.getApellido()+"Tu edad es: "+ miCardio.getEdad()+"Tu Frecuencia maxima es: "+ miCardio.getFrecuenciaMax()+ 
                "Tu Frecuencia esperada es: "+ miCardio.getFrecuenciaEsp()); //Impresion de los parametros del constructor
       
        //Cuadros de texto para que el usuario registre sus datos
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        miCardio.setNombre(nombre); 
        
        String apellido = JOptionPane.showInputDialog("Escribe tu apellido");
        miCardio.setApellido(apellido);
        
  
        String dia = JOptionPane.showInputDialog("Escribe el dia de tu nacimiento");
        miCardio.setDia(dia);
        
         
        String mes = JOptionPane.showInputDialog("Escribe el mes de tu nacimiento");       
        miCardio.setMes(mes);
        
        
        String anio = JOptionPane.showInputDialog("Escribe tu año de nacimiento: ");
        int ani = Integer.parseInt(anio); //Conversion de una variable int a una variable String (Un disfraz)
        miCardio.setAnio(ani);
        
        miCardio.setEdad(ani);
        miCardio.setFrecuenciaMax(miCardio.getEdad());
        miCardio.setFrecuenciaEsp(miCardio.getFrecuenciaMax()); //Mandar a llamar el metodo para obtener la frecuencia esperada
                                                                //De la frecuencia Maxima
        
        JOptionPane.showMessageDialog(null,"\nTu nombre es: "+ miCardio.getNombre()+ " " + miCardio.getApellido()
        + "\nTu edad es: " + miCardio.getEdad() + "\nTu Frecuencia Maxima es: " +miCardio.getFrecuenciaMax() +
                "\nTu frecuencia esperada es: " + miCardio.getFrecuenciaEsp()); //Impresion de los datos que el usuario registró
        
        
                
    }
}