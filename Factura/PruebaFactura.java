package Factura;

import java.util.*;

public class PruebaFactura {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Factura miFactura = new Factura("tres", "pinzas a base de carbón", 4, 20, 80.00);
        
        System.out.printf("El numero de pieza es: "+ miFactura.getNpieza()+ " " +
                          "\nLa descripcion de la pieza es: "+ miFactura.getDescripcion()+ " " + 
                          "\nLa cantidad de articulos que desea comprar es: " + miFactura.getCompra() + " " +
                          "\nEl precio de cada articulo es de: " + miFactura.getPrecio() + " " +
                          "\nEl precio total de su compra es: " + miFactura.getMonto());
                
        System.out.printf("\n\nIngrese el número de pieza: ");
        String npieza = entrada.nextLine();
        miFactura.setNpieza(npieza);
        
        System.out.printf("Ingrese la descripción de la pieza: ");
        String descripcion = entrada.nextLine();
        miFactura.setDescripcion(descripcion);
        
        System.out.printf("¿Qué cantidad de articulos desea comprar? ");
        int cantidadcompra = entrada.nextInt();
        miFactura.setCompra(cantidadcompra);
        
        System.out.printf("Tiene un precio de: ");
        double precio = entrada.nextDouble();
        miFactura.setPrecio(precio);
              
        miFactura.getMonto();
        
        System.out.print("El numero de pieza es: "+ miFactura.getNpieza()+ " " +
                          "\nDescripcion de la pieza es: "+ miFactura.getDescripcion()+ " " + 
                          "\nCantidad de articulos por comprar es: " + miFactura.getCompra() + " " +
                          "\nPrecio del articulo es de: " + miFactura.getPrecio() + " " +
                          "\nPrecio de su compra es de: " + miFactura.getMonto());
        
    }
}