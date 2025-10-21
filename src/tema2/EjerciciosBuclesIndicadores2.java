package tema2;

import java.util.Scanner;

public class EjerciciosBuclesIndicadores2 {
    public static void main(String[] args) {

        //Pide 5 cadenas de texto por teclado y dime si alguna de ellas
        //tiene una longitud mayor de 5 caracteres

        Scanner sc = new Scanner(System.in);
        String palabra = new String();
        boolean mayorDe5 =false; //indicador

        for (int i=0; i < 5; i++) {
            System.out.println("Dime una cadena");
            palabra = sc.nextLine();
        }

        if (palabra.length() > 5) {
            mayorDe5 = true;
        }

        if (mayorDe5) {
            System.out.println("El valor de palabra es mayor a 5!");
        } else  {
            System.out.println("El valor de palabra es menor a 5!");
        }



    }
}
