public class Hexagono extends Poligono {

    private double lado;
    private double apotema;

    public Hexagono(String nombre, double x, double y, double lado, double apotema) {
        super(nombre, x, y);
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double getArea() {
        return (getPerimeter() * apotema) / 2;
    }

    @Override
    public double getPerimeter() {
        return lado * 6;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
}
