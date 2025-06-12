package Superclases;

public class Persona {

    // Atributos de la propia clase
    private String nombre;
    private int edad;

    // Metodo constructor sin parametros
    public Persona () {}

    // Metodo constructor con parametros
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos set y get de los parametros
    // Metodos set y get para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    // Metodos set y get para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
