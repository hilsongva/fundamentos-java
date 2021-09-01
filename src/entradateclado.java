import java.util.Scanner;
import java.math.BigDecimal;

public class entradateclado {
    public static void main(String[] args) {
        Scanner leteclado = new Scanner(System.in);
        //exercício 1
        System.out.println("Digite o seu nome completo: ");
        String nome = leteclado.nextLine();
        //exercício 2
        System.out.println("Digite o número 1: ");
        double n1 = leteclado.nextDouble();
        System.out.println("Digite o número 2: ");
        double n2 = leteclado.nextDouble();
        double media = (n1 + n2)/2;
        // saída do exercício 1
        System.out.println("Olá "+nome);
        // saída do exercício 2
        System.out.println("Sua média é: "+media);
    }

}
