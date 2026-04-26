/*
* 2026 ITESS-TICS
*
* Periodo: Enero-Junio
* Asignatura: Programasion orientada a objetos 
* Dosente: Francisco Javier Montesillo Puente
* Descripsion : Clase principal que ejecuta el menu interactivo de la tienda,
* gestiona las entradas del usuario y coordina las operaciones de venta
* y administracion de inventario.
* -------------------------------------------------------------------------
* | SimulacionTiendaWhatEver
* -------------------------------------------------------------------------
* | 
* -------------------------------------------------------------------------
* | + main(args: String[]): void
* -------------------------------------------------------------------------
* |  
* | <<Inner Class>>
* | -----------------------------------------------------------------------
* | | FastReader
* | -----------------------------------------------------------------------
* | | - br: BufferedReader
* | | - st: StringTokenizer
* | -----------------------------------------------------------------------
* | | + FastReader()
* | | + next(): String
* | | + nextInt(): int
* | | + nextDouble(): double
* | -----------------------------------------------------------------------
* | 
* -------------------------------------------------------------------------
* Intento de Programador: AMPM y JAMC
* Fecha: 26-abril-2026
*/
package SimulaciónTiendaWhatEver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SimulacionTiendaWhatEver {
    public static void main(String[] args) {
        FastReader fr=new FastReader();
    TiendaWhatever tienda=new TiendaWhatever();
    
boolean salir =false;
while(!salir){
    System.out.println("1.-VER ROPA");
    System.out.println("2.-COMPRAR ROPA");
    System.out.println("3.-AGREGAR ROPA");
    System.out.println("4.-REPORTE DE VENTAS");
    System.out.println("5.-SALIR");
    
    int opcion=fr.nextInt();
    switch(opcion){
        
        case 1:
            boolean volver=false;
            while(!volver){
            System.out.println("1.-VER CAMISAS");
            System.out.println("2.-VER SUDADERAS");
            System.out.println("3.-VOLVER AL MENU");
            
            int ver=fr.nextInt();
            switch(ver){
                case 1:
                    tienda.verCamisa();
                    break;
                    
                case 2:
                    tienda.verSudadera();
                    break;
                    
                case 3:
                    volver=true;
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
            }
            break;
            
            
        case 2:
            boolean volverComprar=false;
            
            while(!volverComprar){
            System.out.println("1.-COMPRAR CAMISAS");
            System.out.println("2.-COMPRAR SUDADERAS");
            System.out.println("3.-VOLVER AL MENU");
            
            int comprar=fr.nextInt();
            int indice;
            int cantidad;
            switch(comprar){
                case 1:
                    tienda.verCamisa();;
                                        System.out.println("SELECIONA EL INDICE DE LA CAMISA");
                     indice=fr.nextInt();
                     System.out.println("¿Cuantas prendas quieres comprar?");
                      cantidad =fr.nextInt();
                    tienda.comprarCamisa(indice,cantidad);
                    break;
                    
                case 2:
                    tienda.verSudadera();
                    System.out.println("SELECIONA EL INDICE DE LA SUDADERA");
                    indice=fr.nextInt();
                    System.out.println("¿Cuantas prendas quieres comprar?");
                      cantidad =fr.nextInt();
                    tienda.comprarSudadera(indice, cantidad);
                    break;
                    
                case 3:
                    volverComprar=true;
                    break;
                    
                default:
                    System.out.println("OPCION INVALIDA");
            }
    }
            break;
            
            
        case 3:
            boolean volverAgregar=false;
            while(!volverAgregar){
                System.out.println("1.-AGREGAR CAMISAS");
                System.out.println("2.-AGREGAR SUDADERAS");
                System.out.println("3.-VOLVER AL MENU");
                
                int agregar=fr.nextInt();
                switch(agregar){
                    case 1:{
                        System.out.println("INGRESE NOMBRE DE LA CAMISA");
                        String nombre=fr.next();
                        System.out.println("INGRESE LA TALLA DE LA CAMISA");
                        String talla=fr.next();
                        System.out.println("INGRESE PRECIO DE LA CAMISA");
                        double precio=fr.nextDouble();
                        System.out.println("INGRESE CUANTAS CAMISAS EN STOCK");
                        int stock=fr.nextInt();
                        
                        Camisa c=new Camisa(nombre, talla, precio, stock );
                        tienda.agregarCamisas(c);
                        break;
                    }
                        
                    case 2:
                                                System.out.println("INGRESE NOMBRE DE LA SUDADERA");
                        String nombre=fr.next();
                        System.out.println("INGRESE LA TALLA DE LA SUDADERA");
                        String talla=fr.next();
                                                System.out.println("INGRESE PRECIO DE LA CAMISA");
                        double precio=fr.nextDouble();
                                                System.out.println("INGRESE CUANTAS CAMISAS EN STOCK");
                        int stock=fr.nextInt();
                        
                        Sudaderas s=new Sudaderas(nombre, talla, precio, stock);
                        tienda.agregarSudaderas(s);
                        break;
                        
                    case 3:
                        volverAgregar=true;
                        break;
                        
                    default:
                        System.out.println("OPCION INVALIDA");
                }
            }
            break;
            
            
            
             case 4:
                    tienda.reporteVentas();
                    break;
                 
        case 5:
            salir=true;
            break;
            
        default:
            System.out.println("OPCION IVALIDA");
            
    }
}
   
    }
    
    static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            } catch (Exception e) {
                return null;
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }
    double nextDouble(){return Double.parseDouble(next());}
    
    }
}