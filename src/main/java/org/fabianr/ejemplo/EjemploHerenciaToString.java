package org.fabianr.ejemplo;

import org.fabianr.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {


        System.out.println("========= Creando la instancia de la clase Alumno =========");
        Alumno alumno = new Alumno("Fabian", "Ruiz", 14, "IES de Sar");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("fru@fru.com");

        System.out.println("========= Creando la instancia de la clase AlumnoInternacional =========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("IES de Sar");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("pgo@pgo.com");

        System.out.println("========= Creando la instancia de la clase Profesor =========");
        Profesor profesor = new Profesor("Luci", "Pérez", "Matemáticas");
        profesor.setEdad(33);
        profesor.setEmail("lupe@lupe.com");


        System.out.println("======= - =======");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo los datos del tipo Persona");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("nota matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("nota castellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("país: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("=============== sobre escritura promedio =================");
            System.out.println("promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("=============== sobre escritura promedio =================");
        }
        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("=============== sobre escritura saludar =================");
        System.out.println(persona.saludar());
        System.out.println("================================");
    }
}
