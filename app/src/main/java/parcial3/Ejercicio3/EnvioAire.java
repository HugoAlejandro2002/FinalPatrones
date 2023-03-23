package parcial3.Ejercicio3;

public class EnvioAire implements MetodoEnvioImplementator {

    @Override
    public double aumentoPrecio() {
        return 1.10;
    }

    @Override
    public String nombreFormaEnvio() {
        return "Envio Aire";
    }

}

