package tema2;

public class Ejemplo2 {
    public static void main() {

        int edad = 14;

        if (edad < 4) {
            System.out.println("Eres un niño pequeño");
        } else if (edad == 5) {
            System.out.println("Vas a primaria");
        } else if (edad == 10) {
            System.out.println("Vas a secundaria");
        }



        if (edad < 3) {
            System.out.println("En primaria o guarderia");
        } else if (edad < 12) {
            System.out.println("Vas a primaria");
        } else if (edad < 15) {
            System.out.println("Vas a otra cosa");
        } else {
            System.out.println("Vas a otra cosa diferente");
        }

    }
}
