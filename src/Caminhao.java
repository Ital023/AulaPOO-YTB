public class Caminhao extends Veiculo implements Movimentacao{

    private int cargaTotal;
    private int cargaMaxima;

    public Caminhao(Long id, String marca, String modelo, int anoDeFabricacao, int velocidadeMaxima, int cargaTotal, int cargaMaxima) {
        super(id, marca, modelo, anoDeFabricacao, velocidadeMaxima);
        this.cargaTotal = cargaTotal;
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void buzinar() {
        System.out.println("Caminhao buzinando: BAN BAN BAN");
    }

    @Override
    public void acelerar() {
        int velocidadeAtual = getVelocidadeAtual();
        velocidadeAtual += 10;
        setVelocidadeAtual(velocidadeAtual);
        System.out.println("Acelerando o caminhao modelo: " + getModelo());
    }

    @Override
    public void freiar() {
        int velocidadeAtual = getVelocidadeAtual();
        velocidadeAtual -= 10;
        setVelocidadeAtual(velocidadeAtual);
        System.out.println("Freiando o caminhao modelo: " + getModelo());
    }

    @Override
    public void mostrarVelocidadeAtual() {
        System.out.println("A velocidade atual do caminhao " + getModelo() + " é: " + getVelocidadeAtual());
    }

    public int getCargaTotal() {
        return cargaTotal;
    }

    public void setCargaTotal(int cargaTotal) {
        this.cargaTotal = cargaTotal;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }



}
