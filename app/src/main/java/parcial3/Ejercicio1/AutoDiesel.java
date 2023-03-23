package parcial3.Ejercicio1;

public class AutoDiesel implements Auto {

    private int dieselActual;

    public AutoDiesel(){
        this.dieselActual = 0;
    }

    @Override
    public void llenarCombustible(int cantidadDiesel) {
        if(cantidadDiesel >= 0 && cantidadDiesel <= 100){
            this.dieselActual = cantidadDiesel;
            System.out.println("Monto de gasolina actual: " + dieselActual);
        }else{
            System.out.println("Rango de diesel " + cantidadDiesel + " no valido!");
        }
    }

    @Override
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*100);
        return cantidadRandom;
    }

    @Override
    public void showInfo() {
        System.out.println("Auto Diesel> llenado con "+dieselActual+" y con estado de combustible "+estadoCombustible());
    }
}
