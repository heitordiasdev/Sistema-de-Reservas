package manipularQuarto;

import java.util.List;
import java.util.Map;

public class RelatorioQuarto {

    public static void gerarRelatorio(List<Quarto> todosQuartos, Map<Periodo, Quarto> reservas) {
        System.out.println("Relatório de Quartos\n");

        List<Quarto> quartosDisponiveis = calcularQuartosDisponiveis(todosQuartos, reservas);
        System.out.println("Quartos Disponíveis:");
        exibirInformacoesQuartos(quartosDisponiveis);

        List<Quarto> quartosIndisponiveis = calcularQuartosIndisponiveis(todosQuartos, reservas);
        System.out.println("\nQuartos Indisponíveis:");
        exibirInformacoesQuartos(quartosIndisponiveis);

        System.out.println("\nPreços de Cada Quarto:");
        exibirPrecosQuartos(todosQuartos);

    }

    private static List<Quarto> calcularQuartosDisponiveis(List<Quarto> todosQuartos, Map<Periodo, Quarto> reservas) {
        GerenciadorQuarto gerenciadorQuarto = new GerenciadorQuarto();
        BuscarQuarto busca = new BuscarQuarto("2023-01-01", "2023-01-05", 2, 0);
        return gerenciadorQuarto.buscarQuartos(busca, reservas, todosQuartos)
                .stream()
                .filter(Quarto::isStatus)
                .toList();
    }

    private static List<Quarto> calcularQuartosIndisponiveis(List<Quarto> todosQuartos, Map<Periodo, Quarto> reservas) {
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
}

