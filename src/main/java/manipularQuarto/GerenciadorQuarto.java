package manipularQuarto;

import manipularQuarto.BuscarQuarto;
import manipularQuarto.Periodo;
import manipularQuarto.Quarto;

import java.time.LocalDate;
import java.util.*;

public class GerenciadorQuarto {

    public List<Quarto> buscarQuartos(BuscarQuarto buscarQuarto, Map<Periodo, Quarto> reservas, List<Quarto> todosQuartos) {
        List<Quarto> quartosDisponiveis = new ArrayList<>(todosQuartos);

        for (Map.Entry<Periodo, Quarto> entry : reservas.entrySet()) {
            Periodo periodo = entry.getKey();
            Quarto quartoReservado = entry.getValue();

            LocalDate dataCheckin = LocalDate.parse(buscarQuarto.getDataCheckin());
            LocalDate dataCheckout = LocalDate.parse(buscarQuarto.getDataChechout());

            quartosDisponiveis.remove(quartoReservado);
        }

        return quartosDisponiveis;
    }
}
