package manipularQuarto;

import lombok.Data;

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

    @Override
    public String toString() {
        return "Quarto{" +
                "status=" + status +
                ", id=" + id +
                ", valor=" + valor +
                '}';
    }
}
