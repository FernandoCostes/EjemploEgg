package ejercicio4;


import java.util.Scanner;

public class Barco {
    
    Scanner leer= new Scanner(System.in).useDelimiter("\n");

    protected Integer matricula;

    protected Integer eslora;

    protected Integer anioFab;
    
   


    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Integer anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
        
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(Integer anioFab) {
        this.anioFab = anioFab;
    }

   
    public void crearBarco(){
        System.out.println("Ingrese la matricula de la embarcación: ");
        this.setMatricula(leer.nextInt());
        System.out.println("Ingrese eslora: ");
        this.setEslora(leer.nextInt());
        System.out.println("Ingrese año de fabricacion de la embarcación: ");
        this.setAnioFab(leer.nextInt());
    }
    
    
    public int modulo(){
        return this.eslora*10;
    }
    
    
}
