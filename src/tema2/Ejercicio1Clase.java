package tema2;

import java.util.Scanner;

public class Ejercicio1Clase {
    public static void main(String[] args) {

        int edad;
        String sexo = "h";
        boolean amigoJefe = false;


        //Puedes entrar a la discoteca si tienes mas de 18
        //Puedes entrar si tienes mas de dieciseis y eres mujer (no deberias)
        //Puedes entrar si tienes mas de dieciseis y hombre y amigo del jefe
        //No puedes entrar en otro caso

        edad = 18;

        if (edad >= 18) {
            System.out.println("Puedes entrar");
        } else if (edad >= 16 && sexo == "m") {
            System.out.println("Puedes entrar");
        } else if (edad >= 16 && sexo == "h" && amigoJefe) {
            System.out.println("Puedes entrar");
        } else  {
            System.out.println("No puedes entrar"); }
    }

}
