package manipularQuarto;

import java.util.List;
import java.util.Map;

public class RelatorioQuarto {

    public static void gerarRelatorio(List<Quarto> todosQuartos, Map<Periodo, Quarto> reservas) {
        System.out.println("Relatório de Quartos\n");

        // Quartos Disponíveis
        List<Quarto> quartosDisponiveis = calcularQuartosDisponiveis(todosQuartos, reservas);
        System.out.println("Quartos Disponíveis:");
        exibirInformacoesQuartos(quartosDisponiveis);

        // Quartos Indisponíveis
        List<Quarto> quartosIndisponiveis = calcularQuartosIndisponiveis(todosQuartos, reservas);
        System.out.println("\nQuartos Indisponíveis:");
        exibirInformacoesQuartos(quartosIndisponiveis);

        // Preços de Cada Quarto
        System.out.println("\nPreços de Cada Quarto:");
        exibirPrecosQuartos(todosQuartos);

        // Hóspedes
        System.out.println("\nHóspedes:");
        exibirHospedes(reservas);
    }

    private static List<Quarto> calcularQuartosDisponiveis(List<Quarto> todosQuartos, Map<Periodo, Quarto> reservas) {
        GerenciadorQuarto gerenciadorQuarto = new GerenciadorQuarto();
        BuscarQuarto busca = new BuscarQuarto("2023-01-01", "2023-01-05", 2, 0);

        // Filtrar apenas os quartos com status true (disponíveis)
        return gerenciadorQuarto.buscarQuartos(busca, reservas, todosQuartos)
                .stream()
                .filter(Quarto::isStatus)
                .toList();
    }

    private static List<Quarto> calcularQuartosIndisponiveis(List<Quarto> todosQuartos, Map<Periodo, Quarto> reservas) {
        // Filtrar apenas os quartos com status false (indisponíveis)
        return todosQuartos.stream()
                .filter(quarto -> !calcularQuartosDisponiveis(todosQuartos, reservas).contains(quarto))
                .toList();
    }

    private static void exibirInformacoesQuartos(List<Quarto> quartos) {
        for (Quarto quarto : quartos) {
            System.out.println(quarto);
        }
    }

    private static void exibirPrecosQuartos(List<Quarto> todosQuartos) {
        for (Quarto quarto : todosQuartos) {
            System.out.println("Quarto " + quarto.getId() + ": R$ " + quarto.getValor());
        }
    }

    private static void exibirHospedes(Map<Periodo, Quarto> reservas) {
        for (Map.Entry<Periodo, Quarto> entry : reservas.entrySet()) {
            Periodo periodo = entry.getKey();
            Quarto quarto = entry.getValue();
            System.out.println("Período: " + periodo.getDataInicio() + " a " + periodo.getDataFim() +
                    ", Quarto: " + quarto.getId());
        }
    }
}
