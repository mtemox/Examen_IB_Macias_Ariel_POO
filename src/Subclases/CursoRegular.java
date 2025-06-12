package Subclases;

import Superclases.*;

public class CursoRegular extends Curso {

    // Atributos propios de la clase
    private boolean evaluacionContinua = true;
    private boolean evaluacionFinal;
    private boolean certificadoValido;

    // Metodo constructor sin parametros
    public CursoRegular() {}

    // Metodo constructor con parametros
    public CursoRegular(Docente docente, String nombreCurso, int duracionCurso, double precioBase, boolean evaluacionFinal, boolean certificadoValido) {
        super(docente, nombreCurso, duracionCurso, precioBase);
        this.evaluacionFinal = evaluacionFinal;
        this.certificadoValido = certificadoValido;
    }

    // Metodos set y get para los atributos
    // Metodos set y get para evaluacionContinua
    public void setEvaluacionContinua(boolean evaluacionContinua) {
        this.evaluacionContinua = evaluacionContinua;
    }
    public boolean isEvaluacionContinua() {
        return evaluacionContinua;
    }

    // Metodos set y get para evaluacionContinua
    public void setEvaluacionFinal(boolean evaluacionFinal) {
        this.evaluacionFinal = evaluacionFinal;
    }
    public boolean isEvaluacionFinal() {
        return evaluacionFinal;
    }

    // Metodos set y get para certificadoValido
    public void setCertificadoValido(boolean certificadoValido) {
        this.certificadoValido = certificadoValido;
    }
    public boolean isCertificadoValido() {
        return certificadoValido;
    }

    // Sobreescritura de metodos

    // Sobreescritura de mostrar informacion
    @Override
    public void mostrarInformacion() {
        System.out.println("\n--- Curso Regular ---");
        System.out.println("Curso: " + getNombreCurso());
        System.out.println("¿Contiene certificado?" + (isCertificadoValido() ? "Si" : "No"));
        System.out.println("Duración del curso: "+ getDuracionCurso());
        System.out.println("Precio base: " + getPrecioBase());
        System.out.println("Docente a cargo: " + getDocente().getNombre());
        System.out.println("¿Evaluación Continua?: " + (isEvaluacionContinua() ? "Si" : "No"));
        System.out.println("¿Evaluación Final?: " + (isEvaluacionFinal() ? "Si" : "No"));
        System.out.println("Precio Total: " + calcularCosto());
    }

    // Sobreescritura de calcular costo
    @Override
    public double calcularCosto() {
        double costo = super.calcularCosto();

        if (isCertificadoValido()) {
            costo *= 1.25;
        }

        return costo;
    }
}
