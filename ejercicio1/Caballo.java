
package ejercicio1;


public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Caballo() {
        super();
    }
    @Override
    public void Alimentarse(){
        System.out.println("Voy a comer EquinoFood");
    }
    
}
