import java.util.ArrayList;
import java.util.List;

public class AdminPoligono {
    private List<Poligono> polygons;

    public AdminPoligono() {
        this.polygons = new ArrayList<>();
    }

    public void addPolygon(Poligono polygon) {
        this.polygons.add(polygon);
    }

    public void deletePolygon(String nombre) {
        for (Poligono poligono : polygons) {
            if (poligono.getNombre().equals(nombre)) {
                System.out.println("Se eliminó el poligono con el nombre " + nombre);
                polygons.remove(poligono);
                break;
            } else {
                System.out.println("No se encontró el poligono con el nombre " + nombre);
            }
        }
    }

    public Poligono searchPolygon(String nombre) {
        for (Poligono poligono : polygons) {
            if (poligono.getNombre().equals(nombre)) {
                return poligono;
            }
        }
        return null;
    }

    public Poligono getPolygon(int index) {
        return polygons.get(index);
    }

    public double calculateDistance(Poligono poligono, Punto point) {
        return Math.sqrt(Math.pow(poligono.getX() - point.getX(), 2) + Math.pow(poligono.getY() - point.getY(), 2));
    }

    public Poligono getClosestPolygon(Punto point) {
        Poligono closest = null;
        double minDistance = Double.MAX_VALUE;
        for (Poligono poligono : polygons) {
            double distance = calculateDistance(poligono, point);
            if (distance < minDistance) {
                minDistance = distance;
                closest = poligono;
            }
        }
        return closest;
    }

    public Poligono getFarthestPolygon(Punto point) {
        Poligono farthest = null;
        double maxDistance = Double.MIN_VALUE;
        for (Poligono poligono : polygons) {
            double distance = calculateDistance(poligono, point);
            if (distance > maxDistance) {
                maxDistance = distance;
                farthest = poligono;
            }
        }
        return farthest;
    }

    public List<Poligono> getPolygons() {
        return polygons;
    }

    public void setPolygons(List<Poligono> polygons) {
        this.polygons = polygons;
    }
}
