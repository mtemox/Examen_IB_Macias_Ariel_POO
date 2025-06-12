package Clases;

public class Evaluacion {

    // Atributos de la clase
    private double calificacion;
    private String fecha;

    // Metodo constructor sin parametros
    public Evaluacion() {}

    // Metodo constructor con parametros
    public Evaluacion(double calificacion, String fecha) {
        this.calificacion = calificacion;
        this.fecha = fecha;
    }

    // Metodo set y get para los atributos
    // Metodo set y get para calificacion
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public double getCalificacion() {
        return calificacion;
    }

    // Metodo set y get para fecha
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }

    // Metodo para mostrar informacion de la evaluacion
    public void imprimirEvaluacion() {
        System.out.println("Calificación: " + calificacion);
        System.out.println("Fecha: " + fecha);
    }
}
