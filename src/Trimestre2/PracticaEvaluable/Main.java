package Trimestre2.PracticaEvaluable;

import java.util.Scanner;

public class Main  {
    static void main(String[] args) {


        Jugador jd1 = new Tanque(310, "FrenilloLokillo", 374197, 200, 320);
        Jugador jd2 = new Asesino(378, "LokoLokillo", 374198, 60, 15);
        Jugador jd3 = new Apoyo(324, "ManoRampa", 374199, 170, 56);

        System.out.println(jd1);
        System.out.println("-----------------------------------------");
        System.out.println(jd2);
        System.out.println("-----------------------------------------");
        System.out.println(jd3);
        System.out.println("-----------------------------------------");
    }
}
