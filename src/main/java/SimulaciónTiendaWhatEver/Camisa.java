/*
* 2026 ITESS-TICS | Clase: Camisas
* -------------------------------------------------------------------------
* | Camisas (Hereda de Ropa)
* -------------------------------------------------------------------------
* | 
* -------------------------------------------------------------------------
* | + Camisas(nombre: String, talla: String, precio: double, stock: int)
* -------------------------------------------------------------------------
*/
package SimulaciónTiendaWhatEver;

//Usamos herenci de la clase ropa
public class Camisa extends Ropa{

    //Constructor de los atributos de la clase ropa
    public Camisa(String nombre, String talla, double precio, int stock) {
        super(nombre, talla, precio, stock);
    }
   
}