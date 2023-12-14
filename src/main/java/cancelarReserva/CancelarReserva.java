package cancelarReserva;

import manipularQuarto.Periodo;
import manipularQuarto.Quarto;

import java.util.Iterator;
import java.util.Map;

public class CancelarReserva {

    public void cancelarReserva(Periodo periodo, Quarto quarto, Map<Periodo, Quarto> reservas) {
        try {
            if (periodo == null || quarto == null || reservas == null) {
                throw new IllegalArgumentException("Os parâmetros 'periodo', 'quarto' e 'reservas' não podem ser nulos.");
            }

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
        } catch (Exception e) {
            // Lidar com a exceção de maneira global, por exemplo, registrar ou exibir uma mensagem genérica
            System.err.println("Erro ao cancelar reserva: " + e.getMessage());
        }
    }
}
