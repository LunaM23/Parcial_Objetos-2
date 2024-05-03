import java.util.List;
public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera = new ListaCarrera();

        List<CarreraPromedio> promediosPorCarrera = CarreraPromedio.calcularPromediosPorCarrera(listaEstudiante, listaCarrera);

        // Imprimir el reporte
        imprimirReporte(promediosPorCarrera, listaEstudiante.getEstudiantes().size());
    }

    private static void imprimirReporte(List<CarreraPromedio> promediosPorCarrera, int totalEstudiantes) {
        System.out.println("Reporte de promedios por carrera:");

        for (CarreraPromedio promedio : promediosPorCarrera) {
            System.out.println(promedio);
        }

    }
}