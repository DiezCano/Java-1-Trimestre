package tema1;

public class EjerciciosClaseJesus6 {
    public static void main(String[] args) {

        double x1,x2,x3,x4;
        double distancia;

        x1=45.66;
        x2=69.46;
        x3=67.16;
        x4=12.23;

        distancia =Math.sqrt (Math.pow ((x2-x1),2) + Math.pow ((x2-x2),2) + Math.pow ((x4-x3),2));
        System.out.println("Distancia: " + distancia);


    }
}
