package Trimestre2.tema7Genericos;

public class app {
    static void main() {

        PilaNumerica<Integer> pilaNumerica = new PilaNumerica<>();
        pilaNumerica.apilar(4);
        pilaNumerica.apilar(5);
        pilaNumerica.apilar(6);
        pilaNumerica.pintar();
        pilaNumerica.desapilar();
        pilaNumerica.pintar();
        pilaNumerica.desapilar();
        pilaNumerica.pintar();



    }
}
