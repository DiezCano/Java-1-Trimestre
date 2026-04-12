package EjercicioGimnasio;

import java.time.LocalDate;
import java.util.*;

public class Gimnasio {

    private HashMap<String, Socio> socios = new HashMap<>();
    private HashMap<String, Actividad> actividades = new HashMap<>();
    private TreeMap<Socio, HashSet<Reserva>> reservas = new TreeMap<>();

    public void addSocio(Socio s) {
        socios.put(s.getDni(), s);
        reservas.put(s, new HashSet<Reserva>());
    }

    public void addActividad(Actividad a) {
        actividades.put(a.getCodigo(), a);
    }

    // RESERVAR
    public void reservarActividad(String dni, String cod) {

        Socio s = socios.get(dni);
        Actividad a = actividades.get(cod);

        if (s == null || a == null) return;

        int contador = 0;

        for (HashSet<Reserva> conjunto : reservas.values()) {
            for (Reserva r : conjunto) {
                if (r.getActividad().equals(a) && r.estaActiva()) {
                    contador++;
                }
            }
        }

        if (contador >= a.getAforoMaximo()) {
            System.out.println("Aforo completo");
            return;
        }

        Reserva nueva = new Reserva(s, a, LocalDate.now());

        if (!reservas.get(s).add(nueva)) {
            System.out.println("Ya reservada");
        }
    }

    // CANCELAR
    public void cancelarReserva(String dni, String cod) {

        Socio s = socios.get(dni);
        Actividad a = actividades.get(cod);

        if (s == null || a == null) return;

        Iterator<Reserva> it = reservas.get(s).iterator();

        while (it.hasNext()) {
            Reserva r = it.next();
            if (r.getActividad().equals(a) && r.estaActiva()) {
                it.remove();
            }
        }
    }

    // ACTIVIDADES DE UN SOCIO
    public TreeSet<Actividad> getActividadesSocio(String dni) {

        TreeSet<Actividad> lista = new TreeSet<>();

        Socio s = socios.get(dni);

        for (Reserva r : reservas.get(s)) {
            lista.add(r.getActividad());
        }

        return lista;
    }

    // ACTIVIDADES LLENAS
    public List<Actividad> getActividadesLlenas() {

        List<Actividad> lista = new ArrayList<>();

        for (Actividad a : actividades.values()) {

            int contador = 0;

            for (HashSet<Reserva> conjunto : reservas.values()) {
                for (Reserva r : conjunto) {
                    if (r.getActividad().equals(a) && r.estaActiva()) {
                        contador++;
                    }
                }
            }

            if (contador >= a.getAforoMaximo()) {
                lista.add(a);
            }
        }

        return lista;
    }

    // RANKING
    public List<Socio> getRankingSocios() {

        List<Map.Entry<Socio, HashSet<Reserva>>> lista =
                new ArrayList<>(reservas.entrySet());

        lista.sort((e1, e2) ->
                e2.getValue().size() - e1.getValue().size());

        List<Socio> resultado = new ArrayList<>();

        for (Map.Entry<Socio, HashSet<Reserva>> e : lista) {
            resultado.add(e.getKey());
        }

        return resultado;
    }
}
