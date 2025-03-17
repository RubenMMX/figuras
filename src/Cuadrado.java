public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        double perimetro = 4 * lado;
        return perimetro;

    }

    @Override
    public double area() {
        double area = lado * lado;
        return area;
    }

    @Override
    public void escalar(double escala) {

        if (escala > 0.0) {
            this.lado = this.lado * escala;

        }

    }

    @Override
    public void imprimir() {
        System.out.println("El lado del cuadrado es: " + this.lado);
        System.out.println("El perimetro del cuadrado es: " + perimetro());
        System.out.println("El area del cuadrado es : " + area());

    }
}
