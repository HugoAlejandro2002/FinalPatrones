package parcial3.Ejercicio3;

public class EnvioTerrestre implements MetodoEnvioImplementator {

    @Override
    public double aumentoPrecio() {
        return 1.05;
    }

    @Override
    public String nombreFormaEnvio() {
        return "Envio Terrestre";
    }

}
