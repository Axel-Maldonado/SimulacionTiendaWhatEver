/*
* 2026 ITESS-TICS | Clase: Ticket
* -------------------------------------------------------------------------
* | Ticket
* -------------------------------------------------------------------------
* | + tipo: String
* | + nombre: String
* | + cantidad: int
* | + total: double
* -------------------------------------------------------------------------
* | + Ticket(tipo: String, nombre: String, cantidad: int, total: double)
* | + toString(): String
* -------------------------------------------------------------------------
*/
package SimulaciónTiendaWhatEver;

public class Ticket {
    //Atributos
            String tipo;
        String nombre;
        int cantidad;
        double total;

        //Constructor
    public Ticket(String tipo, String nombre, int cantidad, double total) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.total = total;
    }

    //toString para imprimri el codigo
    @Override
    public String toString() {
        return 
                 "tipo=" + tipo+"\n"
                + "producto=" + nombre+"\n" 
                + "cantidad=" + cantidad +"\n"
                +"Precio unitario: $"+(total / cantidad) +"\n"
                +"total=" + total + "\n"
                + "-----------------------------------------------------------"+ '}';
        
    }
        
        
        
}