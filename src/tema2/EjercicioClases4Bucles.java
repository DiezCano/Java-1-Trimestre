package tema2;

import java.util.Scanner;

public class EjercicioClases4Bucles {
    public static void main(String[] args) {

        //Pide 2 numeros por teclado entre 1 y 100
        //Muestra los numeros pares entre esos dos numeros

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero del 1-100 : ");
        num1 = sc.nextInt();
        System.out.println("Dime el segundo numero del 1-100 : ");
        num2 = sc.nextInt();

        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }



    }
}
