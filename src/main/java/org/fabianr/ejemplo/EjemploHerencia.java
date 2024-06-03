package org.fabianr.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Fabian";
        alumno.setApellido("Ruiz");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor de " + profesor.getAsignatura()
        + ": " + profesor.getNombre()
        + " " + profesor.getApellido());
    }
}
