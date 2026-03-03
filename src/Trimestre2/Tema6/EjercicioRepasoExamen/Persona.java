package Trimestre2.Tema6.EjercicioRepasoExamen;

import java.util.UUID;

public  abstract class Persona {

    protected String ID;
    protected String Nombre;
    protected String Apellido;
    protected String Email;

    public Persona(String ID) {
        this.ID = UUID.randomUUID().toString();
    }

    public Persona(String apellido, String nombre, String email) {
        Apellido = apellido;
        Nombre = nombre;
        Email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("ID='").append(ID).append('\'');
        sb.append(", Nombre='").append(Nombre).append('\'');
        sb.append(", Apellido='").append(Apellido).append('\'');
        sb.append(", Email='").append(Email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Email != null && Email.equals(persona.Email);
    }

    @Override
    public int hashCode() {
        return Email != null ? Email.hashCode() : 0;
    }


}
