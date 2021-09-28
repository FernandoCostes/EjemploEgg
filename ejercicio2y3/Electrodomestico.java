//Crear una superclase llamada Electrodoméstico con los siguientes atributos:
//precio, color, consumo energético (letras entre A y F) y peso.
package ejercicio2y3;

import java.util.Scanner;



public class Electrodomestico {

    static Scanner leer = new Scanner(System.in);

    protected Integer precio;
    protected String color;
    protected char consumo;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, char consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private char consumoElectrico(char letra) {
        if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F') {
            this.consumo = 'F';
        } else {
            this.consumo = letra;
        }
        return consumo;
    }

    private String comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            this.color = "blanco";
        } else {
            this.color = color;
        }
        return color;
    }

    public void crearElectrodomestico() {
        System.out.println("--Bienvenido a GARBARINO--");
        System.out.println("Ingrese color del electrodomestico:");
        color = comprobarColor(leer.next());
        System.out.println("Ingrese consumo del electrodomestico:");
        consumo = consumoElectrico(leer.next().charAt(0));
        System.out.println("Ingrese peso del electrodomestico:");
        peso = leer.nextInt();
        precio = 1000;

    }

    public void precioFinal() {
        switch (consumo) {
            case 'A':
                setPrecio(getPrecio() + 1000);
                break;
            case 'B':
                setPrecio(getPrecio() + 800);
                break;
            case 'C':
                setPrecio(getPrecio() + 600);
                break;
            case 'D':
                setPrecio(getPrecio() + 500);
                break;
            case 'E':
                setPrecio(getPrecio() + 300);
                break;
            case 'F':
                setPrecio(getPrecio() + 100);
                break;
            default:
                throw new AssertionError();
        }
        if(peso<20){
            setPrecio(getPrecio()+100);
        }
        else if(peso>=20 && peso<50){
            setPrecio(getPrecio()+500);
        }
        else if(peso>=50 && peso<80){
            setPrecio(getPrecio()+800);
        }else{
            setPrecio(getPrecio()+1000);
        }

    }

    @Override
    public String toString() {
        return "Electrodomestico{ precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

}
