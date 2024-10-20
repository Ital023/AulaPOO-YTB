import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private Long id;
    private String nome;
    private String cidade;
    private String estado;
    private List<Carro> carros = new ArrayList<>();

    public Concessionaria() {
    }

    public Concessionaria(Long id, String nome, String cidade, String estado) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void addCarro(Carro carro) {
        carros.add(carro);
    }

    public void mostrarCarrosDisponiveis() {
        System.out.println("-- Carros Disponiveis -- ");

        for(Carro carro : carros) {

            System.out.println("-- Carro " + carro.getId() + " --");
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Ano de Fabricacao: " + carro.getAnoDeFabricacao());
            System.out.println("Cor: " + carro.getCor());
            System.out.println("Km rodados: " + carro.getKmRodados());
            System.out.println("Velocidade maxima: " + carro.getVelocidadeMaxima());
        }

        System.out.println("--------------------------- ");
    }

}
