
package clases;

/**
 *
 * @author C20177
 */
public class Persona {
    //private int codigo;
    private String dni;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + dni + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
