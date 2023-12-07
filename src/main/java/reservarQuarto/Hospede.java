package reservarQuarto;

import lombok.Data;

@Data
public class Hospede {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;
}
