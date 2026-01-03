import java.util.Scanner;

/* Escreva um código que receba o tamanho do lado de um quadrado,
calcule sua área e exiba na tela
    fórmula: área=lado X lado
* */

public class Exercicios02 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado:");
        var lado =  input.nextInt();
        int area = lado * lado;

        System.out.printf("Area do quadrado é = %s", area);
    }
}