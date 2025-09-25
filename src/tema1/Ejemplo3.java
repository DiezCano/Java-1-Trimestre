package tema1;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {


        //Leer el radio de un circulo y calcular e imprimir su area y logitud

        //ANALISIS
        //Datos de entrada: radio de la circunferencia
        //Datos de la salida: area y longitud de la circunferencia
        //DISEÑO
        //area = PI * radio * radio
        //longitud = PI * 2 * radio

        //1.Declaracion de variables
        double radio;
        double area, longitud;

        //2.Leer datos de entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio =sc.nextDouble();
        System.out.println("El radio es " + radio);

        //3.Hacer calculos
        area = 3.1415 * radio * radio;
        longitud = 2 * 3.1415 * radio;

        //4. Mostrar resultado
        System.out.println("El longitud es: " + longitud);
        System.out.println("El area es: " + area);
    }
}
