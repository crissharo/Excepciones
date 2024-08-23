import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe algo:");
        String lectTeclado = scanner.nextLine();

        try {
            char caracter = CadenaUtil.obtenerCaracterEn(lectTeclado, 7);
            System.out.println("Posición 7: " + caracter);
        } catch (Exception e) {
            System.out.println("Escribe algo con mas de 7 carateres");
        }

        scanner.close();
    }
}

class CadenaUtil {

    public static char obtenerCaracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Escribe algo con mas de 7 carateres");
        }
    }
}
