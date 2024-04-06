import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            AdminPoligono adminPoligono = new AdminPoligono();
            AdminCuerposGeometricos adminCuerpoGeometrico = new AdminCuerposGeometricos();

            System.out.println("Bienvenido al sistema de poligonos y cuerpos geometricos");
            System.out.println("Creado por: Alessandro Rios Lopez");

            System.out.println("Ingresa el valor de X y Y para el punto de referencia");
            double puntox = scanner.nextDouble();
            double puntoy = scanner.nextDouble();
            Punto punto = new Punto(puntox, puntoy);
            System.out.println("Punto de referencia: (" + punto.getX() + ", " + punto.getY() + ")");

            int opcion;

            do {
                System.out.println("Menú:");
                System.out.println("1. Agregar un polígono");
                System.out.println("2. Agregar un cuerpo geométrico");
                System.out.println("3. Eliminar un poligono");
                System.out.println("4. Eliminar un cuerpo geometrico");
                System.out.println("5. Buscar poligono");
                System.out.println("6. Buscar cuerpo geometrico");
                System.out.println("7. Buscar por posicion un poligono");
                System.out.println("8. Buscar por posicion un cuerpo geometrico");
                System.out.println("9. Obtener el poligono mas cercano al punto");
                System.out.println("10. Obtener el cuerpo geometrico mas cercano al punto");
                System.out.println("11. Obtener el poligono mas lejano al punto");
                System.out.println("12. Obtener el cuerpo geometrico mas lejano al punto");
                System.out.println("13. Calcular volumen del prisma por X");
                System.out.println("14. Calcular volumen de la piramide por X");
                System.out.println("15. Calcular volumen total de los prismas");
                System.out.println("16. Calcular volumen total de las piramides");
                System.out.println("17. Contar prismas");
                System.out.println("18. Contar piramides");
                System.out.println("19. Imprimir prismas con volumen menor a X");
                System.out.println("20. Imprimir piramides con volumen menor a X");
                System.out.println("21. Imprimir poligonos");
                System.out.println("22. Imprimir cuerpos geometricos");
                System.out.println("23. Salir");

                System.out.println("Ingrese una opción:");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese el numero de lados del poligono");
                        int lados = scanner.nextInt();

                        switch (lados) {
                            case 4 -> {
                                System.out.println("Ingrese el nombre del cuadrado");
                                String nombre = scanner.next();
                                System.out.println("Ingrese la coordenada x del cuadrado");
                                double x = scanner.nextDouble();
                                System.out.println("Ingrese la coordenada y del cuadrado");
                                double y = scanner.nextDouble();
                                System.out.println("Ingrese el lado del cuadrado");
                                double lado = scanner.nextDouble();
                                Cuadrado cuadrado = new Cuadrado(nombre, x, y, lado);
                                System.out.println("Cuadrado agregado: " + cuadrado);
                                adminPoligono.addPolygon(cuadrado);
                            }
                            case 6 -> {
                                System.out.println("Ingrese el nombre del hexagono");
                                String nombre = scanner.next();
                                System.out.println("Ingrese la coordenada x del hexagono");
                                double x = scanner.nextDouble();
                                System.out.println("Ingrese la coordenada y del hexagono");
                                double y = scanner.nextDouble();
                                System.out.println("Ingrese el lado del hexagono");
                                double lado = scanner.nextDouble();
                                System.out.println("Ingrese el apotema del hexagono");
                                double apotema = scanner.nextDouble();
                                Hexagono hexagono = new Hexagono(nombre, x, y, lado, apotema);
                                System.out.println("Hexagono agregado: " + hexagono);
                                adminPoligono.addPolygon(hexagono);
                            }
                            default -> {
                                System.out.println("Ingrese el nombre del triangulo");
                                String nombre = scanner.next();
                                System.out.println("Ingrese la coordenada x del triangulo");
                                double x = scanner.nextDouble();
                                System.out.println("Ingrese la coordenada y del triangulo");
                                double y = scanner.nextDouble();
                                System.out.println("Ingrese el lado 1 del triangulo");
                                double lado1 = scanner.nextDouble();
                                System.out.println("Ingrese el lado 2 del triangulo");
                                double lado2 = scanner.nextDouble();
                                System.out.println("Ingrese el lado 3 del triangulo");
                                double lado3 = scanner.nextDouble();
                                Triangulo triangulo = new Triangulo(nombre, x, y, lado1, lado2, lado3);
                                System.out.println("Triangulo agregado: " + triangulo);
                                adminPoligono.addPolygon(triangulo);
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Ingrese el tipo de cuerpo geometrico (1 para prisma, 2 para piramide)");
                        int tipo = scanner.nextInt();

                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Ingrese el nombre del prisma");
                                String nombre = scanner.next();
                                System.out.println("Ingrese el largo de la base del prisma");
                                double largoBase = scanner.nextDouble();
                                System.out.println("Ingrese el ancho de la base del prisma");
                                double anchoBase = scanner.nextDouble();
                                System.out.println("Ingrese la altura del prisma");
                                double altura = scanner.nextDouble();
                                System.out.println("Ingrese la coordenada x del prisma");
                                double x = scanner.nextDouble();
                                System.out.println("Ingrese la coordenada y del prisma");
                                double y = scanner.nextDouble();
                                Prisma prisma = new Prisma(nombre, x, y, largoBase, anchoBase, altura);
                                System.out.println("Prisma agregado: " + prisma);

                                adminCuerpoGeometrico.addGeometricBody(prisma);
                            }
                            case 2 -> {
                                System.out.println("Ingrese el nombre de la piramide");
                                String nombre = scanner.next();
                                System.out.println("Ingrese el lado de la base de la piramide");
                                double ladoBase = scanner.nextDouble();
                                System.out.println("Ingrese el ancho de la base de la piramide");
                                double anchoBase = scanner.nextDouble();
                                System.out.println("Ingrese la altura de la piramide");
                                double altura = scanner.nextDouble();
                                System.out.println("Ingrese la coordenada x de la piramide");
                                double x = scanner.nextDouble();
                                System.out.println("Ingrese la coordenada y de la piramide");
                                double y = scanner.nextDouble();
                                Piramide piramide = new Piramide(nombre, x, y, ladoBase, anchoBase, altura);
                                System.out.println("Piramide agregada: " + piramide);
                                adminCuerpoGeometrico.addGeometricBody(piramide);
                            }
                            default -> System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Ingrese el nombre del poligono a eliminar");
                        String nombre = scanner.next();
                        adminPoligono.deletePolygon(nombre);
                    }
                    case 4 -> {
                        System.out.println("Ingrese el nombre del cuerpo geometrico a eliminar");
                        String nombreGeometrico = scanner.next();
                        adminCuerpoGeometrico.deleteGeometricBody(nombreGeometrico);
                    }
                    case 5 -> {
                        System.out.println("Ingrese el nombre del poligono a buscar");
                        String nombreBuscar = scanner.next();
                        Poligono poligono = adminPoligono.searchPolygon(nombreBuscar);
                        if (poligono != null) {
                            System.out.println("Poligono encontrado: ");
                            System.out.println("Nombre: " + poligono.getNombre());
                            System.out.println("Area: " + poligono.getArea());
                            System.out.println("Perimetro: " + poligono.getPerimeter());
                            System.out.println("Ubicacion (x, y): (" + poligono.getX() + ", " + poligono.getY() + ")");
                        } else {
                            System.out.println("Poligono no encontrado");
                        }
                    }
                    case 6 -> {
                        System.out.println("Ingrese el nombre del cuerpo geometrico a buscar");
                        String nombreBuscarGeometrico = scanner.next();
                        CuerpoGeometrico cuerpoGeometrico = adminCuerpoGeometrico
                                .searchGeometricBody(nombreBuscarGeometrico);
                        if (cuerpoGeometrico != null) {
                            System.out.println("Cuerpo geometrico encontrado: ");
                            System.out.println("Nombre: " + cuerpoGeometrico.getNombre());
                            System.out.println("Volumen: " + cuerpoGeometrico.calculateVolume());
                            System.out.println(
                                    "Ubicacion (x, y): (" + cuerpoGeometrico.getX() + ", " + cuerpoGeometrico.getY()
                                            + ")");
                        } else {
                            System.out.println("Cuerpo geometrico no encontrado");
                        }
                    }
                    case 7 -> {
                        System.out.println("Ingrese la posicion del poligono a buscar");
                        int posicion = scanner.nextInt();
                        Poligono poligonoPosicion = adminPoligono.getPolygon(posicion);
                        if (poligonoPosicion != null) {
                            System.out.println("Poligono encontrado: ");
                            System.out.println("Nombre: " + poligonoPosicion.getNombre());
                            System.out.println("Area: " + poligonoPosicion.getArea());
                            System.out.println("Perimetro: " + poligonoPosicion.getPerimeter());
                            System.out.println(
                                    "Ubicacion (x, y): (" + poligonoPosicion.getX() + ", " + poligonoPosicion.getY()
                                            + ")");
                        } else {
                            System.out.println("Poligono no encontrado");
                        }
                    }
                    case 8 -> {
                        System.out.println("Ingrese la posicion del cuerpo geometrico a buscar");
                        int posicionGeometrico = scanner.nextInt();
                        CuerpoGeometrico cuerpoGeometricoPosicion = adminCuerpoGeometrico
                                .getGeometricBody(posicionGeometrico);
                        if (cuerpoGeometricoPosicion != null) {
                            System.out.println("Cuerpo geometrico encontrado: ");
                            System.out.println("Nombre: " + cuerpoGeometricoPosicion.getNombre());
                            System.out.println("Volumen: " + cuerpoGeometricoPosicion.calculateVolume());
                            System.out.println("Ubicacion (x, y): (" + cuerpoGeometricoPosicion.getX() + ", "
                                    + cuerpoGeometricoPosicion.getY() + ")");
                        } else {
                            System.out.println("Cuerpo geometrico no encontrado");
                        }
                    }
                    case 9 -> {
                        Poligono poligonoCercano = adminPoligono.getClosestPolygon(punto);
                        if (poligonoCercano != null) {
                            System.out.println("Poligono más cercano al punto: ");
                            System.out.println("Nombre: " + poligonoCercano.getNombre());
                            System.out.println("Area: " + poligonoCercano.getArea());
                            System.out.println("Perimetro: " + poligonoCercano.getPerimeter());
                            System.out.println(
                                    "Ubicacion (x, y): (" + poligonoCercano.getX() + ", " + poligonoCercano.getY()
                                            + ")");
                        } else {
                            System.out.println("No se encontró un poligono cercano al punto");
                        }
                    }
                    case 10 -> {
                        CuerpoGeometrico cuerpoGeometricoCercano = adminCuerpoGeometrico.getClosestGeometricBody(punto);
                        if (cuerpoGeometricoCercano != null) {
                            System.out.println("Cuerpo geometrico más cercano al punto: ");
                            System.out.println("Nombre: " + cuerpoGeometricoCercano.getNombre());
                            System.out.println("Volumen: " + cuerpoGeometricoCercano.calculateVolume());
                            System.out.println("Ubicacion (x, y): (" + cuerpoGeometricoCercano.getX() + ", "
                                    + cuerpoGeometricoCercano.getY() + ")");
                        } else {
                            System.out.println("No se encontró un cuerpo geometrico cercano al punto");
                        }
                    }
                    case 11 -> {
                        Poligono poligonoLejano = adminPoligono.getFarthestPolygon(punto);
                        if (poligonoLejano != null) {
                            System.out.println("Poligono más lejano al punto: ");
                            System.out.println("Nombre: " + poligonoLejano.getNombre());
                            System.out.println("Area: " + poligonoLejano.getArea());
                            System.out.println("Perimetro: " + poligonoLejano.getPerimeter());
                            System.out.println(
                                    "Ubicacion (x, y): (" + poligonoLejano.getX() + ", " + poligonoLejano.getY() + ")");
                        } else {
                            System.out.println("No se encontró un poligono lejano al punto");
                        }
                    }
                    case 12 -> {
                        CuerpoGeometrico cuerpoGeometricoLejano = adminCuerpoGeometrico.getFarthestGeometricBody(punto);
                        if (cuerpoGeometricoLejano != null) {
                            System.out.println("Cuerpo geometrico más lejano al punto: ");
                            System.out.println("Nombre: " + cuerpoGeometricoLejano.getNombre());
                            System.out.println("Volumen: " + cuerpoGeometricoLejano.calculateVolume());
                            System.out.println("Ubicacion (x, y): (" + cuerpoGeometricoLejano.getX() + ", "
                                    + cuerpoGeometricoLejano.getY() + ")");
                        } else {
                            System.out.println("No se encontró un cuerpo geometrico lejano al punto");
                        }
                    }
                    case 13 -> {
                        System.out.println("Ingrese el valor de X para calcular el volumen del prisma");
                        double x = scanner.nextDouble();
                        double volumenPrisma = adminCuerpoGeometrico.calculateVolumePrismas(x);
                        System.out.println("Volumen total de los prismas con X mayor a " + x + ": " + volumenPrisma);
                    }
                    case 14 -> {
                        System.out.println("Ingrese el valor de X para calcular el volumen de la piramide");
                        double xPiramide = scanner.nextDouble();
                        double volumenPiramide = adminCuerpoGeometrico.calculateVolumePiramides(xPiramide);
                        System.out.println(
                                "Volumen total de las piramides con X mayor a " + xPiramide + ": " + volumenPiramide);
                    }
                    case 15 -> {
                        double volumenTotalPrismas = adminCuerpoGeometrico.calculateTotalVolumePrismas();
                        System.out.println("Volumen total de los prismas: " + volumenTotalPrismas);
                    }
                    case 16 -> {
                        double volumenTotalPiramides = adminCuerpoGeometrico.calculateTotalVolumePiramides();
                        System.out.println("Volumen total de las piramides: " + volumenTotalPiramides);
                    }
                    case 17 -> {
                        int cantidadPrismas = adminCuerpoGeometrico.countPrismas();
                        System.out.println("Cantidad de prismas: " + cantidadPrismas);
                    }
                    case 18 -> {
                        int cantidadPiramides = adminCuerpoGeometrico.countPiramides();
                        System.out.println("Cantidad de piramides: " + cantidadPiramides);
                    }
                    case 19 -> {
                        System.out.println("Ingrese el valor de X para imprimir los prismas con volumen menor a X");
                        double xPrismas = scanner.nextDouble();
                        List<CuerpoGeometrico> prismasMenorX = adminCuerpoGeometrico.getPrismasMenorX(xPrismas);
                        System.out.println("Prismas con volumen menor a " + xPrismas + ": ");
                        for (CuerpoGeometrico prisma : prismasMenorX) {
                            System.out.println(prisma);
                        }
                    }
                    case 20 -> {
                        System.out.println("Ingrese el valor de X para imprimir las piramides con volumen menor a X");
                        double xPiramides = scanner.nextDouble();
                        List<CuerpoGeometrico> piramidesMenorX = adminCuerpoGeometrico.getPiramidesMenorX(xPiramides);
                        System.out.println("Piramides con volumen menor a " + xPiramides + ": ");
                        for (CuerpoGeometrico piramide : piramidesMenorX) {
                            System.out.println(piramide);
                        }
                    }
                    case 21 -> {
                        System.out.println("Poligonos:");
                        List<Poligono> poligonos = adminPoligono.getPolygons();
                        for (Poligono poligonosTotal : poligonos) {
                            System.out.println(poligonosTotal);
                        }
                    }
                    case 22 -> {
                        System.out.println("Cuerpos geometricos:");
                        List<CuerpoGeometrico> cuerposGeometricos = adminCuerpoGeometrico.getGeometricBodies();
                        for (CuerpoGeometrico cuerpoGeometricoTotal : cuerposGeometricos) {
                            System.out.println(cuerpoGeometricoTotal);
                        }
                    }
                    case 23 -> {
                        System.out.println("Saliendo del sistema... ¡Hasta luego!");
                        System.out.println(
                                "Utilizaste el sistema de poligonos y cuerpos geometricos creado por Alessandro Rios Lopez");
                    }
                    default -> System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                }
            } while (opcion != 23);
        } catch (Exception e) {
            System.out.println("Ocurrió un error. Por favor, inténtalo de nuevo.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
