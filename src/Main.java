import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet"
                , "Onix"
                , "Branco",
                15000,
                170);

        Carro carro2 = new Carro("Nissan"
                , "March"
                , "Azul",
                2000,
                150);

        carro1.mostrarVelocidadeAtual();
        carro1.acelerar();
        carro1.mostrarVelocidadeAtual();
        carro1.acelerar();
        carro1.mostrarVelocidadeAtual();

    }
}