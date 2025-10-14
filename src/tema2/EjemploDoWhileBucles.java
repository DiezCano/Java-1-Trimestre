package tema2;

public class EjemploDoWhileBucles {
    public static void main(String[] args) {

        //DO-WHILE: igual que el WHILE pero se ejecuta al menos una vez el contador.
        //Si es hasta el 10 y pones el 15 en vez de hacer , desde el 0 al 1 solo pone el numero que supera eso.
        int contador = 15;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 10);

        contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }


    }
}
