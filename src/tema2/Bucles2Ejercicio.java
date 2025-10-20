package tema2;

public class Bucles2Ejercicio {
    public static void main(String[] args) {

        //Numero elevado a otro numero , sin usar Math.pow

        //variables de entrada: base , exponente
        //variables de salida: resultado

        int base = 2, exponente = 3; //2 elevado a 3
        int resultado = 1; //El acumulador se inicia a 1 por que se multiplica

        for (int i=1; i <= exponente; i++) {
            resultado = resultado * base;

        }
        System.out.println("Resultado: " + resultado);
    }
}
