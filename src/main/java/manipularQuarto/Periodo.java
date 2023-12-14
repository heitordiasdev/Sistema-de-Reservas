package manipularQuarto;

import lombok.Data;

@Data
public class Periodo {
    private String dataInicio;
    private String dataFim;

    public Periodo(String dataInicio, String dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
