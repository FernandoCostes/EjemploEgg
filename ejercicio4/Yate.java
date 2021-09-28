package ejercicio4;


import ejercicio4.Barco;

public class Yate extends Barco {

    private Integer potenciaCV;

    private Integer camarote;

    public Yate() {
        super();
    }

    public Yate(Integer potenciaCV, Integer camarote, Integer matricula, Integer eslora, Integer anioFab) {
        super(matricula, eslora, anioFab);
        this.potenciaCV = potenciaCV;
        this.camarote = camarote;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getCamarote() {
        return camarote;
    }

    public void setCamarote(Integer camarote) {
        this.camarote = camarote;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        System.out.println("Ingrese potenciaCV: ");
        setPotenciaCV(leer.nextInt());
        System.out.println("Ingrese cantidad de camarotes: ");
        setCamarote(leer.nextInt());
    }
    
    @Override
    public int modulo(){
        
        return super.modulo()+(this.potenciaCV+this.camarote);
        
    }
    
    
}
