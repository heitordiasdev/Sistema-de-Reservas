package reservarQuarto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class Hospede {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    public Hospede VincularHospedeAoQuarto() {
        List<Hospede> hospedes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean cadastrarOutro = true;

        while (cadastrarOutro && hospedes.size() < 5) {
            Hospede hospede = new Hospede();

            System.out.print("Insira seu primeiro nome: ");
            hospede.setNome(scanner.next());

            System.out.print("Insira seu sobrenome: ");
            hospede.setSobrenome(scanner.next());

            System.out.print("Insira seu CPF: ");
            hospede.setCpf(scanner.next());

            System.out.print("Insira sua idade: ");
            hospede.setIdade(scanner.nextInt());

            hospedes.add(hospede);

            System.out.print("Deseja cadastrar mais algum hospede? (s/n) ");
            String condicao = scanner.next();

            cadastrarOutro = condicao.equalsIgnoreCase("s");
        }
        return (Hospede) hospedes;
    }
}
