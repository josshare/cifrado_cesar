import java.util.Scanner;

public class CifradoCesar {
    public static String cifrar(String texto, int rotacion) {
        StringBuilder resultado = new StringBuilder();
        for (char letra : texto.toCharArray()) {
            if (Character.isLetter(letra)) {
                char base = Character.isUpperCase(letra) ? 'A' : 'a';
                char cifrada = (char) ((letra - base + rotacion) % 26 + base);
                resultado.append(cifrada);
            } else {
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }

    public void Cifrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el mensaje a cifrar: ");
        String mensajeOriginal = scanner.nextLine();
        System.out.print("Ingresa la cantidad de rotación: ");
        int rotacion = scanner.nextInt();
        DragonAsciiArt dragon = new DragonAsciiArt();
        dragon.mostrarDragon();
        String mensajeCifrado = cifrar(mensajeOriginal, rotacion);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        System.out.print("Ingresa el mensaje a descifrar: ");
        scanner.nextLine(); // Consumir el salto de línea
        String mensajeCifradoUsuario = scanner.nextLine();
        dragon.mostrarDragon();
        String mensajeDescifrado = cifrar(mensajeCifradoUsuario, -rotacion);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
    }
}
