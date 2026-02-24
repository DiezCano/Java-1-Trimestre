package Trimestre2.tema7Genericos;

import java.util.ArrayList;

public class PilaNumerica<T extends Number> {

    private ArrayList<T> lista = new ArrayList<>();

    // Añade un elemento al final
    public void apilar(T elemento) {
        lista.addLast(elemento);
    }

    // Devuelve y elimina el último elemento
    public T desapilar() {
        if (lista.isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return lista.remove(lista.size() - 1);
    }

    // Suma todos los elementos (como Double)
    public Double suma() {
        double total = 0.0;
        for (T elemento : lista) {
            total += elemento.doubleValue();
        }
        return total;
    }

    // Imprime los elementos
    public void pintar() {
        System.out.println(lista);
    }
}




