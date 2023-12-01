package buscarQuarto;

import lombok.Data;

@Data
public class BuscarQuarto {
    String dataCheckin;
    String dataChechout;
    int qtdAdultos;
    int qtdCriancas;

    public BuscarQuarto(String dataCheckin, String dataChechout, int qtdAdultos, int qtdCriancas) {
        this.dataCheckin = dataCheckin;
        this.dataChechout = dataChechout;
        this.qtdAdultos = qtdAdultos;
        this.qtdCriancas = qtdCriancas;
    }

}
