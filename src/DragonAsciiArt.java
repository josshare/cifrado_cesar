import java.util.Scanner;

public class DragonAsciiArt {
    public void mostrarDragon() {

        // Arte ASCII del dragón
        String[] dragon = {
                "   / \\  ",
                "  (o o) ",
                "   \\_/  ",
                "\u001B[31m  / | \\ ",
                "\u001B[31m / / \\ \\ "+"\u001B[0m"
        };
        String[] dragon2 = {
                "   / \\  ",
                "  (- -) ",
                "   \\_/  ",
                "\u001B[31m  / | \\ ",
                "\u001B[31m / / \\ \\ "+"\u001B[0m"
        };

        int frame = 0;
        while (frame < dragon.length) {
            for (String line : dragon) {
                System.out.println(line);
            }

            frame++;
            // Espera de 1 segundo (1000 ms)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (String line2 : dragon2) {
                System.out.println(line2);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Limpia la consola (no funciona en IntelliJ, pero funciona en una consola real)
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
