import java.util.Scanner;
public class Main {

    public static void main(String args[]){

        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        FilaPedidos fila = new FilaPedidos(10);

        System.out.println();
        System.out.println("CONTROLE DE FILA");
        System.out.println("1. Chamar");
        System.out.println("2. Inserir pedido");
        System.out.println("3. Visualizar pedidos");
        System.out.println("4. Finalizar atendimento");
        System.out.println("------------------------");

        System.out.println();
        int escolha;

        do{

            System.out.println("Escolha a ação:");
            escolha = entradaInt.nextInt();
            System.out.println();

            switch(escolha){
                case 1:

                    System.out.println(fila.chamar());
                    System.out.println();
                    break;

                case 2:

                    if (!fila.isFull()) {
                        System.out.println("Insira o pedido do cliente:");
                        String pedido = entradaTexto.nextLine();
                        fila.inserir(pedido);
                        System.out.println("O pedido: " + pedido + " | FOI INSERIDO.");
                        System.out.println();
                        break;
                    }
                    else{
                        System.out.println("------------------");
                        System.out.println("A fila está cheia!");
                        System.out.println("------------------");
                        System.out.println();
                        break;
                    }

                case 3:
                    fila.imprime();
                    break;

                case 4:
                    break;
            }

        } while(escolha != 4);

        System.out.println("***********************");
        System.out.println("Atendimento finalizado.");

    }

}
