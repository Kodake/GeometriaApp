import controllers.FigureController;
import modelos.Circle;
import modelos.Parallelogram;
import modelos.Trapezoid;

import java.util.Scanner;

public class GeometriaApp {
    public static void main(String[] args) {
        FigureController controller = new FigureController();

//        Ejemplo de uso
//        Parallelogram parallelogram = new Parallelogram(5, 4);
//        Circle circle = new Circle(3);
//        Trapezoid trapezoid = new Trapezoid(3, 4, 5, 6, 9);
//
//        controller.alta(parallelogram);
//        controller.alta(circle);
//        controller.alta(trapezoid);
//
//        System.out.println("Total area: " + controller.totalArea());
//        System.out.println("Total perimeter: " + controller.totalPerimeter());
//        System.out.println("Total figures: " + controller.totalFigures());
//        System.out.println("Total sides: " + controller.totalSides());
//
//        System.out.println("Total area of parallelograms: " + controller.totalAreaByType("Parallelogram"));
//        System.out.println("Total area of trapezoid: " + controller.totalAreaByType("Trapezoid"));
//        System.out.println("Total area of circles: " + controller.totalAreaByType("Circle"));
//        System.out.println("Total perimeter of parallelograms: " + controller.totalPerimeterByType("Parallelogram"));
//        System.out.println("Total perimeter of trapezoid: " + controller.totalPerimeterByType("Trapezoid"));
//        System.out.println("Total perimeter of circles: " + controller.totalPerimeterByType("Circle"));
//        System.out.println("Total figures of parallelograms: " + controller.totalFiguresByType("Parallelogram"));
//        System.out.println("Total figures of trapezoid: " + controller.totalFiguresByType("Trapezoid"));
//        System.out.println("Total figures of circles: " + controller.totalFiguresByType("Circle"));
//        System.out.println("Total sides of parallelograms: " + controller.totalSidesByType("Parallelogram"));
//        System.out.println("Total sides of trapezoid: " + controller.totalSidesByType("Trapezoid"));
//        System.out.println("Total sides of circles: " + controller.totalSidesByType("Circle"));

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println();
            System.out.println("Menú:");
            System.out.println("1. Mostrar figuras");
            System.out.println("2. Agregar figura");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    controller.show();
                    break;
                case 2:
                    controller.capture();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}