import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

        public static void main(String args[]){

            Scanner entradaTexto = new Scanner(System.in);
            Scanner entradaInt = new Scanner(System.in);
            GerenciarPedidos gerente = new GerenciarPedidos();

            System.out.println("---MENU---");
            System.out.println("1. Adicionar pedido");
            System.out.println("2. Buscar pedido");
            System.out.println("3. Cancelar pedido");
            System.out.println("4. Imprimir pedidos");
            System.out.println("5. Finalizar programa");
            System.out.println("---------------------");
            int escolha;

            do{

                System.out.println();
                System.out.println("Insira sua escolha:");
                escolha = entradaInt.nextInt();
                System.out.println();

                switch (escolha) {
                    case 1:
                        System.out.println("Nome do cliente:");
                        String nome = entradaTexto.nextLine();
                        System.out.println("Endereço do cliente:");
                        String endereco = entradaTexto.nextLine();
                        System.out.println("Telefone:");
                        long tel = entradaInt.nextLong();
                        System.out.println("Pedido do cliente:");
                        String pedido = entradaTexto.nextLine();

                        Cliente c = new Cliente(nome,endereco,tel,pedido);
                        gerente.adicionarPedido(c);
                        System.out.println("---Pedido criado---");
                        break;

                    case 2:
                        System.out.println("Informe NOME e TELEFONE do cliente para busca:");
                        System.out.print("NOME:");
                        nome = entradaTexto.nextLine();
                        System.out.print("TELEFONE:");
                        tel = entradaInt.nextLong();
                        System.out.println(gerente.buscar(nome,tel));
                        break;

                    case 3:
                        System.out.println("Informe o NOME e TELEFONE do cliente para cancelar o pedido:");
                        System.out.print("NOME:");
                        nome = entradaTexto.nextLine();
                        System.out.print("TELEFONE:");
                        tel = entradaInt.nextLong();
                        System.out.println(gerente.cancelarPedido(nome,tel));
                        break;

                    case 4:
                        gerente.imprimirPedidos();
                        break;

                    case 5:
                        break;
                }
            } while(escolha != 5);

            System.out.println("********************");
            System.out.println("Programa finalizado.");



        }
}
