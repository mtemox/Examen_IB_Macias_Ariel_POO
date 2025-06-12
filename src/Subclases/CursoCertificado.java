package Subclases;

import Clases.Evaluacion;

public class CursoCertificado extends CursoRegular{

    // Atributos propios de la clase
    private Evaluacion evaluacion;

    // Constructor sin parametros
    public CursoCertificado() {}

    // Constructor con parametros
    public CursoCertificado(Docente docente, String nombreCurso, int duracionCurso, double precioBase, boolean evaluacionFinal, boolean certificadoValido, Evaluacion evaluacion) {
        super(docente, nombreCurso, duracionCurso, precioBase, evaluacionFinal, certificadoValido);
        this.evaluacion = evaluacion;
    }

    // Metodos set y get para los atributos
    // Metodos set y get para evaluacion
    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }
    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    // Sobreescritura de metodos
    // Sobreescritura de mostrar informacion
    @Override
    public void mostrarInformacion() {
        System.out.println("\n--- Curso Certificado ---");
        System.out.println("Curso: " + getNombreCurso());
        System.out.println("¿Contiene certificado?" + (isCertificadoValido() ? "Si" : "No"));
        System.out.println("Duración del curso: "+ getDuracionCurso());
        System.out.println("Precio base: " + getPrecioBase());
        System.out.println("Docente a cargo: " + getDocente().getNombre());
        System.out.println("¿Evaluación Continua?: " + (isEvaluacionContinua() ? "Si" : "No"));
        System.out.println("¿Evaluación Final?: " + (isEvaluacionFinal() ? "Si" : "No"));
        System.out.println("Precio Total: " + calcularCosto());

        System.out.println("--- Evaluacion Final ---");
        evaluacion.imprimirEvaluacion();
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
