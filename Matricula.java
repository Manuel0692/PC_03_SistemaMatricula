 
package sistemamatriculas;

public class Matricula {

    private Estudiante estudiante;
    private Curso curso;
    private String observacion;

    public Matricula(Estudiante estudiante, Curso curso, String observacion) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.observacion = observacion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getObservacion() {
        return observacion;
    }

    @Override
    public String toString() {
        return "Estudiante: " + estudiante.getNombre()
                + " | Curso: " + curso.getNombre()
                + " | Observación: " + observacion;
    }
}
 
