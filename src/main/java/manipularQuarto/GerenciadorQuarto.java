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

            // Convertendo as datas de String para LocalDate
            LocalDate dataCheckin = LocalDate.parse(buscarQuarto.getDataCheckin());
            LocalDate dataCheckout = LocalDate.parse(buscarQuarto.getDataChechout());

            // Convertendo as datas de String para LocalDate
            LocalDate reservaInicio = LocalDate.parse(periodo.getDataInicio());
            LocalDate reservaFim = LocalDate.parse(periodo.getDataFim());

            // Verificar se o quarto está reservado durante o período desejado
            if (!reservaInicio.isAfter(dataCheckout) && !reservaFim.isBefore(dataCheckin)) {
                // O quarto está reservado durante as datas desejadas
                // Remover da lista de quartos disponíveis
                quartosDisponiveis.remove(quartoReservado);
            }
        }

        return quartosDisponiveis;
    }
}
