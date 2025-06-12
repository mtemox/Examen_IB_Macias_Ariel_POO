package Subclases;

import Superclases.Persona;

public class Docente extends Persona {

    // Atributos propios de la clase
    private String titulo;

    // Constructor sin parametros
    public Docente() {}

    // Constructor con parametros
    public Docente(String nombre, int edad, String titulo) {
        super(nombre, edad);
        this.titulo = titulo;
    }

    // Metodo para mostrar informacion
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Título: " + titulo);
    }
}
