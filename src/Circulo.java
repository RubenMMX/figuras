public class Circulo implements Figura {
    double radius;

    public Circulo(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimetro() {
        return Math.PI * (this.radius*2);
    }

    @Override
    public double area() {
       return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            this.radius *= escala;

        }
    }

    @Override
    public void imprimir() {
        System.out.println("El radio del Circulo  es : " + this.radius);
        System.out.println("El perimetro del Circulo  es: " + perimetro());
        System.out.println("El area del Circulo es: " + area());
    }
}
