/*
* 2026 ITESS-TICS
* Asignatura: Programasion orientada a objetos 
* Descripsion : Logica de negocio para la gestion de inventarios,
* ventas y generacion de reportes de la tienda.
* -------------------------------------------------------------------------
* | TiendaWhatever
* -------------------------------------------------------------------------
* | + listaCamisas: ArrayList<Camisas>
* | + listaSudaderas: ArrayList<Sudadera>
* | + listaTickets: ArrayList<Ticket>
* | + ventaCamisas: int
* | + ventasSudaderas: int
* | + dineroCamisas: double
* | + dineroSudaderas: double
* -------------------------------------------------------------------------
* | + TiendaWhatever()
* | + agregarCamisa(camisa: Camisas): void
* | + agregarSudadera(sudadera: Sudadera): void
* | + verCamisa(): void
* | + verSudadera(): void
* | + comprarCamisas(): void
* | + comprarSudaderas(): void
* | + reporteVentas(): void
* | + verTickets(): void
* | + main(args: String[]): void <<SimulacionTiendaWhatEver>>
* -------------------------------------------------------------------------
* Intento de Programador: AMPM  y JAMC
*/
package SimulaciónTiendaWhatEver;

import java.util.ArrayList;
public class TiendaWhatever {
    //Atributos 
    ArrayList<Camisa> listaCamisa;
    ArrayList<Sudaderas> listaSudadera;
    ArrayList<Ticket> tickets;
    int ventasCamisas=0;
    int ventasSudaderas=0;
    double dineroCamisas=0;
    double dineroSudaderas=0;

    //Constructor
    public TiendaWhatever() {
       listaCamisa =new ArrayList<>();
       listaSudadera=new ArrayList<>();
       tickets=new ArrayList<>();
    }
    
    
    //Metodo para que agrege camisas y sudaderas
    public void agregarCamisas(Camisa c){
        listaCamisa.add(c);
    }
    public void agregarSudaderas(Sudaderas s){
        listaSudadera.add(s);
    }
    
    //Metodo para ver camisas y sudaderas
    public void verCamisa(){
        int i=0;
        for(Camisa c : listaCamisa){
            System.out.println(i+" - "+ c);
            i++;
        }
    }
    public void verSudadera(){
        int i=0;
        for(Sudaderas s: listaSudadera){
            System.out.println(i+" - "+ s);
            i++;
        }
    }
    
    //Metodo para comprar camisas y sudaderas
    public void comprarCamisa(int indice, int cantidad){
        if(cantidad <= 0){
            System.out.println("CANTIDAD INVALIDA");
            return;
        }
        if(indice < 0 || indice >= listaCamisa.size()){
            System.out.println("Indice invalido");
            return;
        }
        Camisa c= listaCamisa.get(indice);
        
        if(c.getStock()>=  cantidad){
            c.setStock(c.getStock()-cantidad);
            
            ventasCamisas+=cantidad;
            dineroCamisas+=c.getPrecio() * cantidad;
            
            double total=c.getPrecio() * cantidad;
            Ticket t=new Ticket("CAMISA", c.getNombre(), cantidad, total);
            tickets.add(t);
            
              System.out.println("------------TICKET-----------");
            System.out.println(t);
            System.out.println("Compra exitosa");
        }else{
            System.out.println("No hay stock");
        }
    }
    public void comprarSudadera(int indice, int cantidad){
        if(cantidad <= 0){
            System.out.println("CANTIDAD INVALIDA");
            return;
        }
        if(indice < 0 || indice >= listaSudadera.size()){
            System.out.println("Indice invalido");
            return;
        }
        Sudaderas s= listaSudadera.get(indice);
        
        if(s.getStock()>= cantidad){
            s.setStock(s.getStock()-cantidad);
            ventasSudaderas+=cantidad;
            dineroSudaderas+=s.getPrecio()*cantidad;
             double total=s.getPrecio() * cantidad;
            Ticket t=new Ticket("CAMISA", s.getNombre(), cantidad, total);
            tickets.add(t);
            
            System.out.println("------------TICKET-----------");
            System.out.println(t);
            System.out.println("Compra exitosa");
        }else{
            System.out.println("No hay stock");
        }
    }
    
    //Metodo de reporte de ventas donde va a imprimir las ventas echas calculando cuanto se vendio en total 
    public void reporteVentas(){
        System.out.println("--------------REPORTE DE VENTAS-------------");
        System.out.println("CAMISAS VENDIDAS: "+ventasCamisas);
        System.out.println("DINERO GENERADO: " +dineroCamisas);
        System.out.println("SUDADERAS VENDIDAS: "+ventasSudaderas);
        System.out.println("DINERO GENERADO: "+dineroSudaderas);
    }
    
    //Metodo para el ticket
    public void verTickets(){
        if(tickets.isEmpty()){
            System.out.println("No hay ticeks");
            return;
        }
        
        for(Ticket t: tickets){
            System.out.println(t);
            System.out.println("--------------------------");
        }
    }
    
   
}