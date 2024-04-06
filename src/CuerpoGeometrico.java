
public abstract class CuerpoGeometrico {

    private String nombre;
    private double x;
    private double y;

    public CuerpoGeometrico(String nombre, double x, double y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }
    
    public abstract double calculateVolume();

    public String getNombre() {
        return nombre;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
