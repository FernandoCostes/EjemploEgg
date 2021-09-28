
package ejercicio1;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        
        Animal perro = new Perro("Olivia", "DogChow", 10, "Ovejero Aleman");
        Animal gato = new Gato("Gringo", "MiauFood", 8, "Siames");
        Animal caballo = new Caballo("Incitatus", "EquinoFood", 13, "Semental");
        
        perro.Alimentarse();
        gato.Alimentarse();
        caballo.Alimentarse();
       
    }
    
}
