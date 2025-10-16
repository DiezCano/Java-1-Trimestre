package tema2;

public class EjercicioBucles7 {
    public static void main(String[] args) {

        //Numeros que sean multiplos de 3 pero no de 5 entre 100 y 200

        int contadorMultiplosde3 = 0;
        int contador = 0;
        for (contador = 100; contador <= 200; contador++) {


            if (contador % 3 == 0 && contador % 5 != 0) {
                System.out.println("Encontrado el " + contador);
                contadorMultiplosde3++;
            }

        }

        System.out.println("Entre el 100 y 200 hay " + contadorMultiplosde3 + " digitos ");



    }
}
