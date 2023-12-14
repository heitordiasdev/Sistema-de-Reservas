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
}
