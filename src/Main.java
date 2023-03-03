import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        Soma soma = new Soma ();
        Subtracao subtracao = new Subtracao();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu.Menu();
        for(int opcao = scanner.nextInt(); opcao != 5; opcao = scanner.nextInt()){
            if(opcao == 1){
                System.out.println("informe o primeiro valor  a ser somado");
              soma.setValorSom1(scanner.nextLong());
                scanner.nextLine();
                System.out.println("informe o segundo valor ");
               soma.setValorSom2(scanner.nextLong());
                scanner.nextLine();
                soma.somar(opcao);
                soma.imprimiResultado();
                menu.opcao();


            } else if(opcao == 2){
                System.out.println(" informe o primeoro valor a ser multiplicado");
                multiplicacao.setValorM1(scanner.nextLong());
                scanner.nextLine();
                System.out.println("informe o segundo valor");
                multiplicacao.setValorM2(scanner.nextLong());
                scanner.nextLine();
                multiplicacao.multiplicar(opcao);
                multiplicacao.imprimiResultado();
                menu.opcao();

            }else if (opcao == 3){
                System.out.println("informe o valor do primeiro número a ser dividio");
                divisao.setValorDiv1(scanner.nextLong());
                scanner.nextLine();
                System.out.println("informe o segundo valor");
                divisao.setValorDiv2(scanner.nextLong());
                scanner.nextLine();
                divisao.dividir(opcao);
                divisao.imprimiResultado();
                menu.opcao();

            }else if (opcao == 4 ){
                System.out.println("informe o valor a ser subtraido");
                subtracao.setValorSub1(scanner.nextLong());
                scanner.nextLine();
                System.out.println("infome o segundo valor");
                subtracao.setValorSub2(scanner.nextLong());
                scanner.nextLine();
                subtracao.subitrair(opcao);
                subtracao.imprimiResultado();
                menu.opcao();

              }else {
                System.out.println("Opção inválida");
            }

        }

    }
}