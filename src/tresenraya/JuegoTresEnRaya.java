
package tresenraya;

public class JuegoTresEnRaya {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a Tres en Raya con control de versiones en Git!");

        Modelo modelo = new ModeloTresEnRaya();
        Vista vista = new VistaConsola();
        Presentador presentador = new PresentadorTresEnRaya(modelo, vista);

        presentador.inicializarJuego();
    }
}
