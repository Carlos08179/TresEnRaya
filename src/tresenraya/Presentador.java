
package tresenraya;


  interface Presentador {
    void inicializarJuego();
    void manejarEntrada(int fila, int columna);
    Jugador obtenerJugadorActual();
    String obtenerValorCasilla(int fila, int columna); // Asegúrate de que este método esté aquí
}