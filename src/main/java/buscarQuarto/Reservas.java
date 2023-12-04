package buscarQuarto;

import java.util.Map;

public class Reservas {
    public Map<Periodo, Quarto> reservas;

    public void criarReservas(Map<Periodo, Quarto> reservasParam){
        reservas.putAll(reservasParam);
    }
}
