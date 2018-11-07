public class GerenciarPedidos {

    private ListaDelivery lista = new ListaDelivery();

    public GerenciarPedidos() {
    }

    public void adicionarPedido(Cliente c) {
        this.lista.addicionarPedido(c, this.lista.size());
    }

    public String buscar(String nome, long telefone) {
        return String.valueOf(this.lista.buscarPedido(nome,telefone));
    }

    public String cancelarPedido(String nome, long telefone) {
        String pedidoSolicitado = this.lista.removerPedido(nome, telefone);
        return pedidoSolicitado;
    }

    public void imprimirPedidos() {
        this.lista.imprimirPedidos();
    }

}
