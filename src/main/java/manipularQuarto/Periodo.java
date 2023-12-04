package manipularQuarto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Periodo {
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Periodo(LocalDate dataInicio, LocalDate dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
