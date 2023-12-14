package cancelarReserva;

import manipularQuarto.Periodo;
import manipularQuarto.Quarto;

import java.util.Iterator;
import java.util.Map;

public class CancelarReserva {

    public void cancelarReserva(Periodo periodo, Quarto quarto, Map<Periodo, Quarto> reservas) throws IllegalArgumentException {
        if (periodo == null || quarto == null || reservas == null) {
            throw new IllegalArgumentException("Os parâmetros 'periodo', 'quarto' e 'reservas' não podem ser nulos.");
        }

        Iterator<Map.Entry<Periodo, Quarto>> iterator = reservas.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Periodo, Quarto> entry = iterator.next();
            Periodo periodoReserva = entry.getKey();
            Quarto quartoReservado = entry.getValue();

            // Verificar se o período e o quarto correspondem exatamente
            if (periodoReserva.equals(periodo) && quartoReservado.equals(quarto)) {
                iterator.remove();
                return;  // Saia do método após cancelar a reserva para evitar exclusões adicionais
            }
        }

        // Se chegou até aqui, não encontrou a reserva correspondente
        throw new RuntimeException("A reserva não foi encontrada para cancelamento.");
    }
}
