package cancelarReserva;

import manipularQuarto.Periodo;
import manipularQuarto.Quarto;

import java.util.Map;

public class CancelarReserva {
    public void cancelarReserva(Periodo periodo, Quarto quarto, Map<Periodo, Quarto> reservas) {
        for (Map.Entry<Periodo, Quarto> entry : reservas.entrySet()) {
            Periodo periodoReserva = entry.getKey();
            Quarto quartoReservado = entry.getValue();

            // Agora você pode comparar o 'periodo' passado como parâmetro com 'periodoReserva'
            if (periodoReserva.equals(periodo)) {
                // Faça o que for necessário quando encontrar a reserva a ser cancelada
                reservas.remove(periodoReserva);
                System.out.println("Reserva cancelada para o quarto: " + quartoReservado);
                break;  // Assumindo que só há uma reserva por período
            }
        }
    }
}
