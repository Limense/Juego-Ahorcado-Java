import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner para que nos permita que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones asignaciones e inicializaciones
        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Areglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativas (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.println(letrasAdivinadas[i]);
        }

        // Estructura de control: Iterativas (Bucle)
        while(!palabraAdivinada && intentos < intentosMax) {
            System.out.println("Adivina una letra: ");
            char letraIngresada = scanner.nextLine().charAt(0);
            boolean letraCorrecta = false;

            // Estructura de control: Iterativas (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letraIngresada) {
                    letrasAdivinadas[i] = letraIngresada;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta. Te quedan " + (intentosMax - intentos) + " intentos.");
            }

            // Mostrar el estado actual de las letras adivinadas
            System.out.println(letrasAdivinadas);

            // Verificar si la palabra ha sido completamente adivinada
            palabraAdivinada = true;
            for (char c : letrasAdivinadas) {
                if (c == '_') {
                    palabraAdivinada = false;
                    break;
                }
            }
        }

        if (palabraAdivinada) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Has perdido. La palabra era: " + palabraSecreta);
        }
        scanner.close();
    }
}
