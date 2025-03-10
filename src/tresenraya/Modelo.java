
package tresenraya;

interface Modelo {
    void marcarCasilla(int fila, int columna, Jugador jugador);
    Jugador obtenerGanador();
    Jugador obtenerJugadorActual();
    Jugador cambiarJugador();
    boolean hayEmpate();
}