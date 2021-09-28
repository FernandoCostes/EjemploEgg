
package ejercicio5;


public class Circulo implements CalculoForma {
    
    private Double radio;
    private Double diametro;

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }
    
    

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public Double calcularArea() {
        return PI * (Math.pow(radio, 2));
    }

    @Override
    public Double calcularPerimentro() {
        return PI * diametro;
    }
    
    
    
}
