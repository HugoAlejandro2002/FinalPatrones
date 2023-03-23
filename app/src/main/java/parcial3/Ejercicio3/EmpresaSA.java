package parcial3.Ejercicio3;

public class EmpresaSA extends EmpresaAbstraction {

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("EmpresaSA> enviando "+paquete.getNombrePaquete()+
        " con precio de "+
        (int)(metodoEnvioImplementador.aumentoPrecio()*paquete.getPrecio())+" Bs por "+metodoEnvioImplementador.nombreFormaEnvio());
    }
    
}
