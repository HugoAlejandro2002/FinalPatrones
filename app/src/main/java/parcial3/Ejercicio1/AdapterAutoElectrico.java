package parcial3.Ejercicio1;

public class AdapterAutoElectrico implements Auto {
    private AutoEletrico autoEletrico;

    public AdapterAutoElectrico(AutoEletrico autoEletrico){
        this.autoEletrico = autoEletrico;
    }

    @Override
    public void llenarCombustible(int cantidadCombustible) {
        autoEletrico.cargar((int) (cantidadCombustible));
    }

    @Override
    public int estadoCombustible() {
        return autoEletrico.estadoDeEletricidad();
    }

    @Override
    public void showInfo() {
    }
}
