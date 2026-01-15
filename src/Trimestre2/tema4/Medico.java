package Trimestre2.tema4;

public class Medico {

    /**
     * Crear clase Medico
     * Propiedades:
     * - nombre
     * - especialidad (enum Especialidad ->
     *     GENERAL, DIGESTIVO, OTORRINO, CARDIOLOGIA, NEUROLOGIA, TRAUMATOLOGIA)
     * - edad
     * - email
     * - telefono
     * - estado (enum Estado -> ACTIVO, INACTIVO)
     *
     * Constructor con todo menos 'estado'. El estado por defecto es ACTIVO.
     * Getters de todo
     * Setters de todo menos 'estado'
     * ToString
     * Metodos propios:
     * - baja() -> pone el estado en INACTIVO
     * - alta() -> pone el estado en ACTIVO
     *
     * En un main crea dos médicos, pon uno de baja y pinta los dos
     */

    //Propiedades o atributos
    private String nombre;
    private int edad;
    private int telefono;
    private String email;
    private Especialidades Especialidades;

    //Constructor

    public Medico(String nombre, Especialidades especialidades, String email, int telefono, int edad) {
        this.nombre = nombre;
        Especialidades = especialidades;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
    }


    //Getters

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Especialidades getEspecialidades() {
        return Especialidades;
    }

    //Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEspecialidades(Especialidades especialidades) {
        Especialidades = especialidades;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Medico{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", telefono=").append(telefono);
        sb.append(", email='").append(email).append('\'');
        sb.append(", Especialidades=").append(Especialidades);
        sb.append('}');
        return sb.toString();
    }

   public static void main(String[] args) {
       System.out.println();
   }
}
