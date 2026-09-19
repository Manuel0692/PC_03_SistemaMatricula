 
package sistemamatriculas;

import java.util.ArrayList;

public class GestorMatriculas {

    private ArrayList<Matricula> matriculas;

    public GestorMatriculas() {
        matriculas = new ArrayList<>();
    }

    // Sobrecarga 1
    public void inscribir(Estudiante estudiante, Curso curso)
            throws MatriculaException {

        validarDatos(estudiante, curso);

        Matricula matricula = new Matricula(
                estudiante,
                curso,
                "Matrícula regular"
        );

        matriculas.add(matricula);

        System.out.println("Matrícula registrada correctamente.");
    }

    // Sobrecarga 2
    public void inscribir(Estudiante estudiante, Curso curso,
            String observacion) throws MatriculaException {

        validarDatos(estudiante, curso);

        Matricula matricula = new Matricula(
                estudiante,
                curso,
                observacion
        );

        matriculas.add(matricula);

        System.out.println("Matrícula registrada correctamente.");
    }

    private void validarDatos(Estudiante estudiante, Curso curso)
            throws MatriculaException {

        if (estudiante == null) {
            throw new MatriculaException(
                    "El estudiante no puede ser nulo."
            );
        }

        if (curso == null) {
            throw new MatriculaException(
                    "El curso no puede ser nulo."
            );
        }
    }

    public void mostrarMatriculas() {

        System.out.println("\n===== LISTA DE MATRÍCULAS =====");

        if (matriculas.isEmpty()) {
            System.out.println("No existen matrículas registradas.");
            return;
        }

        for (Matricula matricula : matriculas) {
            System.out.println(matricula);
        }
    }

    public int cantidadMatriculas() {
        return matriculas.size();
    }
}
 
