import buscarQuarto.BuscarQuarto;
import buscarQuarto.GerenciadorQuarto;
import buscarQuarto.Quarto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        return quartos = Arrays.asList(
////                new Quarto(false, 1, 50.00),
////                new Quarto(false, 2, 50.00),
////                new Quarto(false, 3, 50.00),
////                new Quarto(false, 4, 50.00),
////                new Quarto(false, 5, 50.00)
////
////        );

        BuscarQuarto cliente1 = new BuscarQuarto("10-05-2023", "12-05-2023", 2, 0);

        GerenciadorQuarto gerenciador = new GerenciadorQuarto();

        List<Quarto> quartosDisponiveis = gerenciador.buscarQuartos(cliente1);
        System.out.println(quartosDisponiveis);

        if (quartosDisponiveis.isEmpty()) {
            System.out.println("Não há quartos disponíveis para as datas desejadas.");
        } else {
            System.out.println("Quartos disponíveis:");
            for (Quarto quarto : quartosDisponiveis) {
                System.out.println("ID do Quarto: " + quarto.getId());
            }
        }
    }
}
