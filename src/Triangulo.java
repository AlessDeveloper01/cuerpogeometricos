public class Triangulo extends Poligono {
    public enum TrianguloTipo {
        EQUILATERAL,
        ISOSCELES,
        SCALENE
    }

    private double lado1;
    private double lado2;
    private double lado3;
    protected TrianguloTipo type;

    public Triangulo(String nombre, double x, double y, double lado1, double lado2, double lado3) {
        super(nombre, x, y);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        if (lado1 == lado2 && lado2 == lado3) {
            type = TrianguloTipo.EQUILATERAL;
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            type = TrianguloTipo.ISOSCELES;
        } else {
            type = TrianguloTipo.SCALENE;
        }
    }
    
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double getPerimeter() {
        return lado1 + lado2 + lado3;
    }


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
