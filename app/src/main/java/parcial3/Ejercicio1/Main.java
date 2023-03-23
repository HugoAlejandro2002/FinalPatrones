package parcial3.Ejercicio1;

public class Main {

    public static void main (String [] args){
        AutoGasolina autoGasolina = new AutoGasolina();
        AutoDiesel autoDiesel = new AutoDiesel();
        AutoGasolinaEspecial autoGasolinaEspecial = new AutoGasolinaEspecial();

        AdapterAutoElectrico autoElectrico = new AdapterAutoElectrico(new AutoEletrico());

        System.out.println("Auto Gasolina");
        autoGasolina.showInfo();
        autoGasolina.llenarCombustible(45);
        autoGasolina.showInfo();

        System.out.println("Auto Diesel");
        autoDiesel.showInfo();
        autoDiesel.llenarCombustible(36);
        autoDiesel.showInfo();


        System.out.println("Auto Gasolina Especial");
        autoGasolinaEspecial.showInfo();
        autoGasolinaEspecial.llenarCombustible(13);
        autoGasolinaEspecial.showInfo();


        System.out.println("Auto Electrico");
        autoElectrico.showInfo();
        autoElectrico.llenarCombustible(31);
        autoElectrico.showInfo();
    }

}
