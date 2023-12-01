package buscarQuarto;

import lombok.Data;

// @Data usado para Getters,Setters...
@Data
public class Quarto {
    boolean status;
    int id;
    double valor;
    public Quarto(boolean status, int id, double valor) {
        this.status = status;
        this.id = id;
        this.valor = valor;
    }
}
