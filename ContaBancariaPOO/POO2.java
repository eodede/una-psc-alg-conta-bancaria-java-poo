import java.util.Scanner;
import java.util.Random;

public class POO2 {
    private String nomeP;
    private int numC;
    private Double saldoI;
    private int escolha;
    private Double dep;
    private Double sac;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public POO2(){}

    public void NomePessoa(){
        System.out.print("Digite o Nome: ");
        nomeP = scanner.nextLine();
    }

    public void NumeroConta(){
        System.out.print("Digite o Número da Conta: ");
        numC = scanner.nextInt();
    }

    public void SaldoInicial(){
        System.out.print("Digite o Saldo Inicial: ");
        saldoI = scanner.nextDouble();

        System.out.println("Conta bancária criada com sucesso.");
        System.out.println();
    }

    public void Escolha(){

        System.out.println("Escolha qual ação gostaria de fazer: ");
        System.out.println("(1) Obter o saldo dísponivel");
        System.out.println("(2) Depositar valor");
        System.out.println("(3) Sacar valor");
        escolha = scanner.nextInt();

        if (escolha == 1){
        System.out.print("Saldo Disponivel:R$ " + random.nextInt(10000));}
        
        else if (escolha == 2){
        System.out.print("Deposito:R$ ");}
        dep = scanner.nextDouble();
        
        while(true){
        if (escolha == 3){
        System.out.print("Qual o valor que deseja sacar:R$ ");}
        sac = scanner.nextDouble();

        if (sac > random.nextInt(100000)){
            System.out.println("Saldo insuficiente para realizar a operação.");}
        else if(sac > 5.000){
            System.out.println("Valor do saque acima do permitido.");}
        else{break;}}
}
}