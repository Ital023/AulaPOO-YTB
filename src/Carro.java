public class Carro extends Veiculo{

    // Atributos

    //private String marca;
    //private String modelo;
    private String cor;
    private int kmRodados;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(Long id, String marca, String modelo, int anoDeFabricacao, String cor, int kmRodados, int velocidadeMaxima) {
        super(id, marca, modelo, anoDeFabricacao);
        this.cor = cor;
        this.kmRodados = kmRodados;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Metodos
    public void visualizarInfoDoCarro() {
        System.out.println("--Informações do carro--");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + cor);
        System.out.println("Km rodados: " + kmRodados);
        System.out.println("Velocidade maxima: " + velocidadeMaxima);
        System.out.println("----------------------------------------");
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Acelerando o carro modelo: " + getModelo());
    }

    public void mostrarVelocidadeAtual() {
        System.out.println("A velocidade atual do veiculo é: " + velocidadeAtual);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
