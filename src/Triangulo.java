import java.io.Serializable;

public class Triangulo implements Figura {
    private double lado;
    private double altura;

    public Triangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;

    }

    @Override
    public double perimetro() {
        return lado * 3;

    }

    @Override
    public double area() {
        return (lado * altura) / 2;

    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            this.lado *= escala;

        }
    }

    @Override
    public void imprimir() {
        System.out.println("El lado del Triangulo  es : " + this.lado);
        System.out.println("La altura del Triangulo  es: " + this.altura);
        System.out.println("El perimetro del Triangulo  es: " + perimetro());
        System.out.println("El area del Triangulo es: " + area());
    }
}
