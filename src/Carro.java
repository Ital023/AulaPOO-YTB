public class Carro {
    //Atributos
    private String marca;
    private String modelo;
    private String cor;
    private int kmRodados;
    private int velocidadeMaxima;

    public Carro(String marca, String modelo, String cor, int kmRodados, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.kmRodados = kmRodados;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Metodos

    public void visualizarInfoDoCarro() {
        System.out.println("--Informações do carro--");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Km rodados: " + kmRodados);
        System.out.println("Velocidade maxima: " + velocidadeMaxima);
        System.out.println("----------------------------------------");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
