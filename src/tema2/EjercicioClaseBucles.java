package tema2;

public class EjercicioClaseBucles {
    public static void main(String[] args) {

        //1. Lanza un dado (1-6) de forma aleatoria hasta que salga un 6.
        // Cuenta el numero de veces que hubo que tirar el dado para que salga el 6

        // do {
        // lanzar el dado
        // ver si es 6
        // contador++ -> veces que se lanza el dado
        // } while el dado no es 6

        int contador =0;
        int tirada = 0;

        do {
            tirada = (int) (Math.random() * 40) + 1;
            System.out.println("Tirada es:  " + tirada);
            contador++;
        } while (tirada != 40);
        System.out.println("Se tira el dado = " + contador + " veces ");

        //Se repite hasta que se haga el 6
    }
}
