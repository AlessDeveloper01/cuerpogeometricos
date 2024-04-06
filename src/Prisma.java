public class Prisma extends CuerpoGeometrico {
    private double largoBase;
    private double anchoBase;
    private double altura;

    public Prisma(String nombre, double x, double y, double largoBase, double anchoBase, double altura) {
        super(nombre, x, y);
        this.largoBase = largoBase;
        this.anchoBase = anchoBase;
        this.altura = altura;
    }

    private double calcularAreaBase() {
        return largoBase * anchoBase;
    }

    @Override
    public double calculateVolume() {
        return calcularAreaBase() * altura;
    }

    public double getLargoBase() {
        return largoBase;
    }

    public void setLargoBase(double largoBase) {
        this.largoBase = largoBase;
    }

    public double getAnchoBase() {
        return anchoBase;
    }

    public void setAnchoBase(double anchoBase) {
        this.anchoBase = anchoBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}