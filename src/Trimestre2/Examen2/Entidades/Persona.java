package Trimestre2.Examen2.Entidades;

import java.util.Objects;
import java.util.UUID;

public abstract class Persona {

    protected String Id;
    protected String Nombre;
    protected String Apellidos;
    protected String dni;
    protected String Email;
    protected String telefono;

    public Persona(String id) {
        Id = UUID.randomUUID().toString();
    }

    public Persona(String nombre, String apellidos, String dni, String telefono, String email) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        Email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("Id='").append(Id).append('\'');
        sb.append(", Nombre='").append(Nombre).append('\'');
        sb.append(", Apellidos='").append(Apellidos).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", Email='").append(Email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

}
