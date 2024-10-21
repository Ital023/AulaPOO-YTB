public class Carro extends Veiculo implements Movimentacao{

    // Atributos

    //private String marca;
    //private String modelo;
    private String cor;
    private int kmRodados;


    public Carro(Long id, String marca, String modelo, int anoDeFabricacao, int velocidadeMaxima, String cor, int kmRodados) {
        super(id, marca, modelo, anoDeFabricacao, velocidadeMaxima);
        this.cor = cor;
        this.kmRodados = kmRodados;
    }

    // Metodos
    public void visualizarInfoDoCarro() {
        System.out.println("--Informações do carro--");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + cor);
        System.out.println("Km rodados: " + kmRodados);
        System.out.println("Velocidade maxima: " + getVelocidadeMaxima());
        System.out.println("----------------------------------------");
    }

    @Override
    public void acelerar() {
        int velocidadeAtual = getVelocidadeAtual();
        velocidadeAtual += 20;
        setVelocidadeAtual(velocidadeAtual);
        System.out.println("Acelerando o carro modelo: " + getModelo());
    }

    @Override
    public void freiar() {
        int velocidadeAtual = getVelocidadeAtual();
        velocidadeAtual -= 20;
        setVelocidadeAtual(velocidadeAtual);
        System.out.println("Freiando o carro modelo: " + getModelo());
    }

    @Override
    public void buzinar() {
        System.out.println("carro buzinando: PEN PEN");
    }

    @Override
    public void mostrarVelocidadeAtual() {
        System.out.println("A velocidade atual do carro " + getModelo() + " é: " + getVelocidadeAtual());
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
}
