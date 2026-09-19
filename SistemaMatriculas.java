 
package sistemamatriculas;

public class SistemaMatriculas {

    public static void main(String[] args) {

        GestorMatriculas gestor = new GestorMatriculas();

        Estudiante estudiante1 = new Estudiante(
                1001,
                "Carlos Perez",
                "Ingeniería de Sistemas"
        );

        Estudiante estudiante2 = new Estudiante(
                1002,
                "Maria Lopez",
                "Ingeniería de Sistemas"
        );

        Curso curso1 = new Curso(
                101,
                "Programación Orientada a Objetos",
                4
        );

        Curso curso2 = new Curso(
                102,
                "Base de Datos",
                3
        );

        System.out.println("===== SISTEMA DE MATRÍCULAS =====");

        try {

            // Uso de la primera versión de inscribir()
            gestor.inscribir(estudiante1, curso1);

            // Uso de la segunda versión de inscribir()
            gestor.inscribir(
                    estudiante2,
                    curso2,
                    "Matrícula realizada con observación especial"
            );

            // Provocamos un error para demostrar la excepción
            gestor.inscribir(null, curso1);

        } catch (MatriculaException e) {

            System.out.println(
                    "Error de matrícula: " + e.getMessage()
            );

        } finally {

            System.out.println(
                    "\nProceso de matrícula finalizado."
            );
        }

        gestor.mostrarMatriculas();

        System.out.println(
                "\nCantidad de matrículas: "
                + gestor.cantidadMatriculas()
        );
    }
}
 
