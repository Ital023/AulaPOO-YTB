public class Veiculo {

    private Long id;
    private String marca;
    private String modelo;
    private int anoDeFabricacao;

    public Veiculo() {
    }

    public Veiculo(Long id, String marca, String modelo, int anoDeFabricacao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void acelerar() {
        System.out.println("Acelerando o veiculo");
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
}
