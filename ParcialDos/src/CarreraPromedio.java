import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarreraPromedio {
    private Carrera carrera;
    private double promedioNotas;
    private double promedioEdad;

    public CarreraPromedio(Carrera carrera, double promedioNotas, double promedioEdad) {
        this.carrera = carrera;
        this.promedioNotas = promedioNotas;
        this.promedioEdad = promedioEdad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public double getPromedioEdad() {
        return promedioEdad;
    }

    @Override
    public String toString() {
        return "CarreraPromedio{" +
                "carrera=" + carrera.getNombre() +
                ", promedioNotas=" + promedioNotas +
                ", promedioEdad=" + promedioEdad +
                '}';
    }

    public static List<CarreraPromedio> calcularPromediosPorCarrera(ListaEstudiante listaEstudiante, ListaCarrera listaCarrera) {

        Map<Long, List<Estudiante>> estudiantesPorCarrera = new HashMap<>();
        for (Estudiante estudiante : listaEstudiante.getEstudiantes()) {
            Long carreraId = estudiante.getCarrera();
            if (!estudiantesPorCarrera.containsKey(carreraId)) {
                estudiantesPorCarrera.put(carreraId, new ArrayList<>());
            }
            estudiantesPorCarrera.get(carreraId).add(estudiante);
        }


        List<CarreraPromedio> promediosPorCarrera = new ArrayList<>();


        for (Map.Entry<Long, List<Estudiante>> entry : estudiantesPorCarrera.entrySet()) {
            Long carreraId = entry.getKey();
            List<Estudiante> estudiantes = entry.getValue();

            double sumaNotas = 0.0;
            int sumaEdad = 0;
            for (Estudiante estudiante : estudiantes) {
                sumaNotas += estudiante.getPromedio();
                sumaEdad += estudiante.getEdad();
            }

            double promedioNotas = sumaNotas / estudiantes.size();
            double promedioEdad = (double) sumaEdad / estudiantes.size();


            Carrera carrera = null;
            for (Carrera c : listaCarrera.getCarreras()) {
                if (c.getCodigo().equals(carreraId)) {
                    carrera = c;
                    break;
                }
            }

            if (carrera != null) {
                CarreraPromedio promedio = new CarreraPromedio(carrera, promedioNotas, promedioEdad);
                promediosPorCarrera.add(promedio);
            }
        }

        return promediosPorCarrera;
    }
}
