// Estudiante: Ariel Macias
package Main;

import Clases.Evaluacion;
import Clases.Matricula;
import Subclases.CursoCertificado;
import Subclases.CursoRegular;
import Subclases.Docente;
import Subclases.Estudiante;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Creo los objetos Evaluacion
        Evaluacion e1 = new Evaluacion(9,"2025-04-03");
        Evaluacion e2 = new Evaluacion(10,"2025-06-03");
        Evaluacion e3 = new Evaluacion(7,"2025-02-10");

        // Creo los objetos Docentes
        Docente d1 = new Docente("Mauro", 35, "Ingeniero en Sistemas");
        Docente d2 = new Docente("Eduardo", 40, "Ingeniero en Software");
        Docente d3 = new Docente("Juan", 50, "Arquitecto");
        Docente d4 = new Docente("Juan", 55, "Ingeniero Civil");

        // Creo los objetos Estudiantes
        Estudiante es1 = new Estudiante("Ariel", 19);
        Estudiante es2 = new Estudiante("Juan", 19);
        Estudiante es3 = new Estudiante("Ardanny", 19);
        Estudiante es4 = new Estudiante("Brandon", 19);

        // Creo los objetos Curso Regular
        CursoRegular cr1 = new CursoRegular(d1, "Programacion desde cero", 35, 35.00, false, false);
        CursoRegular cr2 = new CursoRegular(d2, "Programa con la IA", 40, 55.00, false, false);
        CursoRegular cr3 = new CursoRegular(d3, "Arquitecturas Historicas", 40, 75.00, false, false);

        // Creo los objetos Curso Certificado
        CursoCertificado cf1 = new CursoCertificado(d4, "Programacion Avanzada", 35, 35.00,true, true, e1);
        CursoCertificado cf2 = new CursoCertificado(d2, "POO", 35, 35.00,true, true, e1);
        CursoCertificado cf3 = new CursoCertificado(d1, "Bases de Datos", 35, 70.00,true, true, e1);

        // Creacion de los 5 objetos mediante setters
        // Objeto 1 -  Curso Regular
        Matricula m1 = new Matricula();
        m1.setEstudiante(es1);
        m1.setCursoRegular(cr1);
        m1.imprimirMatriculaRegular();

        // Objeto 2 -  Curso Certificado
        Matricula m2 = new Matricula();
        m2.setEstudiante(es2);
        m2.setCursoCertificado(cf1);
        m2.imprimirMatriculaCertificado();

        // Objeto 3 -  Curso Regular
        Matricula m3 = new Matricula();
        m3.setEstudiante(es3);
        m3.setCursoRegular(cr3);
        m3.imprimirMatriculaRegular();

        // Objeto 4 -  Curso Certificado
        Matricula m4 = new Matricula();
        m4.setEstudiante(es1);
        m4.setCursoCertificado(cf2);
        m4.imprimirMatriculaCertificado();

        // Objeto 5 -  Curso Certificado
        Matricula m5 = new Matricula();
        m5.setEstudiante(es4);
        m5.setCursoCertificado(cf3);
        m5.imprimirMatriculaCertificado();

        // Creacion de los 5 objetos mediante setters


    }
}