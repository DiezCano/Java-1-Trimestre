package EjercicioGimnasio;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // 🔹 Crear gimnasio
        Gimnasio g = new Gimnasio();

        // 🔹 Crear socios
        Socio s1 = new Socio("111A", "Ana", "Lopez",
                LocalDate.of(2024,1,10), TipoCuota.BASICA);

        Socio s2 = new Socio("222B", "Luis", "Garcia",
                LocalDate.of(2024,2,5), TipoCuota.PREMIUM);

        Socio s3 = new Socio("333C", "Marta", "Perez",
                LocalDate.of(2024,3,1), TipoCuota.FAMILIAR);

        Socio s4 = new Socio("444D", "Carlos", "Ruiz",
                LocalDate.of(2024,1,20), TipoCuota.BASICA);

        Socio s5 = new Socio("555E", "Elena", "Sanchez",
                LocalDate.of(2024,2,15), TipoCuota.PREMIUM);

        Socio s6 = new Socio("666F", "Pablo", "Martinez",
                LocalDate.of(2024,3,10), TipoCuota.FAMILIAR);

        g.addSocio(s1);
        g.addSocio(s2);
        g.addSocio(s3);
        g.addSocio(s4);
        g.addSocio(s5);
        g.addSocio(s6);

        // 🔹 Crear actividades
        Actividad yoga = new Actividad("A1","Yoga",
                DiaSemana.LUNES, LocalTime.of(9,0),60,3);

        Actividad spinning = new Actividad("A2","Spinning",
                DiaSemana.MARTES, LocalTime.of(18,0),50,10);

        Actividad pilates = new Actividad("A3","Pilates",
                DiaSemana.MIERCOLES, LocalTime.of(10,0),45,2);

        Actividad crossfit = new Actividad("A4","CrossFit",
                DiaSemana.JUEVES, LocalTime.of(19,0),60,8);

        Actividad zumba = new Actividad("A5","Zumba",
                DiaSemana.VIERNES, LocalTime.of(17,30),45,15);

        Actividad natacion = new Actividad("A6","Natacion",
                DiaSemana.SABADO, LocalTime.of(10,0),60,6);

        Actividad boxeo = new Actividad("A7","Boxeo",
                DiaSemana.LUNES, LocalTime.of(20,0),60,3);

        Actividad meditacion = new Actividad("A8","Meditacion",
                DiaSemana.DOMINGO, LocalTime.of(11,0),40,12);

        g.addActividad(yoga);
        g.addActividad(spinning);
        g.addActividad(pilates);
        g.addActividad(crossfit);
        g.addActividad(zumba);
        g.addActividad(natacion);
        g.addActividad(boxeo);
        g.addActividad(meditacion);

        // 🔹 Reservas
        System.out.println("=== RESERVAS ===");

        g.reservarActividad("111A","A1");
        g.reservarActividad("222B","A1");
        g.reservarActividad("333C","A1");
        g.reservarActividad("444D","A1"); // AFORO COMPLETO

        g.reservarActividad("111A","A3");
        g.reservarActividad("222B","A3");
        g.reservarActividad("333C","A3"); // AFORO COMPLETO

        g.reservarActividad("111A","A2");
        g.reservarActividad("222B","A2");

        g.reservarActividad("111A","A1"); // DUPLICADO

        // 🔹 Cancelar reserva
        System.out.println("\n=== CANCELAR RESERVA ===");
        g.cancelarReserva("222B","A1");

        // 🔹 Actividades de un socio
        System.out.println("\n=== ACTIVIDADES DE ANA ===");
        System.out.println(g.getActividadesSocio("111A"));

        // 🔹 Actividades llenas
        System.out.println("\n=== ACTIVIDADES LLENAS ===");
        System.out.println(g.getActividadesLlenas());

        // 🔹 Ranking de socios
        System.out.println("\n=== RANKING SOCIOS ===");
        System.out.println(g.getRankingSocios());

        // 🔹 Reservas ordenadas por fecha
        System.out.println("\n=== RESERVAS ORDENADAS POR FECHA ===");
        System.out.println(g.getReservasOrdenadasPorFecha());


    }
}




