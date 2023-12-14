package reservarQuarto;

import lombok.Getter;
import manipularQuarto.Periodo;
import manipularQuarto.Quarto;
import org.jetbrains.annotations.NotNull;

import java.util.*;

@Getter
public class RealizarReserva {
    //Verifica a lista de quartos disponiveis para poder realizar reserva
    //Caso quarto passado como parametro seja equiavalente ao que tem na lista de quartos disponveis
    //o status do quarto é alterado e o mesmo é removido da lista de quartos disponiveis e adicionado no map de reservas
    public void realizarReserva(@NotNull List<Quarto> quartosDisponiveis, Periodo periodo, Quarto quarto, Map<Periodo, Quarto> reservas) {
        try {
            Iterator<Quarto> iterator = quartosDisponiveis.iterator();

            while (iterator.hasNext()) {
                Quarto quartoDisponivel = iterator.next();
                Hospede hospede = new Hospede();
                List<Hospede> hospedes = new ArrayList<>();

                if (quarto.getId() == quartoDisponivel.getId()) {
                    quartoDisponivel.setStatus(true);
                    hospedes.add(hospede.VincularHospedeAoQuarto());
                    quartoDisponivel.setHospedes(hospedes);

                    iterator.remove();
                    reservas.put(periodo, quartoDisponivel);
                    System.out.println("Hospedado: " + hospede);
                    break;
                }
            }
        } catch (ConcurrentModificationException ex) {
            System.err.println("Erro ao modificar lista de quartos disponíveis!");
            ex.getMessage();
            ex.printStackTrace();
        }
    }
}
