package parcial3.Ejercicio1;

public class AutoGasolina implements Auto {

    private int gasolinaActual;

    public AutoGasolina(){
        this.gasolinaActual = 0;
    }

    @Override
    public void llenarCombustible(int cantidadGasolina) {
        if(cantidadGasolina >= 0 && cantidadGasolina <= 100){
            this.gasolinaActual = cantidadGasolina;
            System.out.println("Llenando con: " + gasolinaActual);
        }else{
            System.out.println("Es invalido " + cantidadGasolina );
        }
    }

    @Override
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*100);
        return cantidadRandom;
    }

    @Override
    public void showInfo() {
        System.out.println("Auto Gasolina> llenado con "+gasolinaActual+" y con estado de combustible "+estadoCombustible());
    }
}
