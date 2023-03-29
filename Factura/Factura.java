
package Factura;

public class Factura {
    private String numpieza,descripcion;
    private int compra;
    private double precio,monto;
   
    
    public Factura(String np, String d, int cc, double p, double m){
        numpieza = np;
        descripcion = d;
       compra = cc;
        precio = p;
        monto = m;
    }

    public void setNpieza(String np) {
        this.numpieza = np;
    }
    public String getNpieza() {
        return numpieza;
    }
    
    public void setDescripcion(String d) {
        this.descripcion = d;
    }
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setCompra(int cc) {
        this.compra = cc;
    }
    public int getCompra() {
        return compra;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }
    public double getPrecio() {
        return precio;
    }
    public double getMonto(){
        monto = compra * precio;
        return this.monto;
        }     
}
