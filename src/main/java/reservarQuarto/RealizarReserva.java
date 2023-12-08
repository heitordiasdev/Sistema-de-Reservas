package reservarQuarto;

import lombok.Getter;
import manipularQuarto.Quarto;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
@Getter
public class RealizarReserva {
    List<Quarto> quartosReservados = new ArrayList<>();

    public List<Quarto> realizarReserva(@NotNull List<Quarto> quartosDisponiveis, int id) {

        for (Quarto quartoDisponivel : quartosDisponiveis) {
            if (quartoDisponivel.getId() == id) {
                quartoDisponivel.setStatus(true);
                quartosReservados.add(quartoDisponivel);
            }
        }
        return quartosReservados;
    }
}
