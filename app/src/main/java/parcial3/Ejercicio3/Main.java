package parcial3.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        EnvioTerrestre envioTerrestre = new EnvioTerrestre();
        EnvioAire envioAire = new EnvioAire();
        EnvioAgua envioAgua = new EnvioAgua();

        Paquete paquete = new Paquete(110,"Paquete",5);
        paquete.showInfo();

        EmpresaSA empresaSA = new EmpresaSA();
        EmpresaSRL empresaSRL = new EmpresaSRL();

        empresaSA.setFormaEnvio(envioTerrestre);
        empresaSA.enviarPaquete(paquete);

        empresaSRL.setFormaEnvio(envioAire);
        empresaSRL.enviarPaquete(paquete);


        empresaSA.setFormaEnvio(envioAgua);
        empresaSA.enviarPaquete(paquete);




    }
}
