import java.util.ArrayList;
import java.util.List;

public class ListaEstudiante {
    // Declaración de la lista de estudiantes
    private List<Estudiante> estudiantes;

    // Constructor que inicializa la lista con valores predeterminados
    public ListaEstudiante() {
        estudiantes = new ArrayList<>(); // Inicialización de la lista

        // Añadiendo estudiantes a la lista
        estudiantes.add(new Estudiante("Juan", 20, 101L, 4.5));
        estudiantes.add(new Estudiante("María", 22, 102L, 4.1));
        estudiantes.add(new Estudiante("Carlos", 21, 103L, 3.8));
        estudiantes.add(new Estudiante("Rosa", 23, 101L, 4.5));
        estudiantes.add(new Estudiante("Luisa", 24, 102L, 4.1));
        estudiantes.add(new Estudiante("Camila", 21, 103L, 3.8));
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
