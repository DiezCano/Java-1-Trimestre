package AnaEntornos;

public class ParImpar {
    static void main(String[] args) {

        int i = 0;
        int pares = 0;
        int impares = 0;
        int nuevo;

        while (i < 3) {
            nuevo = (int)(Math.random()*100);

            if(nuevo % 2 == 0) {
                pares++;
                System.out.println("El numero " + nuevo + "es par");
            } else {
                impares++;
                System.out.println("El numero " + nuevo + "es impar");
            }
        }
    }
}

