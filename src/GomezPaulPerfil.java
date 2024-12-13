import java.util.List;

/**
 * Clase Perfil que representa un perfil de usuario en la aplicación About Me.
 */
public class GomezPaulPerfil {
    private String name;
    private String story;
    private List<String> hobbies;
    private List<String> foods;
    private List<String> funFacts;

    public GomezPaulPerfil(String name, String story, List<String> hobbies, List<String> foods, List<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public String getHobbies() {
        return String.join(", ", hobbies);
    }

    public String getFoods() {
        return String.join(", ", foods);
    }

    public String getRandomFunFact() {
        int index = (int) (Math.random() * funFacts.size());
        return funFacts.get(index);
    }
}