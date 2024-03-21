package interfaces;

/**
 * Interfaz que define métodos para interactuar con el usuario.
 */
public interface UX {
    /**
     * Muestra las figuras almacenadas.
     */
    void show();

    /**
     * Captura una nueva figura proporcionando la entrada del usuario.
     */
    void capture();

    /**
     * Imprime los detalles de las figuras de un tipo específico.
     *
     * @param figure El tipo de figura cuyos detalles se imprimirán.
     */
    void print(String figure);
}
