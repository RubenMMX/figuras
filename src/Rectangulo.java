public class Rectangulo implements Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double perimetro() {
        double perimetro = (ancho + alto) * 2.0;
        return perimetro;
    }

    @Override
    public double area() {
        double area = ancho * alto;
        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0.0) {
            this.ancho *= escala;
            this.alto *= escala;

        }

    }

    @Override
    public void imprimir() {
        System.out.println("El ancho del Rectangulo es : " + this.ancho);
        System.out.println("El alto del Rectangulo es: " + this.alto);
        System.out.println("El perimetro del Rectangulo es: " + perimetro());
        System.out.println("El area del Rectangulo es: " + area());

    }


}
