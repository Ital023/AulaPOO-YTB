public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(1L,
                "Chevrolet"
                , "Onix",
                2021
                , "Branco",
                15000,
                170);

        Carro carro2 = new Carro( 2L,
                "Nissan"
                , "March",
                2015
                , "Azul",
                2000,
                150);

        Concessionaria concessionaria1 =
                new Concessionaria(1L, "Cars", "Fortaleza", "Ceara");

        concessionaria1.addCarro(carro1);
        concessionaria1.addCarro(carro2);

        concessionaria1.mostrarCarrosDisponiveis();

    }
}