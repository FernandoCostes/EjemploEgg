package ejercicio4;


import ejercicio4.Barco;

public class Velero extends Barco {

    private Integer mastil;

    public Velero() {
        super();
    }

    public Velero(Integer mastil, Integer matricula, Integer eslora, Integer anioFab) {
        super(matricula, eslora, anioFab);
        this.mastil = mastil;
    }

    public Integer getMastil() {
        return mastil;
    }

    public void setMastil(Integer mastil) {
        this.mastil = mastil;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        System.out.println("Ingrese cantidad de mastiles: ");
        setMastil(leer.nextInt());
    }
    
    @Override
    public int modulo(){
        
        return super.modulo()+(this.mastil);
        
    }
    
    
    
}
