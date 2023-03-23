package parcial3.Ejercicio1;

public class Main {

    public static void main (String [] args){
        AutoGasolina autoGasolina = new AutoGasolina();
        AutoDiesel autoDiesel = new AutoDiesel();
        AutoGasolinaEspecial autoGasolinaEspecial = new AutoGasolinaEspecial();

        AdapterAutoElectrico autoElectrico = new AdapterAutoElectrico(new AutoEletrico());


    }

}
