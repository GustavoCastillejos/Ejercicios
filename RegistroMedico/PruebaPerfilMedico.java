
package RegistroMedico;


import javax.swing.JOptionPane;

public class PruebaPerfilMedico { //Inicio de clase
 public static void main(String [] args){ //Ejecucion de clase 
     
     //Objeto con parametros
     PerfilMedico miPerfilMedico = new PerfilMedico("Gustavo","Castillejos","Masculino","07","07",2003,1.70,85.50);
     
     //Impresion de los parametros del objeto
     System.out.printf("Tu nombre es: "+miPerfilMedico.getNombre()+ 
                       "\nTu apellido es: "+miPerfilMedico.getApellido()+
                       "\nTu sexo es: " + miPerfilMedico.getSexo() + 
                       "\nTu edad es: " + miPerfilMedico.calcularedad()+
                       "\nTu frecuencia maxima es: " + miPerfilMedico.frecuenciaMax() + 
                       "\nTu frecuencia esperada es: " + miPerfilMedico.frecuenciaEsp()+
                       "\nTu Indice de masa corporal es: " + miPerfilMedico.BMI());
     
         //Pedir al usuario sus datos para el registro medico
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        miPerfilMedico.setNombre(nombre);
    
        String apellido = JOptionPane.showInputDialog("Escribe tu apellido");
        miPerfilMedico.setApellido(apellido);
     
        String sexo = JOptionPane.showInputDialog("Introduce tu sexo");
        miPerfilMedico.setSexo(sexo);
     
        String dia = JOptionPane.showInputDialog("Introduce tu dia de nacimiento (dos digitos)");
        miPerfilMedico.setDia(dia);
    
        String mes = JOptionPane.showInputDialog("Escribe tu mes de nacimiento (dos digitos)");
        miPerfilMedico.setMes(mes);
     
        String año = JOptionPane.showInputDialog("Escribe tu año de nacimiento (completo)");
         int ani = Integer.parseInt(año); //Conversion de una variable int a una variable String (Un disfraz)
        miPerfilMedico.setAño(ani);
      
        String altura = JOptionPane.showInputDialog("Escribe tu altura en metros y centimetros");
         double alt = Double.parseDouble(altura);
         miPerfilMedico.setAltura(alt);
      
        String peso = JOptionPane.showInputDialog("Escribe tu peso");
         double pes = Double.parseDouble(peso);
         miPerfilMedico.setPeso(pes);
         
         //Imprimir los datos registroados por el usuario
         JOptionPane.showMessageDialog(null, "Tu nombre es: "+ miPerfilMedico.getNombre()
         + "\nTu apellido es: " +miPerfilMedico.getApellido()+ "\nTu sexo es: " +miPerfilMedico.getSexo()+
          "\nTu edad es: " +miPerfilMedico.calcularedad() + "\nTu Frecuencia Maxima es: " + miPerfilMedico.frecuenciaMax()
         +"\nTu frecuencia esperada es: " +miPerfilMedico.frecuenciaEsp());
         
         //Imprimir el Indice de masa corporal junto con los rangos de la misma
         JOptionPane.showMessageDialog(null,"Tu indice de masa corporal es: " +miPerfilMedico.BMI()+
                 
                 "\n\nVALORES IMC"+
                 "\nBajo peso: menos de 18.5" +
                 "\nNormal: entre 18.5 y 24.9" +
                 "\nSobrePeso: entre 25 y 29.9"+
                 "\nObesidad: 30 o mas");
 }
}
