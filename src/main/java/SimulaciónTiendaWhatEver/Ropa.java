/*
* 2026 ITESS-TICS
* Periodo: Enero-Junio
* Asignatura: Programasion orientada a objetos 
* Dosente: Francisco Javier Montesillo Puente
* Descripsion : Clase base que define las propiedades generales de 
* las prendas de vestir en el sistema.
* -------------------------------------------------------------------------
* | Ropa
* -------------------------------------------------------------------------
* | - nombre: String
* | - talla: String
* | - precio: double
* | - stock: int
* -------------------------------------------------------------------------
* | + Ropa(nombre: String, talla: String, precio: double, stock: int)
* | + getNombre(): String
* | + setNombre(nombre: String): void
* | + getTalla(): String
* | + setTalla(talla: String): void
* | + getPrecio(): double
* | + setPrecio(precio: double): void
* | + getStock(): int
* | + setStock(stock: int): void
* | + toString(): String
* -------------------------------------------------------------------------
* Intento de Programador: AMPM y JAMC
* Fecha: 26-abril-2026
*/
package SimulaciónTiendaWhatEver;

public class Ropa {
    private String nombre;
    private String talla;
    private double precio;
    private int stock;

    public Ropa(String nombre, String talla, double precio, int stock) {
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Ropa{" + "nombre=" + nombre + ", talla=" + talla + ", precio=" + precio + ", stock=" + stock + '}';
    }
            
   
    
}
