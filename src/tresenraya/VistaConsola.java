
package tresenraya;


public class VistaConsola implements Vista {
    private Presentador presentador;

    public VistaConsola(Presentador presentador) {
        this.presentador = presentador;
    }

    VistaConsola() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(presentador.obtenerValorCasilla(i, j) + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
       public String obtenerValorCasilla(int fila, int columna) {
       
        return "";
    }
}