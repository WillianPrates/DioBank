import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Willian");
        cliente1.setCpf(00000000021);

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        cc.depositar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


            System.out.println("===== MENU ====");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Transferir");
            System.out.println("4. Extrato");
            System.out.println("5. Sair");


            int choice = sc.nextInt();
            double valor;
            switch (choice) {
                case 1:
                    System.out.println("Sacar Selecionado");
                    System.out.println("Digite um valor a ser sacado da conta corrent: ");
                    valor = sc.nextInt();
                    cc.sacar(valor);
                    break;

                case 2:
                    System.out.println("Depositar Selecionado");
                    System.out.println("Digite um valor a ser depositado da conta corrente: ");
                    valor = sc.nextInt();
                    cc.depositar(valor);
                    break;

                case 3:
                    System.out.println("Transferir Selecionado");
                    System.out.println("1. Conta corrente para poupança: ");
                    System.out.println("2. Conta poupança para corrente: ");
                    System.out.println("3. Sair");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Transferir para poupança selecionado");
                            System.out.println("Digite um valor a ser depositado da conta corrente: ");
                            valor = sc.nextInt();
                            cc.transferir(valor, cp);
                            break;

                        case 2:
                            System.out.println("Transferir para corrente selecionado");
                            System.out.println("Digite um valor a ser depositado da conta corrente: ");
                            valor = sc.nextInt();
                            cp.transferir(valor, cc);
                            break;

                        case 3:
                            break;

                    }
                case 4:
                    System.out.println("Extrato Selecionado");
                    System.out.println("1. Extrato corrente: ");
                    System.out.println("2. Extrato poupança: ");
                    System.out.println("3. Sair");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Extrato corrente");
                            cc.imprimirExtrato();
                            break;
                        case 2:
                            System.out.println("Transferir para corrente selecionado");
                            cp.imprimirExtrato();
                            break;

                        case 3:
                            break;
                        default:
                            System.out.println("Escolha um numero valido!");
                    }
                default:
                    System.out.println("Escolha um numero valido!");
                    break;
            }

    }


}
