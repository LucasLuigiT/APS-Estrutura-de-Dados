public class FilaPedidos {

    public String[] fila;
    public int inicio;
    public int fim;
    public int quantidade;

    public FilaPedidos(int tamanho) {
        this.fila = new String[tamanho];
        this.inicio = this.fim = this.quantidade = 0;
    }

    public boolean isEmpty() {
        return this.quantidade == 0;
    }

    public boolean isFull() {
        return this.quantidade == this.fila.length;
    }

    public int size() {
        return this.quantidade;
    }

    public void inserir(String pedido) {
        if (!this.isFull()) {
            this.fila[this.fim] = pedido;
            ++this.quantidade;
            this.fim = (this.fim + 1) % this.fila.length;
        }
    }

    public String chamar() {
        if (!this.isEmpty()) {
            String aux = this.fila[this.inicio];
            this.inicio = (this.inicio + 1) % this.fila.length;
            --this.quantidade;
            return "O pedido: " + aux + " foi atendido!";
        } else {
            return "A fila está vazia!";
        }
    }

    public void imprime() {
        int i = 1;

        if (!isEmpty()) {
            for (int indice = this.inicio; i <= this.quantidade; indice = (indice + 1) % this.fila.length) {
                System.out.println("Cliente " + i + ": " + this.fila[indice]);
                ++i;
            }
        }
        else{
            System.out.println("A fila está vazia!");
        }
        System.out.println();
    }

}
