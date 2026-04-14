package EjercicioGimnasio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Gimnasio g = new Gimnasio();

        Socio s1 = new Socio("123A","Alberto","Garcia","albert@gmail.com",
                "677536512",LocalDate.of(2020,4,2),TipoCuota.FAMILIAR);
        Socio s2 = new Socio("124A","Juan","Rodriguez","Jurodr@gmail.com",
                "677536523",LocalDate.of(2023,7,8),TipoCuota.BASICA);
        Socio s3 = new Socio("125A","Felix","Rodriguez","felixrdro@gmail.com",
                "677536364",LocalDate.of(2026,1,1),TipoCuota.PREMIUM);

        g.addSocio(s1);
        g.addSocio(s2);
        g.addSocio(s3);

       Actividad yoga = new Actividad("123","yoga","Esto es para relajar","Alejandro",DiaSemana.LUNES,60,
               LocalTime.of(15,30),20);
        Actividad spinning = new Actividad("124","spinning","Para mejorar resistencia","Fran",DiaSemana.LUNES,40,
                LocalTime.of(17,45),10);
        Actividad pilates = new Actividad("125","pilates","Esto ns para que es","Juan Alberto",DiaSemana.MIERCOLES,90,
                LocalTime.of(16,15),20);
        Actividad boxeo = new Actividad("126","boxeo","Esto es pegar puños","Felix",DiaSemana.SABADO,90,
                LocalTime.of(17, 0),15);

        g.addActividad(yoga);
        g.addActividad(spinning);
        g.addActividad(pilates);
        g.addActividad(boxeo);

        System.out.println("=== RESERVAS ===");

        g.reservarActividad("123A","123");
        g.reservarActividad("124A","123");

        g.reservarActividad("123A","126");
        g.reservarActividad("124A","126");
        g.reservarActividad("125A","126"); // AFORO COMPLETO

        System.out.println("\n=== CANCELAR RESERVA ===");
        g.cancelarReserva("222B","A1");

        System.out.println("\n=== ACTIVIDADES DE Alberto ===");
        System.out.println(g.getActividadesSocio("123A"));

        System.out.println("\n=== ACTIVIDADES LLENAS ===");
        System.out.println(g.getActividadesLlenas());

        System.out.println("\n=== RANKING SOCIOS ===");
        System.out.println(g.getRankingSocios());



    }
}




