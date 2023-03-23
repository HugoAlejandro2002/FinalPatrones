package parcial3.Ejercicio1;

public class AutoEletrico {
    private int porcentajeCargado;

    public AutoEletrico(){
        this.porcentajeCargado = 0;
    }

    public void cargar(int montoCarga){
        if(montoCarga >= 0 && montoCarga <= 100 && montoCarga%2==0){
            this.porcentajeCargado = montoCarga;
            System.out.println("Llenando con: " + porcentajeCargado);
        }else{
            System.out.println("Es invalido, debe ser par " + montoCarga);
        }
    }

    public int estadoDeEletricidad() {
        int cantidadRandom = (int) (Math.random()*9)+1;
        return cantidadRandom;
    }

    public void showInfo(){
        System.out.println("Auto Gasolina Especial> llenado con "+porcentajeCargado+" y con estado de combustible "+estadoDeEletricidad());
    }
}
