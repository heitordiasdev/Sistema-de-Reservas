package cancelarReserva;

import manipularQuarto.Periodo;
import manipularQuarto.Quarto;

import java.util.Iterator;
import java.util.Map;

public class CancelarReserva {
    public void cancelarReserva(Periodo periodo, Quarto quarto, Map<Periodo, Quarto> reservas) {
        Iterator<Map.Entry<Periodo, Quarto>> iterator = reservas.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Periodo, Quarto> entry = iterator.next();
            Periodo periodoReserva = entry.getKey();
            Quarto quartoReservado = entry.getValue();

            // Comparar o 'periodo' e 'quarto' passados como parâmetro com 'periodoReserva' e 'quartoReservado'
            if (periodoReserva.equals(periodo) && quartoReservado.equals(quarto)) {
                iterator.remove();
            }
        }
    }
}
