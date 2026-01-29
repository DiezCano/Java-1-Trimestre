package Trimestre2.EjercicioModeloExamen.aplicacion;

import Trimestre2.EjercicioModeloExamen.modelos.PrioridadTarea;
import Trimestre2.EjercicioModeloExamen.modelos.TareaProgramada;
import Trimestre2.EjercicioModeloExamen.modelos.TareaUrgente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Aplicacion {
    static void main() {
        TareaUrgente tu1 = new TareaUrgente("Programar Java",
                "Ponernos a hacer ejercicios del tema 4 y 5",
                45);

        tu1.ejecutar();
        IO.println(tu1.getTipo());
        tu1.mostrarDetalle();

        TareaProgramada tp1 = new TareaProgramada ("ExamenAna","ExamenComplicado",
                PrioridadTarea.ALTA, LocalDate.of(2026,3,4), LocalTime.of(12,30));

    }

}
