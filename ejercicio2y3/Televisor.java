
package ejercicio2y3;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    
    static Scanner leer = new Scanner(System.in);
    
    private Integer Resolucion;
    private Boolean sintonizador;

    public Televisor() {
        super();
    }

    public Televisor(Integer Resolucion, Boolean sintonizador, Integer precio, String color, char consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.Resolucion = Resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return Resolucion;
    }

    public void setResolucion(Integer Resolucion) {
        this.Resolucion = Resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del Televisor");
        this.setResolucion(leer.nextInt());
        System.out.println("¿Tiene sintonizador?");
        this.setSintonizador(leer.nextBoolean());
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(getResolucion()>40){
            setPrecio(getPrecio()+(int)(getPrecio()*0.30));
        }
        if(this.sintonizador){
            setPrecio(getPrecio()+500);
        }
    }
    
    
}
