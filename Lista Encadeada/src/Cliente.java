public class Cliente {

    private String nome;
    private String endereco;
    private long telefone;
    private String pedido;

    public Cliente(String nome, String endereco, long telefone, String pedido) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.pedido = pedido;
    }

    public String imprime() {
        return this.nome + " | " + this.endereco + " | " + this.telefone + " | " + this.pedido;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return this.telefone;
    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getPedido() {
        return pedido;
    }
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
