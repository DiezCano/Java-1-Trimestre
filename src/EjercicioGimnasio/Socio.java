package EjercicioGimnasio;

import java.time.LocalDate;
import java.util.Comparator;

public class Socio implements Comparable<Socio> {

    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private LocalDate fechaAlta;
    private TipoCuota cuota;

    public Socio(String dni, String nombre, String apellidos, String email, String telefono, LocalDate fechaAlta, TipoCuota cuota) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
        this.cuota = cuota;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return dni;
    }

    public String getApellidos() {
        return dni;
    }

    @Override
    public int compareTo(Socio s) {
        int cmp = this.apellidos.compareTo(s.apellidos);
        if (cmp == 0) {
            return this.nombre.compareTo(s.nombre);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o) {
        Socio s = (Socio) o;
        return this.dni.equals(s.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}
