package ejercicio4;


import ejercicio4.Barco;

public class BarcoMotor extends Barco {
    
    

    private Integer potenciaCV;

    public BarcoMotor() {
        super();
    }

    public BarcoMotor(Integer potenciaCV, Integer matricula, Integer eslora, Integer anioFab) {
        super(matricula, eslora, anioFab);
        this.potenciaCV = potenciaCV;
    }
    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        System.out.println("Ingrese la potenciaCV: ");
        setPotenciaCV(leer.nextInt());
        
    }
    
    @Override
    public int modulo(){

        return super.modulo()+(this.potenciaCV);
        
    }
    
    
    
}
