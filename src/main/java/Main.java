import buscarQuarto.Quarto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Quarto quarto1 = new Quarto(false, 1, 50.00);
        Quarto quarto2 = new Quarto(false, 2, 50.00);
        Quarto quarto3 = new Quarto(false, 3, 70.00);
        Quarto quarto4 = new Quarto(false, 4,80.00);
        Quarto quarto5 = new Quarto(false, 5,60.00);

        List<Quarto> listaDeQuartos = new ArrayList<>();
        listaDeQuartos.add(quarto1);
        listaDeQuartos.add(quarto2);
        listaDeQuartos.add(quarto3);
        listaDeQuartos.add(quarto4);
        listaDeQuartos.add(quarto5);

        quarto1.criarQuartos(listaDeQuartos);
        System.out.println(quarto1.getQuartos());

    }
}
