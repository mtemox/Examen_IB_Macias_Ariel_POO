package Clases;

import Subclases.CursoCertificado;
import Subclases.CursoRegular;
import Subclases.Estudiante;

public class Matricula {

    // Atributos propios de la clase
    private Estudiante estudiante;
    private CursoRegular cursoRegular;
    private CursoCertificado cursoCertificado;

    // Metodo constructor sin parametros
    public Matricula() {}

    // Metodo constructo con parametros
    // Metodo constructo con parametros para Curso Regular
    public Matricula(Estudiante estudiante, CursoRegular cursoRegular) {
        this.estudiante = estudiante;
        this.cursoRegular = cursoRegular;
    }

    // Metodo constructo con parametros para Curso Certificado
    public Matricula(Estudiante estudiante, CursoCertificado cursoCertificado) {
        this.estudiante = estudiante;
        this.cursoCertificado = cursoCertificado;
    }

    // Metodos set y get para los atributos
    // Metodos set y get para estudiante
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }

    // Metodos set y get para cursoRegular
    public void setCursoRegular(CursoRegular cursoRegular) {
        this.cursoRegular = cursoRegular;
    }
    public CursoRegular getCursoRegular() {
        return cursoRegular;
    }

    // Metodos set y get para cursoCertificado
    public void setCursoCertificado(CursoCertificado cursoCertificado) {
        this.cursoCertificado = cursoCertificado;
    }
    public CursoCertificado getCursoCertificado() {
        return cursoCertificado;
    }

    // Metodo para imprimir la matricula regular
    public void imprimirMatriculaRegular() {
        System.out.println("\n#### INFORMACIÓN DE LA MATRÍCULA ####");

        if ((estudiante.getEdad() >= 13) && (estudiante.getEdad()<=60) ) {
            estudiante.mostrarInformacion();
        } else {
            System.out.println("\nEL ESTUDIANTE NO CUMPLE CON LA EDAD REQUERIDA");
        }

        cursoRegular.mostrarInformacion();
    }

    // Metodo para imprimir la matricula vertificado
    public void imprimirMatriculaCertificado() {
        System.out.println("\n#### INFORMACIÓN DE LA MATRÍCULA ####");

        if ((estudiante.getEdad() >= 13) && (estudiante.getEdad()<=60) ) {
            estudiante.mostrarInformacion();

            System.out.println("\nEL ESTUDIANTE NO CUMPLE CON LA EDAD REQUERIDA");

            cursoCertificado.mostrarInformacionSinEvaluacion();

        } else {

            cursoCertificado.mostrarInformacion();
            ;
        }
    }
}



