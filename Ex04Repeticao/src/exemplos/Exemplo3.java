/*------------------------------------------------------------------------------------------
  Ex 3.3: repetição com o comando FOR

  PERGUNTAS:
  - compare este programa com o Exemplo1, que usa o comando WHILE, e com o
    Exemplo2, que usa o comando DO...WHILE. Quais são as diferenças entre
    os três programas?
  - como o comando FOR sabe quantas vezes deve repetir a história?
  - qual é a diferença entre repetir enquanto uma condição for verdadeira
    e repetir uma quantidade determinada de vezes?
  - o que significam as três partes dentro dos parênteses do FOR na linha 21?
------------------------------------------------------------------------------------------*/
package exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas vezes você quer que eu conte a estória? ");
        int quantidade = teclado.nextInt();

        for (int contador = 1; contador <= quantidade; contador++) {
            System.out.println("Era uma vez um gato xadrez.");
        }

        teclado.close();
    }
}
