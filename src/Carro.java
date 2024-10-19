public class Carro {

    // Atributos
    String marca;
    String modelo;
    String cor;
    int kmRodados;
    int velocidadeAtual;
    int velocidadeMaxima;

    public Carro(String marca, String modelo, String cor, int kmRodados, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.kmRodados = kmRodados;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    // Metodos
    public void visualizarInfoDoCarro() {
        System.out.println("--Informações do carro--");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Km rodados: " + kmRodados);
        System.out.println("Velocidade maxima: " + velocidadeMaxima);
        System.out.println("----------------------------------------");
    }

    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Acelerando o carro");
    }

    public void mostrarVelocidadeAtual() {
        System.out.println("A velocidade atual do veiculo é: " + velocidadeAtual);
    }


}
