
package tresenraya;


public class PresentadorTresEnRaya implements Presentador {
    private Modelo modelo;
    private Vista vista;

    public PresentadorTresEnRaya(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public Jugador obtenerJugadorActual() {
        return modelo.obtenerJugadorActual();
    }

    @Override
    public void inicializarJuego() {
        vista.mostrarTablero();
        vista.mostrarMensaje("Comienza el juego. Jugador X, es tu turno.");
    }
    
    @Override
    public void manejarEntrada(int fila, int columna) {
        Jugador jugadorActual = obtenerJugadorActual(); // Usar el método del presentador

        // Marcar la casilla en el modelo
        modelo.marcarCasilla(fila, columna, jugadorActual);

        // Actualizar la vista
        vista.mostrarTablero();

        // Verificar si hay un ganador
        Jugador ganador = modelo.obtenerGanador();
        if (ganador != null) {
            vista.mostrarMensaje("¡Jugador " + ganador + " ha ganado!");
            reiniciarJuego();
            return;
        }

        // Verificar si hay un empate
        
        if (modelo.hayEmpate()) {
            vista.mostrarMensaje("¡El juego ha terminado en empate!");
            reiniciarJuego();
            return;
        }

        // Cambiar al siguiente jugador
        modelo.cambiarJugador();
        vista.mostrarMensaje("Turno del Jugador " + obtenerJugadorActual() + ".");
    }

    private void reiniciarJuego() {
       
    }
    
     public String obtenerValorCasilla(int fila, int columna) {
       
        return "";
    }
}