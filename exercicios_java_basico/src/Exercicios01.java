import java.util.Scanner;

/* Escreva um código que receba o nome e o ano de nascimento de alguém
*  e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
* */

public class Exercicios01 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var anoAtual = 2026;
        System.out.println("Digite seu nome: ");
        var nome =  input.next();
        System.out.println("Digite seu ano de nascimento: ");
        var anoDeNascimento = input.nextInt();
        var idade = anoAtual - anoDeNascimento;

        System.out.printf("Olá %s você tem %s anos", nome, idade);
    }
}