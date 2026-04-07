package EjercicioEfootball;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AnalizadorPartidas {

    List<Partida> lista;

    public AnalizadorPartidas() {
        lista = new ArrayList<>();
        cargarDatos();
    }

    public void cargarDatos() {

        // 10 partidos diferentes en el orden exacto
        lista.add(new Partida(1,"Juan_Lopez","CPU_Madrid","PvP","FC_Barcelona","25",
                LocalDateTime.of(2026,4,1,19,30),5, 1,4));

        lista.add(new Partida(2,"Maria_Garcia","Rafael_Torres","Evento","Real_Madrid","20min",
                LocalDateTime.of(2026,4,2,21,15),85,2,2));

        lista.add(new Partida(3,"Carlos_Martin","Equipo_IA","Liga","Atletico_Madrid","12min",
                LocalDateTime.of(2026,4,3,18,45),150,1,0));

        lista.add(new Partida(4,"Juan_Lopez","PSG","PvP","FC_Barcelona","30min",
                LocalDateTime.of(2026,3,15,20,0),180,4,2));

        lista.add(new Partida(5,"Maria_Garcia","Bayern","Evento","Real_Madrid","20min",
                LocalDateTime.of(2026,3,16,19,0),40,0,3));

        lista.add(new Partida(6,"Carlos_Martin","Chelsea","Liga","Atletico_Madrid","12min",
                LocalDateTime.of(2026,3,17,18,0),130,2,1));

        lista.add(new Partida(7,"Juan_Lopez","Liverpool","PvP","FC_Barcelona","30min",
                LocalDateTime.of(2026,3,18,21,0),60,1,2));

        lista.add(new Partida(8,"Maria_Garcia","Juventus","Evento","Real_Madrid","20min",
                LocalDateTime.of(2026,3,20,20,0),95,2,0));

        lista.add(new Partida(9,"Carlos_Martin","Dortmund","Liga","Atletico_Madrid","12min",
                LocalDateTime.of(2026,4,5,18,45),110,3,1));

        lista.add(new Partida(10,"Juan_Lopez","Milan","PvP","FC_Barcelona","30min",
                LocalDateTime.of(2026,4,6,22,0),50,0,2));
    }

    // Consulta 1: Victorias del jugador
    //Mostrar todas las partidas ganadas (golesLocal > golesVisitante).


}

