package reservarQuarto;

import lombok.Getter;
import manipularQuarto.Periodo;
import manipularQuarto.Quarto;

import java.util.ArrayList;
import java.util.List;
@Getter
public class RealizarReserva {
    List<Quarto> listaDeQuartosReservados = new ArrayList<>();

    public List<Quarto> realizarReserva(List<Quarto> quartosDisponiveis, int id) {

        for (Quarto quartoDisponivel : quartosDisponiveis) {
            if (quartoDisponivel.getId() == id) {
                quartoDisponivel.setStatus(true);
                listaDeQuartosReservados.add(quartoDisponivel);
            }
        }
        System.out.println(listaDeQuartosReservados);
        return listaDeQuartosReservados;
    }
}
