package reservarQuarto;

import manipularQuarto.GerenciadorQuarto;
import manipularQuarto.Quarto;

import java.util.ArrayList;
import java.util.Scanner;

public class RealizarReserva {
    GerenciadorQuarto gerenciardorDeQuarto = new GerenciadorQuarto();
    ArrayList<Quarto> listaDeQuartosReservados = new ArrayList<>();
    Hospede hospede = new Hospede();

    public Quarto realizarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do quarto disponível que você deseja reservar: ");
    }
}
