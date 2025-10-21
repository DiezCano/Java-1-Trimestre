package tema2;

public class Bucles4Ejercicios {
    public static void main(String[] args) {

        //Humerus y Cubitus se aburren el finde y van a jugar a los dados
        //Humerus tira tres dados y su puntuación es la suma de los pares
        //Cubitus tira tres dados y su puntuación es la suma de impares
        //Si juegan 10 rondas , dime el ganador

        int tiradaC1 ,  tiradaC2 , tiradaC3,  tiradaH1 , tiradaH2 , tiradaH3;
        int sumaH;
        int sumaC;
        int contadorRondasGC = 0 , contadorRondasGH = 0;

        for (int i = 1; i <= 10; i++) {

            tiradaC1 = (int) (Math.random() * 6) + 1;
            tiradaC2 = (int) (Math.random() * 6) + 1;
            tiradaC3 = (int) (Math.random() * 6) + 1;
            sumaC = tiradaC1 + tiradaC2 + tiradaC3;
            System.out.println("El resultdao de Cubitus " + sumaC);

            tiradaH1 = (int) (Math.random() * 6) + 1;
            tiradaH2 = (int) (Math.random() * 6) + 1;
            tiradaH3 = (int) (Math.random() * 6) + 1;
            sumaH = tiradaH1 + tiradaH2;
            System.out.println("El resultado de Humerus " + sumaH);


        }
    }
}
