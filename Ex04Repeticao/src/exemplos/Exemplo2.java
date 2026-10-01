/*------------------------------------------------------------------------------------------
  Ex 3.2: repetição com o comando DO...WHILE

  PERGUNTAS:
  - compare este programa com o Exemplo1, que usa o comando WHILE.
    Quais são as diferenças entre os dois programas?
  - por que aqui existe uma única instrução que lê a variável "resposta"?
    Essa instrução é executada novamente a cada repetição?
  - por que neste programa a história é contada pelo menos uma vez?
    experimente digitar "n" na primeira pergunta e veja o que acontece.
------------------------------------------------------------------------------------------*/
package exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char resposta;

        do {
            System.out.println("Era uma vez um gato xadrez.");
            System.out.println("Quer que eu conte outra vez? (s/n)");
            resposta = teclado.next().charAt(0);
        } while (resposta == 's' || resposta == 'S');

        teclado.close();
    }
}
