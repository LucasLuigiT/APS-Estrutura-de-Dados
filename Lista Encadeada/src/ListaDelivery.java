public class ListaDelivery {

    private Node inicio;
    private Node fim;
    private int quantidade;

    public ListaDelivery() {
        this.inicio = this.fim = null;
        this.quantidade = 0;
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }

    public int size() {
        return this.quantidade;
    }

    public void addicionarPedido(Cliente pedido, int indice) {
        if (indice >= 0 && indice <= this.quantidade) {
            Node novo = new Node(pedido);
            if (indice == 0) {
                novo.proximo = this.inicio;
                this.inicio = novo;
                if (this.inicio.proximo == null) {
                    this.fim = novo;
                }
            } else if (this.quantidade == indice) {
                this.fim.proximo = novo;
                this.fim = novo;
            } else {
                Node aux = this.inicio;

                for(int i = 0; i < indice - 1; ++i) {
                    aux = aux.proximo;
                }

                novo.proximo = aux.proximo;
                aux.proximo = novo;
            }

            ++this.quantidade;
        }

    }

    public String removerPedido(String nome, long telefone) {
        if (!this.isEmpty()) {
            Node aux = this.inicio;

            while(aux != null) {
                if (this.inicio.pedido.getNome().equals(nome) && this.inicio.pedido.getTelefone() == telefone) {
                    this.inicio = this.inicio.proximo;
                    if (this.inicio == null) {
                        this.fim = null;
                    }

                    quantidade--;
                    aux = this.inicio;
                    return "Pedido cancelado.";
                }
                else {
                    if (aux.pedido.getNome().equals(nome) && this.inicio.pedido.getTelefone() == telefone) {
                        aux.proximo = aux.proximo.proximo;
                        if (aux.proximo == null) {
                            this.fim = aux;
                        }
                    }

                    quantidade--;
                    aux = aux.proximo;
                    return "---Pedido cancelado---";
                }
            }
        }

        return "A lista de pedidos está vazia.";
    }

    public String buscarPedido(String nome, long telefone) {
        if (this.inicio != null) {
            for(Node aux = this.inicio; aux != null; aux = aux.proximo) {
                if (nome.equals(aux.pedido.getNome()) && telefone == aux.pedido.getTelefone()) {
                    return aux.pedido.imprime();
                }
            }
        }

        return "Pedido não encontrado.";
    }

    public void imprimirPedidos() {
        Node aux = this.inicio;
        if (aux == null) {
            System.out.println("Não há pedidos.");
        } else {
            while(aux != null) {
                System.out.println(aux.pedido.imprime());
                System.out.println();
                aux = aux.proximo;
            }
        }

    }

}
