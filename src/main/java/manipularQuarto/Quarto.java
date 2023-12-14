package manipularQuarto;

import lombok.Data;
import reservarQuarto.Hospede;

import java.util.ArrayList;
import java.util.List;

@Data
public class Quarto {
    private boolean status;
    private int id;
    private double valor;
    private List<Quarto> quartos;
    public Quarto(boolean status, int id, double valor) {
        this.status = status;
        this.id = id;
        this.valor = valor;
        this.quartos = new ArrayList<>(); // Inicializar a lista de quartos
    }

    public void criarQuartos(List<Quarto> quartosParam) {
        this.quartos.addAll(quartosParam);
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "status=" + status +
                ", id=" + id +
                ", valor=" + valor +
                '}';
    }

    // Getter para o atributo quartos
    public List<Quarto> getQuartos() {
        return quartos;
    }
}
