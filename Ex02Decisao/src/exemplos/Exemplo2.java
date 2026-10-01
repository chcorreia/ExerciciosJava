/*-------------------------------------------------------------------
    Exemplo 2: Segredo das preguiças
    - perguntar se o usuário quer ouvir um segredo
    - mostrar o segredo quando a resposta for S ou s

    PERGUNTA:
    - o que significa o sinal || na comparação entre os
      parênteses do if na linha 21? (resposta == 'S' || resposta == 's')
-------------------------------------------------------------------*/
package exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quer ouvir um segredo? (S/N): ");
        char resposta = scanner.next().charAt(0);

        // Aceita tanto a letra maiúscula quanto a minúscula.
        if (resposta == 'S' || resposta == 's') {
            System.out.println("Preguiças podem prender a respiração por cerca de 40 minutos");
        }

        scanner.close();
    }
}
