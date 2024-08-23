import java.util.Scanner;

class Negativo extends Exception {
    public Negativo() {
        super("Usa numeros positivos.");
    }

    public Negativo(String mensaje) {
        super(mensaje);
    }
}

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero:");
        double numero = scanner.nextDouble();

        try {
            if (numero < 0) {
                throw new Negativo();
            } else {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
            }
        } catch (Negativo e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
