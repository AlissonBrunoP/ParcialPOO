public class ProyectoTradicional extends Proyecto{

    private String faseProyecto;

    public ProyectoTradicional(String fechaDeIicio, String fechaFinal, String fechaInicioReal, String fechaFinReal, String status, String faseProyecto) {
        super(fechaDeIicio, fechaFinal, fechaInicioReal, fechaFinReal, status);
        this.faseProyecto = faseProyecto;
    }
}
