package buscarQuarto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GerenciadorQuarto {
    private List<Quarto> quartos;
    private Map<Periodo, Quarto> reservas;

    public GerenciadorQuarto() {
        quartos = Arrays.asList(
                new Quarto(false, 1, 50.00),
                new Quarto(false, 2, 50.00),
                new Quarto(false, 3, 50.00),
                new Quarto(false, 4, 50.00),
                new Quarto(false, 5, 50.00)

        );
    }

    public List<Quarto> buscarQuartos(BuscarQuarto buscarQuarto) {
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
