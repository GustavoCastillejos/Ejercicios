/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroMedico;

/**
 *
 * @author personal
 */
public class PerfilMedico {
    
    //Declaracion de variables necesarias
    String nombre, apellido, sexo, dia, mes;
    int año,edad,freMax, freEsp;
    double altura, peso;
    double BMI;
    
    //Constructor con parametros
    public PerfilMedico(String n, String a, String sex, String d, String m, int y, double al, double pe){
        nombre = n;
        apellido = a;
        sexo = sex;
        d = dia;
        mes = m;
        año = y;
        altura = al;
        peso = pe;
    }

    //metodos establecer y obtener
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int calcularedad(){ //metodo para calcular edad
        edad = 2023 - año;
        return edad;
    }
    
    public int frecuenciaMax(){ //metodo para calcular frecuencia Maxima
        freMax = 220- edad;
        return freMax;
    }
    
    public int frecuenciaEsp(){ //metodo para calcular la frecuencia esperada
        freEsp = freMax*100/85;
        return freEsp;
    }
    

    public double BMI(){ //metodo para calcular el Indice de Masa Corporal
        BMI = peso/(altura*altura);
        return BMI;
    }
}
