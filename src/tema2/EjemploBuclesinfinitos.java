package tema2;

public class EjemploBuclesinfinitos {
    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        //Saca un bucle los numeros del -10 al 10
        contador = -10;
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        //Cuenta atras del 10 al 1

        int contador2 = 10;
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }

    }
}
