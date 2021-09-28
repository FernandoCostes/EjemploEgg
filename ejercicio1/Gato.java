
package ejercicio1;


public class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Gato() {
        super();
    }
    @Override
    public void Alimentarse(){
        System.out.println("Voy a comer Miau Food");
    }
    
    
}
