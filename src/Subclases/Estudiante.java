package Subclases;

import Superclases.Persona;

public class Estudiante extends Persona {

    // Metodo constructor sin parametros
    public Estudiante() {}

    // Metodo constructor con parametros
    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }

    // Metodo para mostrar informacion
    @Override
    public void mostrarInformacion() {
        System.out.println("\n--- Información Estudiante Inscrito ---");
        super.mostrarInformacion();
    }
}
