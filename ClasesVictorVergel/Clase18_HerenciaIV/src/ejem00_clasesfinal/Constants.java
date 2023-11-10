package ejem00_clasesfinal;

public final class Constants {
    public static final int MAX_CONNECTIONS = 10;
    public static final String DEFAULT_USERNAME = "guest";
    public static final String API_KEY = "your_api_key";

    // Constructor privado para evitar instanciación
    private Constants() {
        throw new AssertionError("No se permite la instanciación de esta clase.");
    }
}
