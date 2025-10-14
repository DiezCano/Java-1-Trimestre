package tema2;

public class Ejercicio2ClaseBucles {
    public static void main(String[] args) {

        //Lanza dos dados (1-6) mientras sean diferentes
        //Cuenta las veces que has tenido que lanzarlos


        int tirada1, tirada2;
        int contador = 0;

        do {
            tirada1 = (int) (Math.random() * 5) + 1;
            tirada2 = (int) (Math.random() * 5) + 1;
            System.out.println("tiradas:" + tirada1 + " - " + tirada2);

            contador++;
        }while (tirada1 != tirada2);

        System.out.println("He tenido que lanzar " + contador + " veces para que sean iguales ");




    }
}
