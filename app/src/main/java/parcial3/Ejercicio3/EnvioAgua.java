package parcial3.Ejercicio3;

public class EnvioAgua implements MetodoEnvioImplementator {

    @Override
    public double aumentoPrecio() {
        return 1.25;
    }

    @Override
    public String nombreFormaEnvio() {
        return "Envio Agua";
    }

}


