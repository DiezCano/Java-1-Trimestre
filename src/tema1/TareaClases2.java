package tema1;

import java.util.Scanner;

public class TareaClases2 {
    public static void main(String[] args) {

       //Un alumno del modulo de Programación quiere saber su nota final.Esta consta de:
       //55% de tres notas parciales
       //30% calificación examen final
       //15% calificación trabajo final
        //Pide los valores de entrada y muestra la nota final

        double Nota1, Nota2, Nota3, NotaExamenFinal, NotaTrabajoFinal, NotaFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de Nota 1: ");
        Nota1 = sc.nextDouble();
        System.out.println("Ingrese el valor de Nota 2: ");
        Nota2 = sc.nextDouble();
        System.out.println("Ingrese el valor de Nota 3: ");
        Nota3 = sc.nextDouble();
        System.out.println("Ingrese el valor de Nota ExamenFinal: ");
        NotaExamenFinal = sc.nextDouble();
        System.out.println("Ingrese el valor de Nota TrabajoFinal: ");
        NotaTrabajoFinal = sc.nextDouble();

        NotaFinal = ((Nota1 + Nota2 + Nota3)/3)*0.55 + 0.3*NotaExamenFinal + 0.15*NotaTrabajoFinal;
        System.out.println("La Nota es: " + NotaFinal);





    }
}
