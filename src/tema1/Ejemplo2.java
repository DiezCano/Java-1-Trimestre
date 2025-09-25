package tema1;

public class Ejemplo2 {
    public static void main(String[] args) {

        //Declara una variable de tipo double llamada precio
        //asignale el valor 99.99
        //Pinta por pantalla el precio
        //Pinta por pantalla el precio con el IVA (21%)

        String nombre = "precio";
        nombre = ("Precio");
        System.out.println(nombre);

        double precio = 99.99;
        System.out.println(precio);
        double iva = 0.21;

        System.out.println("El iva es = " + (precio * 0.21));
        System.out.println("El precio + iva es = " + (precio + iva));

        System.out.println();

    }
}
