
package ejercicio5;


public class Rectangulo implements CalculoForma {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public Double calcularPerimentro() {
        return (base + altura)*2;
    }
    
    
    
}
