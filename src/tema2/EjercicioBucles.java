package tema2;

import java.util.Scanner;

public class EjercicioBucles {
    public static void main(String[] args) {

        //1. Suma los 10 primeros numeros (0,1,...,9) y muestra el resultado
        //2. Pide en un bucle 5 numeros por teclado y di si cada uno es par o impar
        //3. Pide por teclado cuatro notas (double) y muestra la media de ellas

        //1. Ejercicio

        int contador=0;
        int suma=0;
        while(contador<10){
            suma = suma + contador;
            contador++;
        }
        System.out.println("La suma es: "+suma);

        //2. Ejercicio

        Scanner sc = new Scanner(System.in);

        int opcion=1;
        int ParImpar;
        while(opcion <=5){
            System.out.println("Introduce numero");
            ParImpar = sc.nextInt();
            if(ParImpar % 2 == 0){
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }

            opcion++;
        }


        //3. Ejercicio

        double nota;
        double notaMedia =0;
        contador=0;
        while(contador < 4){
            System.out.println("Introduce nota: ");
            nota = sc.nextDouble();
            notaMedia = notaMedia + nota;
            contador++;
            System.out.println("La media es: "+notaMedia/contador);
        }

    }
}
