package parcial3.Ejercicio1;

public class AutoGasolinaEspecial implements Auto {

    private int gasolinaEspecialActual;

    public AutoGasolinaEspecial(){
        this.gasolinaEspecialActual = 0;
    }

    @Override
    public void llenarCombustible(int cantidadGasolinaEspecial) {
        if(cantidadGasolinaEspecial >= 0 && cantidadGasolinaEspecial <= 100){
            this.gasolinaEspecialActual = cantidadGasolinaEspecial;
            System.out.println("Monto de gasolina especial actual: " + gasolinaEspecialActual);
        }else{
            System.out.println("Rango de diesel " + cantidadGasolinaEspecial + " no valido!");
        }
    }

    @Override
    public int estadoCombustible() {
        int cantidadRandom = (int) (Math.random()*100);
        return cantidadRandom;
    }

    @Override
    public void showInfo() {
        System.out.println("Auto Gasolina Especial> llenado con "+gasolinaEspecialActual+" y con estado de combustible "+estadoCombustible());
    }
}
