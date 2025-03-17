import java.io.Serializable;

public class Triangulo  implements Figura {
    private double lado;
    private double altura;
    public Triangulo(double lado,double altura) {
        this.lado = lado;
        this.altura = altura;

    }

    @Override
    public double perimetro() {
        return lado*3;

    }

    @Override
    public double area() {
        return (lado * altura) /2;

    }

    @Override
    public void escalar(double escala) {
        this.lado = this.lado

    }

    @Override
    public void imprimir() {

    }
}
