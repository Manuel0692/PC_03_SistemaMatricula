 
package sistemamatriculas;

public class Curso {

    private int codigo;
    private String nombre;
    private int creditos;

    public Curso(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    @Override
    public String toString() {
        return "Código: " + codigo
                + " | Curso: " + nombre
                + " | Créditos: " + creditos;
    }
}

