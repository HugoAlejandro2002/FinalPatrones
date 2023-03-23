package parcial3.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements IServer {
    private List<Usuario> usuariosLogueados;
    private String nombreServidor;

    public Servidor(String nombreServidor){
        this.nombreServidor = nombreServidor;
        usuariosLogueados = new ArrayList<Usuario>();
    }

    @Override
    public void login(Usuario usuario) {
        System.out.println("Servidor: " + nombreServidor + "> Usuario: " + usuario.getNombre() + " logueado con id "+usuario.getId());
        usuariosLogueados.add(usuario);
    }

    @Override
    public void showUsuariosLogueados(){
        System.out.println("Servidor: " + nombreServidor + "> Usuarios logueados: ");
        for(Usuario usuario : usuariosLogueados){
            System.out.println("- Usuario: " + usuario.getNombre());
        }
    }

    public List<Usuario> getUsuariosLogueados(){
        return usuariosLogueados;
    }
}
