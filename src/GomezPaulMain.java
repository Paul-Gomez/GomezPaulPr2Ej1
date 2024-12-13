import java.util.Arrays;
import java.util.Scanner;

public class GomezPaulMain {
    public static void main(String[] args) {
        // Creación de un objeto GomezPaulPerfil con datos iniciales
        GomezPaulPerfil perfil = new GomezPaulPerfil(
                "Paul Gomez",
                "Soy un estudiante de programación deseando aprender todo lo posible.", // Historia personal
                Arrays.asList("🏔️ Montaña", "🎥 Cine", "🏍️ Motos"), // Lista de hobbies
                Arrays.asList("🍛 Lentejas", "🥟 Croquetas", "🍎 Frutas"), // Lista de comidas favoritas
                Arrays.asList("Arreglo motos antiguas", "Hablo 5 idiomas", "Soy monitor de esquí") // Lista de datos curiosos
        );

        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int option; // Variable para almacenar la opción del menú seleccionada

        // Bucle para mostrar el menú hasta que el usuario seleccione la opción de salir
        do {
            // Mostrar menú principal
            System.out.println("\nMenu AboutMe [" + perfil.getName() + "]");
            System.out.println("[1] Story"); // Muestra la historia del perfil
            System.out.println("[2] Favorites"); // Muestra hobbies y comidas favoritas
            System.out.println("[3] Fun Fact"); // Muestra un dato curioso aleatorio
            System.out.println("[4] Salir"); // Termina el programa
            System.out.print("Selecciona una opción: ");

            // Validación de entrada: asegura que el usuario introduzca un número
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                scanner.next();
            }

            option = scanner.nextInt(); // Lee la opción seleccionada
            switch (option) {
                case 1:
                    // Mostrar la historia del perfil
                    System.out.println("\nMi historia: " + perfil.getStory());
                    break;
                case 2:
                    // Mostrar hobbies y comidas favoritas
                    System.out.println("\nHobbies: " + perfil.getHobbies());
                    System.out.println("Comidas favoritas: " + perfil.getFoods());
                    break;
                case 3:
                    // Mostrar un dato curioso aleatorio
                    System.out.println("\nDato curioso: " + perfil.getRandomFunFact());
                    break;
                case 4:
                    // Mensaje de despedida
                    System.out.println("¡Adiós!");
                    break;
                default:
                    // Mensaje de error para opciones no válidas
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (option != 4); // Termina cuando el usuario selecciona la opción 4

        scanner.close(); // Cierra el Scanner al finalizar
    }
}