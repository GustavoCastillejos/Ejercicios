
package Libro;

/**
 *
 * Gustavo Castillejos Benitez
 */
public class LibroCalificaciones {
    private String nombreDelCurso,Instructor;//Declarar una variable privada para el nombre del curso
    
    public LibroCalificaciones(){
        
    }
     public LibroCalificaciones(String nombre, String instructor){ //metodo constructor con un un argumento tipo String
       nombreDelCurso = nombre;
       Instructor = instructor;//inicia nombre del curso
    }//Fin del constructor
   
    public void establecerInstructor(String instructor){
        Instructor = instructor;
    }
    
    public String obtenerInstructor(){
        return Instructor;
    }
    
    //Metodo para poner un nombre al curso
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre; //almacenar el nombreDelCurso en nombre
    }//Fin del metodo
    
    //metodo para obtener el nombre del curso
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    } //Fin del metodo
    
    //Metodo para mostrar en mensaje de Bienvenida al usuario
    public void mostrarMensaje(){
        //Instruccion para llamar a obtenerNombreDelCurso para obtener el
        //nombre del curso que representa esta clase
    System.out.printf("Bienvenido al libro de calificaciones del: ", 
            obtenerNombreDelCurso());
    System.out.printf("Este curso es presentado por: \n%s!\n",
            obtenerInstructor());
}//Final del metodo para mostrar mejnsaje
}//Final de la clase
