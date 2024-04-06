public class Cuadrado extends Poligono {

    private double lado;

    public Cuadrado(String nombre, double x, double y, double lado) {
        super(nombre, x, y);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimeter() {
        return lado * 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}