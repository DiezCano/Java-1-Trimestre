package tema2;

public class EjemploDadosBucles2 {
    public static void main(String[] args) {

        int contadorDeTiradas = 0;

        for (int i =1; i <= 100 ; i++) {
            int dado1 = (int) (Math.random() * 12) + 1;
            int dado2 = (int) (Math.random() * 12) + 1;

            System.out.println("Tirada1 " + dado1);
            System.out.println("Tirada2 " + dado2);

            if (dado1 == dado2) {
                contadorDeTiradas++;
            }
        }
        System.out.println("Ha salido " + contadorDeTiradas + " veces ");




    }
}
