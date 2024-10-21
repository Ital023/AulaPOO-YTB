public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(1L,
                "Chevrolet"
                , "Onix",
                2021
                , 200,
                "Branco",
                170);

        Carro carro2 = new Carro( 2L,
                "Nissan"
                , "March",
                2015
                , 160,
                "Azul",
                150);

        Caminhao caminhao1 = new Caminhao(3L
                , "Scania"
                , "modelo1"
                , 2015,
                200
                , 200,
                300
        );

        Concessionaria concessionaria1 =
                new Concessionaria(1L, "Cars", "Fortaleza", "Ceara");

        carro1.acelerar();
        carro1.mostrarVelocidadeAtual();
        carro1.acelerar();
        carro1.mostrarVelocidadeAtual();
        carro1.freiar();
        carro1.mostrarVelocidadeAtual();



    }
}