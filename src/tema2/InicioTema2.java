package tema2;

public class InicioTema2 {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 6) + 1;
        System.out.println( "tirada " + n );

        if (n == 6) {
            System.out.println("HAS GANADO");
        } else  {
            System.out.println("NO HAS GANADO");
        }




    }
}
