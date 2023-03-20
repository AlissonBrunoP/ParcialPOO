public class ProyectoAgil extends Proyecto{

    private int antidadSprint;
    private int numeroSprint;
    private String descripcionSprint;

    public ProyectoAgil(String fechaDeIicio, String fechaFinal, String fechaInicioReal, String fechaFinReal, String status, int antidadSprint, int numeroSprint, String descripcionSprint) {
        super(fechaDeIicio, fechaFinal, fechaInicioReal, fechaFinReal, status);
        this.antidadSprint = antidadSprint;
        this.numeroSprint = numeroSprint;
        this.descripcionSprint = descripcionSprint;
    }
}
