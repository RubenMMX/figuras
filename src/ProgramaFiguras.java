public class ProgramaFiguras {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(3);
        Cuadrado c2 = new Cuadrado(5);
        Rectangulo r1 = new Rectangulo(4,8);
        Rectangulo r2 = new Rectangulo(6,8);
        Triangulo t1 = new Triangulo(6,8);
        Triangulo t2 = new Triangulo(4,7);
        Circulo cr1 = new Circulo(3);
        Circulo cr2 = new Circulo(7);

        c1.imprimir();
        c2.imprimir();
        t1.imprimir();
        t2.imprimir();
        r1.imprimir();
        r2.imprimir();
        cr1.imprimir();
        cr2.imprimir();
        c1.escalar(2.0);
        c2.escalar(2.0);
        t1.escalar(2.0);
        t2.escalar(2.0);
        r1.escalar(2.0);
        r2.escalar(2.0);
        cr1.escalar(2.0);
        cr2.escalar(2.0);
        c1.imprimir();
        c2.imprimir();
        t1.imprimir();
        t2.imprimir();
        r1.imprimir();
        r2.imprimir();
        cr1.imprimir();
        cr2.imprimir();
        c1.escalar(0.1);
        c2.escalar(0.1);
        t1.escalar(0.1);
        t2.escalar(0.1);
        r1.escalar(0.1);
        r2.escalar(0.1);
        cr1.escalar(0.1);
        cr2.escalar(0.1);
        c1.imprimir();
        c2.imprimir();
        t1.imprimir();
        t2.imprimir();
        r1.imprimir();
        r2.imprimir();
        cr1.imprimir();
        cr2.imprimir();


    }
}
