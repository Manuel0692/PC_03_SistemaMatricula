
package sistemamatriculas;

public class Estudiante {

    private int codigo;
    private String nombre;
    private String carrera;

    public Estudiante(int codigo, String nombre, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Código: " + codigo
                + " | Nombre: " + nombre
                + " | Carrera: " + carrera;
    }
}

