package manipularQuarto;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Reserva {
    public Map<Periodo, Quarto> reservas = new HashMap<>();
}
