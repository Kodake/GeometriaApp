package modelos;

/**
 * Clase que representa un paralelogramo.
 */
public class Parallelogram extends Figure {
    private double length;
    private double width;

    /**
     * Constructor de la clase Parallelogram.
     *
     * @param length La longitud del paralelogramo.
     * @param width  El ancho del paralelogramo.
     */
    public Parallelogram(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calcula el área del paralelogramo.
     *
     * @return El área del paralelogramo.
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Calcula el perímetro del paralelogramo.
     *
     * @return El perímetro del paralelogramo.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    /**
     * Obtiene el número de lados del paralelogramo.
     *
     * @return El número de lados del paralelogramo (siempre 4 para un paralelogramo).
     */
    @Override
    public int numberOfSides() {
        return 4;
    }

    /**
     * Representación en forma de cadena del paralelogramo.
     *
     * @return Una cadena que representa el paralelogramo.
     */
    @Override
    public String toString() {
        return "Paralelogramo - Longitud: " + length + ", Ancho: " + width;
    }
}
