package parcial3.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        Usuario usuario1 = new Usuario(45, "Juan", "123"); //no primo
        Usuario usuario2 = new Usuario(7, "Pedro", "456"); //primo

        proxy.login(usuario1);
        proxy.login(usuario2);

        proxy.showUsuariosLogueados();

    }
}
