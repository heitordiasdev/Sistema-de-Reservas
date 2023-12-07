package manipularQuarto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Periodo {
    private String dataInicio;
    private String dataFim;

    public Periodo(String dataInicio, String dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
