package Superclases;

import Subclases.Docente;

public class Curso {

    // Atributos propios de la clase
    private Docente docente;
    private String nombreCurso;
    private int duracionCurso;
    private double precioBase;

    // Metodo constructor sin parametros
    public Curso() {}

    // Metodo constructor con parametros

    public Curso(Docente docente, String nombreCurso, int duracionCurso, double precioBase) {
        this.docente = docente;
        this.nombreCurso = nombreCurso;
        this.duracionCurso = duracionCurso;
        this.precioBase = precioBase;
    }

    // Metodos set y get para los atributos
    // Metodo set y get para docente
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public Docente getDocente() {
        return docente;
    }


    // Metodo set y get para nombreCurso
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }

    // Metodo set y get para duracionCurso
    public void setDuracionCurso(int duracionCurso) {
        this.duracionCurso = duracionCurso;
    }
    public int getDuracionCurso() {
        return duracionCurso;
    }

    // Metodo set y get para precioBase
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public double getPrecioBase() {
        return precioBase;
    }



    // Metodos que sobreescribiran las subclases
    // Metodo para calcular el costo
    public double calcularCosto() {
        return getPrecioBase();
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Curso: " + getNombreCurso());
        System.out.println("Duración del curso: "+ getDuracionCurso());
        System.out.println("Precio base: " + getPrecioBase());
        System.out.println("Docente a cargo: " + getDocente().getNombre());
    }

}
