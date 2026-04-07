package Trimestre3.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashMap {

    static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();

        diccionario.put("Dog","Perro");
        diccionario.put("Pencil","Lapiz");
        diccionario.put("Water","Agua");

        IO.println(diccionario);

        //Eliminar por clave
        diccionario.remove("Dog");
        IO.println(diccionario);

        //Obtener por clave
        IO.println(diccionario.get("Water"));

        //Preguntar si existe una clave
        IO.println(diccionario.containsKey("Pencil"));
        IO.println(diccionario.containsKey("Water"));

        //Recorrer el mapa con for -> map.keySet() nos devuelve un Set con las claves
        //Para cada clave sacamos su valor con diccionario.get(clave)
        IO.println("--- Claves ---");
        for(String clave : diccionario.keySet()) {
            IO.println(clave + " -> " + diccionario.get(clave));
        }

        //Mostrar todos los valores
        IO.println("--- Valores ---");
        for (String valor : diccionario.values()) {
            IO.println(valor);
        }

        //Mostrar los pares clave-valor como Entry<Clave, Valor>
        IO.println("--- Entries ---");
        for (Map.Entry<String,String> entrada : diccionario.entrySet()) {
            IO.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        //Pintar el diccionario ordenado por claves
        IO.println("--- Ordenado por claves ---");
        Set<String> clavesOrdenadas = new TreeSet<>(diccionario.keySet());
        for (String clave : clavesOrdenadas) {
            IO.println(clave + " -> " + diccionario.get(clave));
        }

    }
}
