import java.util.Arrays;
import java.util.Scanner;

public class GomezPaulMain {
    public static void main(String[] args) {
        GomezPaulPerfil perfil = new GomezPaulPerfil(
                "Paul Gomez",
                "Soy un estudiante de programación deseando aprender todo lo posible.",
                Arrays.asList("🏔️ Montaña", "🎥 Cine", "🏍️ Motos"),
                Arrays.asList("🍛 Lentejas", "🥟 Croquetas", "🍎 Frutas"),
                Arrays.asList("Arreglo motos antiguas", "Hablo 5 idiomas", "Soy monitor de esquí")
        );

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenu AboutMe [" + perfil.getName() + "]");
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Fact");
            System.out.println("[4] Salir");
            System.out.print("Selecciona una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                scanner.next();
            }

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nMi historia: " + perfil.getStory());
                    break;
                case 2:
                    System.out.println("\nHobbies: " + perfil.getHobbies());
                    System.out.println("Comidas favoritas: " + perfil.getFoods());
                    break;
                case 3:
                    System.out.println("\nDato curioso: " + perfil.getRandomFunFact());
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (option != 4);

        scanner.close();
    }
}