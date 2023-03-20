public abstract class Proyecto {

    private String fechaDeIicio;
    private String fechaFinal;
    private String fechaInicioReal;
    private String fechaFinReal;
    private String status;

    public Proyecto(String fechaDeIicio, String fechaFinal, String fechaInicioReal, String fechaFinReal, String status) {
        this.fechaDeIicio = fechaDeIicio;
        this.fechaFinal = fechaFinal;
        this.fechaInicioReal = fechaInicioReal;
        this.fechaFinReal = fechaFinReal;
        this.status = status;
    }
}
