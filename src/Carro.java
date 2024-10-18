public class Carro extends Veiculo{
    //Atributos

    private String cor;
    private int kmRodados;
    private int velocidadeMaxima;


    public Carro(String marca,String modelo, String cor, int kmRodados, int velocidadeMaxima) {
        super(modelo, marca);
        this.cor = cor;
        this.kmRodados = kmRodados;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Metodos
    public void visualizarInfoDoCarro() {
        System.out.println("--Informações do carro--");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + cor);
        System.out.println("Km rodados: " + kmRodados);
        System.out.println("Velocidade maxima: " + velocidadeMaxima);
        System.out.println("----------------------------------------");
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
