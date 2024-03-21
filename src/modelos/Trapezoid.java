package modelos;

/**
 * Clase que representa un trapecio.
 */
public class Trapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    /**
     * Constructor de la clase Trapezoid.
     *
     * @param base1  La longitud de la base inferior del trapecio.
     * @param base2  La longitud de la base superior del trapecio.
     * @param height La altura del trapecio.
     * @param side1  La longitud del lado 1 del trapecio.
     * @param side2  La longitud del lado 2 del trapecio.
     */
    public Trapezoid(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    /**
     * Calcula el área del trapecio.
     *
     * @return El área del trapecio.
     */
    @Override
    public double calculateArea() {
        return ((base1 + base2) / 2) * height;
    }

    /**
     * Calcula el perímetro del trapecio.
     *
     * @return El perímetro del trapecio.
     */
    @Override
    public double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }

    /**
     * Obtiene el número de lados del trapecio.
     *
     * @return El número de lados del trapecio (siempre 4 para un trapecio).
     */
    @Override
    public int numberOfSides() {
        return 4;
    }

    /**
     * Representación en forma de cadena del trapecio.
     *
     * @return Una cadena que representa el trapecio.
     */
    @Override
    public String toString() {
        return "Trapezoid - Base1: " + base1 + ", Base2: " + base2 + ", Height: " + height + ", Side1: " + side1 + ", Side2: " + side2;
    }
}
