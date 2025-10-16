package tema2;

public class EjerciciosBucles9 {
    public static void main(String[] args) {

        //Hay dos romanos Cubitus y Humerus en la frontera germana aburridos
        //Juegan a los dados y se determina quien gana.
        //Cada jugador tiene 2 dados de seis caras
        //Gana el jugador que sume más sus dos dados
        //Juegan 10 rondas
        //Quién gana más rondas?

        //V.E.: tiradaC1, tiradaC2, tiradaH1, tiradaH2
        //      sumaC, sumaH
        //      contRondasGC, contRondasGH


        //Paso1: hacer las cuatro tiradas
        //Paso2: hacer la suma de las tiradas de Cubitus, y la suma de las tiradas de Humerus
        //Paso3: ver cuál de las dos sumas es mayor y pintar quién gana
        //Paso4: meter lo anterior en un bucle para 10 rondas
        //Paso5: hacer un contador para Cubitus y otro para Humerus y cuando gane uno de ellos
        //      incrementar el contador correspondiente
        //Paso6: pintar el resultado final

        int tiradaC1 ,  tiradaC2 , tiradaH1 , tiradaH2;
        int sumaC , sumaH;
        int contadorRondasGC = 0 , contadorRondasGH = 0;

        for (int i = 1; i <= 10; i++) {
            tiradaC1 = (int) (Math.random() * 6) + 1;
            tiradaC2 = (int) (Math.random() * 6) + 1;
            sumaC = tiradaC1 + tiradaC2;
            System.out.println("El resultado de Cubitus " + sumaC );

            tiradaH1 = (int) (Math.random() * 6) + 1;
            tiradaH2 = (int) (Math.random() * 6) + 1;
            sumaH = tiradaH1 + tiradaH2;
            System.out.println("El resultado de Humerus " + sumaH );

            if (sumaC >sumaH) {
                System.out.println("Gana Cubitus");
                contadorRondasGC++;
            }

            if (sumaC < sumaH) {
                System.out.println("Gana Humerus");
                contadorRondasGH++;
            }

        }
        if  (contadorRondasGC < contadorRondasGH) {
            System.out.println("Gana Rondas Humerus");
        }
        else if (contadorRondasGC > contadorRondasGH) {
            System.out.println("Gana Rondas Cubitus");
        } else {
            System.out.println("Empate");
        }








    }
}
