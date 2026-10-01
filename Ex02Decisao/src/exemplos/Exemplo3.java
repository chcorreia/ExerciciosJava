/*-------------------------------------------------------------------
    Exemplo 3: Criança, adulto ou idoso
    - perguntar a idade do usuário
    - verificar se a idade está entre 18 e 59 anos

    PERGUNTA:
    - o que significam os caracteres && na expressão dentro dos
      parênteses do if na linha 20? (idade >= 18 && idade <= 59)

    DESAFIO:
    - e se você quisesse que o programa respondesse se é criança, 
      adulto ou idoso? Como você faria?
-------------------------------------------------------------------*/
package exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 59) {
            System.out.println("você não é nem criança nem idoso");
        }

        scanner.close();
    }
}
