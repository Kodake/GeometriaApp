package controllers;

import interfaces.UX;
import modelos.Circle;
import modelos.Figure;
import modelos.Parallelogram;
import modelos.Trapezoid;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Controlador para gestionar figuras geométricas.
 */
public class FigureController implements UX {
    private ArrayList<Figure> elements;

    /**
     * Constructor de la clase FigureController.
     */
    public FigureController() {
        this.elements = new ArrayList<>();
    }

    /**
     * Agrega una figura a la lista de elementos.
     *
     * @param figure La figura que se va a agregar.
     */
    public void alta(Figure figure) {
        elements.add(figure);
    }

    /**
     * Elimina una figura de la lista de elementos.
     *
     * @param figure La figura que se va a eliminar.
     */
    public void baja(Figure figure) {
        elements.remove(figure);
    }

    /**
     * Busca una figura por su representación en forma de cadena.
     *
     * @param searchString La cadena de búsqueda.
     * @return La figura encontrada o null si no se encuentra.
     */
    public Figure buscar(String searchString) {
        for (Figure figure : elements) {
            if (figure.toString().equals(searchString)) {
                return figure;
            }
        }
        return null;
    }

    /**
     * Calcula el área total de todas las figuras almacenadas.
     *
     * @return El área total de todas las figuras.
     */
    public double totalArea() {
        double totalArea = 0;
        for (Figure figure : elements) {
            totalArea += figure.calculateArea();
        }
        return totalArea;
    }

    /**
     * Calcula el perímetro total de todas las figuras almacenadas.
     *
     * @return El perímetro total de todas las figuras.
     */
    public double totalPerimeter() {
        double totalPerimeter = 0;
        for (Figure figure : elements) {
            totalPerimeter += figure.calculatePerimeter();
        }
        return totalPerimeter;
    }

    /**
     * Obtiene el número total de figuras almacenadas.
     *
     * @return El número total de figuras.
     */
    public int totalFigures() {
        return elements.size();
    }

    /**
     * Obtiene el número total de lados de todas las figuras almacenadas.
     *
     * @return El número total de lados de todas las figuras.
     */
    public int totalSides() {
        int totalSides = 0;
        for (Figure figure : elements) {
            totalSides += figure.numberOfSides();
        }
        return totalSides;
    }

    /**
     * Calcula el área total de un tipo específico de figura.
     *
     * @param type El tipo de figura.
     * @return El área total de ese tipo de figura.
     */
    public double totalAreaByType(String type) {
        double totalAreaByType = 0;
        for (Figure figure : elements) {
            if (figure.getClass().getSimpleName().equals(type)) {
                totalAreaByType += figure.calculateArea();
            }
        }
        return totalAreaByType;
    }

    /**
     * Calcula el perímetro total de un tipo específico de figura.
     *
     * @param type El tipo de figura.
     * @return El perímetro total de ese tipo de figura.
     */
    public double totalPerimeterByType(String type) {
        double totalPerimeterByType = 0;
        for (Figure figure : elements) {
            if (figure.getClass().getSimpleName().equals(type)) {
                totalPerimeterByType += figure.calculatePerimeter();
            }
        }
        return totalPerimeterByType;
    }

    /**
     * Obtiene el número total de figuras de un tipo específico.
     *
     * @param type El tipo de figura.
     * @return El número total de figuras de ese tipo.
     */
    public int totalFiguresByType(String type) {
        int count = 0;
        for (Figure figure : elements) {
            if (figure.getClass().getSimpleName().equals(type)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Obtiene el número total de lados de un tipo específico de figura.
     *
     * @param type El tipo de figura.
     * @return El número total de lados de ese tipo de figura.
     */
    public int totalSidesByType(String type) {
        int totalSidesByType = 0;
        for (Figure figure : elements) {
            if (figure.getClass().getSimpleName().equals(type)) {
                totalSidesByType += figure.numberOfSides();
            }
        }
        return totalSidesByType;
    }

    // Otros métodos de la clase FigureController

    @Override
    public void show() {
        System.out.println("Figuras almacenadas:");
        for (Figure figure : elements) {
            System.out.println(figure.toString());
        }
    }

    @Override
    public void capture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de figura (Parallelogram, Trapezoid, o Circle):");
        String tipo = scanner.nextLine();

        switch (tipo.toLowerCase()) {
            case "parallelogram":
                System.out.println("Ingrese la longitud del paralelogramo:");
                double length = scanner.nextDouble();
                System.out.println("Ingrese el ancho del paralelogramo:");
                double width = scanner.nextDouble();
                Parallelogram parallelogram = new Parallelogram(length, width);
                alta(parallelogram);
                System.out.println("Paralelogramo capturado: " + parallelogram.toString());
                print("Parallelogram");
                break;
            case "trapezoid":
                System.out.println("Ingrese la longitud de la base1 del trapecio:");
                double base1 = scanner.nextDouble();
                System.out.println("Ingrese la longitud de la base2 del trapecio:");
                double base2 = scanner.nextDouble();
                System.out.println("Ingrese la altura del trapecio:");
                double height = scanner.nextDouble();
                System.out.println("Ingrese la longitud del lado1 del trapecio:");
                double side1 = scanner.nextDouble();
                System.out.println("Ingrese la longitud del lado2 del trapecio:");
                double side2 = scanner.nextDouble();
                Trapezoid trapezoid = new Trapezoid(base1, base2, height, side1, side2);
                alta(trapezoid);
                System.out.println("Trapezoide capturado: " + trapezoid.toString());
                print("Trapezoid");
                break;
            case "circle":
                System.out.println("Ingrese el radio del círculo:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                alta(circle);
                System.out.println("Círculo capturado: " + circle.toString());
                print("Circle");
                break;
            default:
                System.out.println("Tipo de figura no válido.");
        }
    }

    @Override
    public void print(String type) {
        System.out.println("Total area: " + totalArea());
        System.out.println("Total perimeter: " + totalPerimeter());
        System.out.println("Total figures: " + totalFigures());
        System.out.println("Total sides: " + totalSides());
        System.out.println("Total area of " + type + "s: " + totalAreaByType(type));
        System.out.println("Total perimeter of " + type + "s: " + totalPerimeterByType(type));
        System.out.println("Total figures of " + type + "s: " + totalFiguresByType(type));
        System.out.println("Total sides of " + type + "s: " + totalSidesByType(type));
    }
}
