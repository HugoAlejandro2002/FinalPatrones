package parcial3.Ejercicio3;

public abstract class EmpresaAbstraction {
    protected MetodoEnvioImplementator metodoEnvioImplementador;

    public EmpresaAbstraction() {
        this.metodoEnvioImplementador = new EnvioTerrestre(); // Por defecto
    }

    public void setFormaEnvio(MetodoEnvioImplementator metodoPagoImplementator) {
        this.metodoEnvioImplementador = metodoPagoImplementator;
    }

    public abstract void enviarPaquete(Paquete paquete);

}
