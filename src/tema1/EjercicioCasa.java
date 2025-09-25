package tema1;

public class EjercicioCasa {
    public static void main(String[] args) {
        //Me dicen la distancia a la Tierra de la estrella Próxima Centauri, 4.24 años luz
        //Tengo que mostrar la distancia en km y el tiempo en segundos que tardaría
        //una nave que pudiera viajar a una velocidad cercana a la velocidad de
        //la luz -> 298.000 km/s

        //Pista1 -> distancia en km , es pasar 4.24 años luz a kilometros
        //Pista2 -> tiempo en segundos , una vez se los km, y la velocidad a la que voy
        //pues despejar los segundos
        //Pista3 -> velocidad de la luz 299.900 km/s
        double velocidadluz = 299900;
        double velocidadNave = 298000;
        double segundosporAnio = 365 * 24 * 60 * 60;
        double distanciaAnosluz = 4.24;

        //1 año luz
        double anioluzkm = (velocidadluz * segundosporAnio);

        //Distancia total en km
        double distanciaKM = ((segundosporAnio * 4.24) * velocidadluz);

        //Tiempo en segundos que tardaria la nave
        double tiemposegundos = (distanciaAnosluz * segundosporAnio);

        //Resultados
        System.out.println("Distancia a Proximada Centauri = " + distanciaKM + "km");
        System.out.println("Tiempo de viaje de la Nave = " + tiemposegundos + " segundos ");

    }
}
