
package tresenraya;

public class ModeloTresEnRaya implements Modelo {
    private Jugador[][] tablero;
    private Jugador jugadorActual;

    public ModeloTresEnRaya() {
        // Inicializar el tablero y el jugador actual
        tablero = new Jugador[3][3];
        jugadorActual = Jugador.JUGADOR_X;
    }

    @Override
    public void marcarCasilla(int fila, int columna, Jugador jugador) {
        // Verificar si la casilla está disponible
        if (tablero[fila][columna] == null) {
            tablero[fila][columna] = jugador;
            cambiarJugador();
        }
    }

    @Override
    public Jugador obtenerGanador() {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != null && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                return tablero[i][0]; // Ganador en una fila
            }
            if (tablero[0][i] != null && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                return tablero[0][i]; // Ganador en una columna
            }
        }

        // Verificar diagonales
        if (tablero[0][0] != null && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return tablero[0][0]; // Ganador en la diagonal principal
        }
        if (tablero[0][2] != null && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            return tablero[0][2]; // Ganador en la diagonal secundaria
        }

        return null; // No hay ganador aún
    }

    @Override
    public boolean hayEmpate() {
        // Verificar si todas las casillas están ocupadas y no hay ganador
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == null) {
                    return false; // Todavía hay casillas disponibles
                }
            }
        }

        // No hay casillas disponibles y no hay ganador
        return true; // Empate
    }

    private void cambiarJugador() {
        // Cambiar al siguiente jugador
        jugadorActual = (jugadorActual == Jugador.JUGADOR_X) ? Jugador.JUGADOR_O : Jugador.JUGADOR_X;
    }
}
