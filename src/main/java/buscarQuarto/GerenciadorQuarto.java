package buscarQuarto;
import java.util.*;

public class GerenciadorQuarto {

    public List<Quarto> buscarQuartos(BuscarQuarto buscarQuarto, Map<Periodo, Quarto> reservas) {
        List<Quarto> quartosDisponiveis = new ArrayList<>();

        for (Map.Entry<Periodo, Quarto> entry : reservas.entrySet()) {
            Periodo periodo = entry.getKey();
            Quarto quartoReservado = entry.getValue();

            if (!periodo.getDataInicio().equals(buscarQuarto.getDataCheckin()) &&
                    periodo.getDataFim().equals(buscarQuarto.getDataChechout())){

                // O quarto está reservado para as datas e quantidade de pessoas desejadas
                // Adicione à lista de quartos disponíveis
                quartosDisponiveis.add(quartoReservado);
            }
        }

        return quartosDisponiveis;
    }
}
