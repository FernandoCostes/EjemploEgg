package ejercicio4;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Alquiler extends Barco {
    

    private String nombre;

    private String dni;

    private LocalDate fechaAlq;

    private LocalDate fechaDev;

    private Integer posicion;

    private Barco tipoBarco;

    public Alquiler() {
        super();
    }

    public Alquiler(String nombre, String dni, LocalDate fechaAlq, LocalDate fechaDev, Integer posicion, Barco tipoBarco, Integer matricula, Integer eslora, Integer anioFab) {
        super(matricula, eslora, anioFab);
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.posicion = posicion;
        this.tipoBarco = tipoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(LocalDate fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Barco getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(Barco tipoBarco) {
        this.tipoBarco = tipoBarco;
    }
    
    public Alquiler crearAlquiler(){
        Alquiler a = new Alquiler();
        
        int respuesta;
        System.out.println("Ingrese nombre del propietario de la embarcacion: ");
        a.setNombre(leer.next());
        System.out.println("Ingrese dni del propietario de la embarcacion: ");
        a.setDni(leer.next());
        System.out.println("Ingrese la fecha de alquiler año/mes/dia: ");
        a.setFechaAlq(LocalDate.of(leer.nextInt(),(leer.nextInt()),leer.nextInt()));
        System.out.println("Ingrese la fecha de devolucion año/mes/dia: ");
        a.setFechaDev(LocalDate.of(leer.nextInt(),(leer.nextInt()),leer.nextInt()));
        System.out.println("Ingrese la posicion del amarre: ");
        a.setPosicion(leer.nextInt());
        System.out.println("Ingrese el tipo de embarcacion: ");
        System.out.println("Opcion 1: Velero");
        System.out.println("Opcion 2: Yate");
        System.out.println("Opcion 3: Barco a Motor");
        respuesta=leer.nextInt();
        switch (respuesta) {
            case 1:
                Velero vel = new Velero();
                vel.crearBarco();
                a.setTipoBarco(vel);
                break;
            case 2:
                Yate yt = new Yate();
                yt.crearBarco();
                a.setTipoBarco(yt);
                break;
            case 3:
                BarcoMotor bm = new BarcoMotor();
                bm.crearBarco();
                a.setTipoBarco(bm);
                break;
            default:
                throw new AssertionError();
        }
        return a;
    }
    
    
    public int diasAlquiler(Alquiler a){
        int dias=(int)ChronoUnit.DAYS.between(a.getFechaAlq(), a.getFechaDev());

        return dias;
    }
    
    public int precioFinal(Alquiler a, int dias){
        int precio= dias*(a.getTipoBarco().modulo());

        return precio;
    }
    
              
    //(int)ChronoUnit.DAYS.between(a.getFechaAlq(), a.getFechaDev())
    
}
