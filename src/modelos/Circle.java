package modelos;

/**
 * Clase que representa un círculo.
 */
public class Circle extends Figure {
    private double radius;

    /**
     * Constructor de la clase Circle.
     *
     * @param radius El radio del círculo.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calcula el área del círculo.
     *
     * @return El área del círculo.
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calcula el perímetro del círculo.
     *
     * @return El perímetro del círculo.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Obtiene el número de lados del círculo.
     *
     * @return El número de lados del círculo (siempre 0 para un círculo).
     */
    @Override
    public int numberOfSides() {
        return 0;
    }

    /**
     * Representación en forma de cadena del círculo.
     *
     * @return Una cadena que representa el círculo.
     */
    @Override
    public String toString() {
        return "Círculo - Radio: " + radius;
    }
}
