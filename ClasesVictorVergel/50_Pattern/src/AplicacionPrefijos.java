import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class AplicacionPrefijos {

	public static void main(String[] args) {
        // Mapa que asocia prefijos internacionales con sus respectivos países
        Map<String, String> prefijosPaises = new HashMap<>();
        prefijosPaises.put("+34", "España");
        prefijosPaises.put("+1", "Estados Unidos");
        prefijosPaises.put("+44", "Reino Unido");
        // Agrega más prefijos y países según sea necesario

        // Patrón de expresión regular para identificar el prefijo internacional de un número de teléfono
        Pattern patternPrefijo = Pattern.compile("\\+\\d{1,3}");

        // Listado de números de teléfono con prefijo internacional
        Stream<String> telefonos = Stream.of("+34-123456789", "+1-987654321", "+44-111223344","+33-899899899","+34-332123432");

        // Predicado para verificar si un número de teléfono tiene un prefijo internacional válido
        Predicate<String> tienePrefijoValido = telefono -> {
            Matcher matcher = patternPrefijo.matcher(telefono);
            return matcher.find();
        };

        // Función para obtener el país correspondiente a un número de teléfono
      /*  Predicate<String> obtenerPais = telefono -> {
            Matcher matcher = patternPrefijo.matcher(telefono);
            if (matcher.find()) {
                String prefijo = matcher.group();
                String pais = prefijosPaises.get(prefijo);
                System.out.println("Teléfono: " + telefono + ", País: " + pais);
            } else {
                System.out.println("Teléfono: " + telefono + ", País: No se pudo determinar el país");
            }
            return true; // Siempre devolvemos true para mantener el flujo del Stream
        };
*/
        // Filtrar los números de teléfono con prefijo internacional y obtener el país correspondiente
        telefonos
        .filter(tienePrefijoValido)
        .forEach(telefono -> {
            if (tienePrefijoValido.test(telefono)) {
                Matcher matcher = patternPrefijo.matcher(telefono);
                if (matcher.find()) {
                    String prefijo = matcher.group();
                    String pais = prefijosPaises.get(prefijo);
                    System.out.println("--Teléfono: " + telefono + ", País: " + pais);
                }
            } else {
                System.out.println("--Teléfono: " + telefono + ", País: No se pudo determinar el país");
            }
        });
	}
}
