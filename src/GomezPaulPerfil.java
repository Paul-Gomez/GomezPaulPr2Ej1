import java.util.List;

/**
 * Clase Perfil que representa un perfil de usuario en la aplicación About Me.
 */
public class GomezPaulPerfil {
    // Atributos privados para encapsular los datos del perfil
    private String name; // Nombre del usuario
    private String story; // Historia del usuario
    private List<String> hobbies; // Lista de hobbies del usuario
    private List<String> foods; // Lista de comidas favoritas del usuario
    private List<String> funFacts; // Lista de datos curiosos del usuario

    /**
     * Constructor para inicializar los atributos del perfil.
     * @param name Nombre del perfil.
     * @param story Historia del perfil.
     * @param hobbies Lista de hobbies.
     * @param foods Lista de comidas favoritas.
     * @param funFacts Lista de datos curiosos.
     */
    public GomezPaulPerfil(String name, String story, List<String> hobbies, List<String> foods, List<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    // Método para obtener el nombre del perfil
    public String getName() {
        return name;
    }

    // Método para obtener la historia del perfil
    public String getStory() {
        return story;
    }

    // Método para obtener los hobbies
    public String getHobbies() {
        return String.join(", ", hobbies); // Une los elementos de la lista con comas
    }

    // Método para obtener las comidas favoritas
    public String getFoods() {
        return String.join(", ", foods); // Une los elementos de la lista con comas
    }

    // Método para obtener un dato curioso al azar
    public String getRandomFunFact() {
        int index = (int) (Math.random() * funFacts.size()); // Genera un índice aleatorio
        return funFacts.get(index); // Devuelve el dato curioso en la posición aleatoria
    }
}