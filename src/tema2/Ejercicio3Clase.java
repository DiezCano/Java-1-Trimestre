package tema2;

public class Ejercicio3Clase {
    public static void main(String[] args) {

        //Determinar si eres elegible para que te den un credito
        //1. Tienes mas de 5 años de antiguedad en el banco e ingresos mensuales de
        // mas de  2500$
        //2. Tienes una antiguedad entre 2 y 5 años , ingresos de mas de 2000$ mensuales
        // y no tienes deudas pendientes
        //3. Tienes menos de 2 años de antiguedad, un ingreso de mas de 3000$ mensuales
        //no tienes deudas pendientes

        //V.E: antiguedad, ingresosMensuales, deudadPendientes
        //V.S: decir si eres elegible para que te den un credito o no

            int antiguedad = 5;
            int IngresosMensuales = 2500;
            boolean DeudasPendientes = false;

            if (antiguedad >= 5 && IngresosMensuales >= 2500) {
                System.out.println("Puedes obtener el credito");
            } else if (antiguedad >= 2) antiguedad <= 5 && IngresosMensuales >= 2500 && DeudasPendientes {
                System.out.println("Obtienes el credito");
            } else if ((antiguedad >2 && IngresosMensuales > 3000) && DeudasPendientes) {


    }
}
