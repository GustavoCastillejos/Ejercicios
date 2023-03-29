package Cardio;

public class Cardio { //Inicio de Clase
    //Declaración de variable tipo texto y entero
     private String nombre, apellido, mes,dia;
     private int anio, edad, FreMax, FreEsp;
     
     
         public Cardio(String n, String a, String m, String d, int y, int e, int FM, int FE){ //Inicio del constructor con parametros
         nombre = n;
         apellido = a;
         dia = d;
         mes = m;
         anio = y;
         edad = e;
         FreMax = FM;
         FreEsp = FE;
         
     }
     
         //Metodos para establecer y obtener datos
     public void setNombre(String n){ 
         nombre = n;
     }
     
     public String getNombre(){
         return nombre;
     }
      public void setApellido(String a){
         apellido = a;
     }
     
     public String getApellido(){
         return apellido;
     }

    public String getMes() {
        return mes;
    }

    public void setMes(String m) {
        mes = m;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) { //metodo para el calculo del año registrado por el usuario - año actual
        edad = 2023-anio;
    }
     
     public void setFrecuenciaMax(int edad){
         FreMax = 220- edad;     //metodo para sacar Frecuencia maxima con el dato de la edad
     
     }
     public int getFrecuenciaMax(){
         return FreMax;
     }
     public void setFrecuenciaEsp(int FE){
         FreEsp = FreMax*100/85; //metodo para sacar la Frecuencia esperada con la variable de la Frecuencia Maxima
     }
     public int getFrecuenciaEsp(){
         return FreEsp;
     }
   
}
                              