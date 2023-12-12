package reservarQuarto;

import lombok.Getter;
import manipularQuarto.Periodo;
import manipularQuarto.Quarto;

import java.util.Iterator;
import java.util.Map;

@Getter
public class RealizarReserva {

    public void realizarReserva(Periodo periodo, Quarto quarto, Map<Periodo, Quarto> reservas) {
        Iterator<Map.Entry<Periodo, Quarto>> iterator = reservas.entrySet().iterator();

        for (Map.Entry<Periodo, Quarto> entry : reservas.entrySet()) {
            if (entry.getKey().equals(periodo) && entry.getValue().equals(quarto)) {
                entry.getValue().setStatus(true);
                reservas.put(periodo, quarto);
            }
            System.out.print("Lista de quartos reservados: ");
            System.out.println(iterator.next());
        }
    }
}
