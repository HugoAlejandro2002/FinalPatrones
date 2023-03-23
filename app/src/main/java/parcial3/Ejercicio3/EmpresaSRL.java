package parcial3.Ejercicio3;

public class EmpresaSRL extends EmpresaAbstraction {

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("EmpresaSRL> enviando "+paquete.getNombrePaquete()+
        " con precio de "+
        (int)(metodoEnvioImplementador.aumentoPrecio()*paquete.getPrecio())+" Bs por "+metodoEnvioImplementador.nombreFormaEnvio());
    }
    
}
