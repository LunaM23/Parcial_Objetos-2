import java.util.ArrayList;
import java.util.List;

public class ListaCarrera {
    // Lista para almacenar objetos Carrera
    private List<Carrera> carreras;

    // Constructor para inicializar la lista y agregar valores por defecto
    public ListaCarrera() {
        carreras = new ArrayList<>();
        carreras.add(new Carrera(101L, "Ingeniería de Sistemas"));
        carreras.add(new Carrera(102L, "Ingeniería Industrial"));
        carreras.add(new Carrera(103L, "Matemáticas"));
    }

    // Método para obtener la lista de carreras


    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    // Método para agregar una nueva carrera
    public void addCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}