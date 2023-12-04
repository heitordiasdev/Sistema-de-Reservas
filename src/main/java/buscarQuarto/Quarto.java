package buscarQuarto;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

// @Data usado para Getters,Setters...
@Data
public class Quarto {
    boolean status;
    int id;
    double valor;
    private List<Quarto> quartos;
    public Quarto(boolean status, int id, double valor) {
        this.status = status;
        this.id = id;
        this.valor = valor;
    }
    public void criarQuartos(List<Quarto> quartosParam) {
        quartos.add((Quarto) quartosParam);

    };

}
