package Trimestre2.tema7Genericos.Ejercicios.EjercicioRankeds;

public class Main {
    static void main() {

        Ranking ranking = new Ranking();
        ranking.registrar(new Jugador("12","Felix",51));
        ranking.registrar(new Jugador("2", "Ibai", 49));
        ranking.registrar(new Jugador("3", "YO", 21));
        ranking.registrar(new Jugador("3", "YO", 50));

        ranking.pintarJugadores();
        ranking.modificarPuntuacion(1, 100);
        ranking.modificarPuntuacion(2, 200);
        ranking.modificarPuntuacion(3, 200);

        ranking.pintarRanking();

        ranking.eliminarJugador(2);

        ranking.pintarRanking();
        ranking.pintarJugadores();

    }
}
