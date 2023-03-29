
package Libro;

/**
 *
 * @author personal
 */
import java.util.Scanner;

public class PruebaLibroCalificaciones {
    
    //Metodo main para la ejecucion de la clase
    public static void main(String []args){
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escriba nombre del curso: ");
        String nombreDelCurso = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso);
        System.out.println();
        
        System.out.println("Escriba nombre del instructor: ");
        String instructor = entrada.nextLine();
        miLibroCalificaciones.establecerInstructor(instructor);
        System.out.println();
        
        miLibroCalificaciones.mostrarMensaje();
       

    }//Fin del metodo main
} //Fin de la clase
