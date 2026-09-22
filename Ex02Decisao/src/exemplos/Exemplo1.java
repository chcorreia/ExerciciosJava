/*-------------------------------------------------------------------
    Exemplo 1: Número par ou ímpar
    - informar um número inteiro
    - verificar se o número é par ou ímpar
    - mostrar o resultado da decisão

    PERGUNTA:
    - o que significa a comparação entre os
      parênteses do if na linha 24? (numero % 2 == 0)
-------------------------------------------------------------------*/
package exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        // Lê o número digitado pelo usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // O resto da divisão por 2 é zero quando o número é par.
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}
