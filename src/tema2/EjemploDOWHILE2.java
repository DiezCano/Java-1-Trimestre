package tema2;

public class EjemploDOWHILE2 {
    public static void main(String[] args) {

        int contador = 1;
        do {
            System.out.print(contador++ + ",");
        } while (contador <= 10);

        System.out.println();

        contador = 11;
        do {
            System.out.print(contador-- + ",");
        } while (contador >= 1);

        contador = 10;
        do {
            System.out.print(contador-- + ",");
        } while (contador <= 1);
    }
}
