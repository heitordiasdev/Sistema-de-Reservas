import cancelarReserva.CancelarReserva;
import manipularQuarto.*;
import reservarQuarto.RealizarReserva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quarto quarto1 = new Quarto(false, 1, 50.00);
        Quarto quarto2 = new Quarto(false, 2, 50.00);
        Quarto quarto3 = new Quarto(false, 3, 70.00);
        Quarto quarto4 = new Quarto(false, 4,80.00);
        Quarto quarto5 = new Quarto(false, 5,60.00);

        List<Quarto> listaDeQuartos = new ArrayList<>();
        listaDeQuartos.add(quarto1);
        listaDeQuartos.add(quarto2);
        listaDeQuartos.add(quarto3);
        listaDeQuartos.add(quarto4);
        listaDeQuartos.add(quarto5);

        Reserva reserva = new Reserva();
        Periodo periodo1 = new Periodo("2023-01-01", "2023-01-05");
        Periodo periodo2 = new Periodo("2023-02-01", "2023-02-05");

        BuscarQuarto buscarQuartoMeusParam = new BuscarQuarto("2023-01-01", "2023-01-05", 2, 0);

        GerenciadorQuarto primeiraBusca = new GerenciadorQuarto();

        // Finalmente chamando o método buscarQuarto, passando minhas informações de busca (1 parametro)
        // e também as reservas para comparar com "listaDeQuartos", para ver de acordo com minhas informações de buscar
        // qual dos quartos está reservado nas datas que passei.

        List<Quarto> quartosDisponiveis = primeiraBusca.buscarQuartos(buscarQuartoMeusParam, reserva.getReservas(), listaDeQuartos);

        for (Quarto quarto : quartosDisponiveis) {
            System.out.println(quarto);
        }

        System.out.println("\n");

        //Realizando reserva de quarto

        try {
            Scanner scanner = new Scanner(System.in);

            RealizarReserva realizarReserva = new RealizarReserva();
            System.out.print("Informe o quarto que você deseja reservar: ");
            int idQuarto = scanner.nextInt();

            realizarReserva.realizarReserva(quartosDisponiveis,periodo2, idQuarto, reserva.getReservas());
        } catch (Exception ex) {
            ex.getMessage();
        }

        System.out.println("Lista de reserva: " + reserva.getReservas());

        System.out.println("\n");
        // Linhas para verificar se o método "cancelarReserva" está funcionando
        System.out.println("Reservas antes do cancelamento: " + reserva.getReservas());
        System.out.println("\n");

        CancelarReserva cancelador = new CancelarReserva();
        cancelador.cancelarReserva(periodo1, quarto3, reserva.getReservas());

        System.out.println("Reservas após o cancelamento: " + reserva.getReservas());
    }
}
