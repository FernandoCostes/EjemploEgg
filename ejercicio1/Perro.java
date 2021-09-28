
package ejercicio1;


public class Perro extends Animal {

    public Perro() {
        super();
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    @Override
    public void Alimentarse(){
        System.out.println("Voy a comer Dog Chow");
        
    }
    
}
