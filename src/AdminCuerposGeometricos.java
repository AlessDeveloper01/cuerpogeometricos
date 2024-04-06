import java.util.ArrayList;
import java.util.List;

public class AdminCuerposGeometricos {
    private List<CuerpoGeometrico> geometricBodies;

    public AdminCuerposGeometricos() {
        this.geometricBodies = new ArrayList<>();
    } 

    public void addGeometricBody(CuerpoGeometrico body) {
        geometricBodies.add(body);
    }

    public void deleteGeometricBody(String nombre) {
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo.getNombre().equals(nombre)) {
                System.out.println("Se eliminó el cuerpo geometrico con el nombre " + nombre);
                geometricBodies.remove(cuerpo);
                break;
            } else {
                System.out.println("No se encontró el cuerpo geometrico con el nombre " + nombre);
            }
        }
    }

    public CuerpoGeometrico searchGeometricBody(String nombre) {
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo.getNombre().equals(nombre)) {
                return cuerpo;
            }
        }
        return null;
    }
    
    public CuerpoGeometrico getGeometricBody(int index) {
        return geometricBodies.get(index);
    }

    public double calculateDistance(CuerpoGeometrico cuerpo, Punto point) {
        return Math.sqrt(Math.pow(cuerpo.getX() - point.getX(), 2) + Math.pow(cuerpo.getY() - point.getY(), 2));
    }

    public CuerpoGeometrico getClosestGeometricBody(Punto point) {
        CuerpoGeometrico closest = null;
        double minDistance = Double.MAX_VALUE;
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            double distance = calculateDistance(cuerpo, point);
            if (distance < minDistance) {
                minDistance = distance;
                closest = cuerpo;
            }
        }
        return closest;
    }

    public CuerpoGeometrico getFarthestGeometricBody(Punto point) {
        CuerpoGeometrico farthest = null;
        double maxDistance = Double.MIN_VALUE;
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            double distance = calculateDistance(cuerpo, point);
            if (distance > maxDistance) {
                maxDistance = distance;
                farthest = cuerpo;
            }
        }
        return farthest;
    }

    public double calculateVolumePrismas(double x) {
        double volume = 0;
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo instanceof Prisma prisma) {
                if (prisma.getX() >= x) {
                    double prismaVolume = prisma.calculateVolume();
                    volume += prismaVolume;
                }
            }
        }
        return volume;
    }

    public double calculateVolumePiramides(double x) {
        double volume = 0;
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo instanceof Piramide piramide) {
                if (piramide.getX() >= x) {
                    double piramideVolume = piramide.calculateVolume();
                    volume += piramideVolume;
                }
            }
        }
        return volume;
    }

    public double calculateTotalVolumePrismas() {
        double volume = 0;
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo instanceof Prisma prisma) {
                double prismaVolume = prisma.calculateVolume();
                volume += prismaVolume;
            }
        }
        return volume;
    }

    public double calculateTotalVolumePiramides() {
        double volume = 0;
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo instanceof Piramide piramide) {
                double piramideVolume = piramide.calculateVolume();
                volume += piramideVolume;
            }
        }
        return volume;
    }

    public int countPrismas() {
        int count = 0;
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo instanceof Prisma) {
                count++;
            }
        }
        return count;
    }

    public int countPiramides() {
        int count = 0;
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo instanceof Piramide) {
                count++;
            }
        }
        return count;
    }

    public List<CuerpoGeometrico> getPrismasMenorX(double x) {
        List<CuerpoGeometrico> prismas = new ArrayList<>();
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo instanceof Prisma prisma) {
                if (prisma.getX() < x) {
                    prismas.add(prisma);
                }
            }
        }
        return prismas;
    }

    public List<CuerpoGeometrico> getPiramidesMenorX(double x) {
        List<CuerpoGeometrico> piramides = new ArrayList<>();
        for (CuerpoGeometrico cuerpo : geometricBodies) {
            if (cuerpo instanceof Piramide piramide) {
                if (piramide.getX() < x) {
                    piramides.add(piramide);
                }
            }
        }
        return piramides;
    }

    public List<CuerpoGeometrico> getGeometricBodies() {
        return geometricBodies;
    }

    public void setGeometricBodies(List<CuerpoGeometrico> geometricBodies) {
        this.geometricBodies = geometricBodies;
    }
}