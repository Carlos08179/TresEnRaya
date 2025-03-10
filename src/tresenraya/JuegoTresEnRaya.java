
package tresenraya;


public class JuegoTresEnRaya {
    public static void main(String[] args) {
        Modelo modelo = new ModeloTresEnRaya();
        Vista vista = new VistaConsola();
        Presentador presentador = new PresentadorTresEnRaya(modelo, vista);

        presentador.inicializarJuego();
    }
}