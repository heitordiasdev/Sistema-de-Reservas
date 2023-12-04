package manipularQuarto;

import lombok.Data;

import java.util.Map;

@Data
public class Reserva {
    public Map<Periodo, Quarto> reservas;

    public void criarReservas(Map<Periodo, Quarto> reservasParam){
        reservas.putAll(reservasParam);
    }
}
