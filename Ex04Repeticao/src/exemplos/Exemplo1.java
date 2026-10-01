/*------------------------------------------------------------------------------------------
  Ex 3.1: repetição com o comando WHILE

  PERGUNTAS:
  - por que o programa lê a variável "resposta" duas vezes? 
    (uma antes do while e outra dentro do while)
  - por que na segunda vez que ele lê a variável "resposta" 
    não tem a palavra "char" antes do nome da variável?
  - se você responder "n" na primeira pergunta, o que acontece? Por que?
------------------------------------------------------------------------------------------*/
package exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quer que eu conte uma estória (s/n)");
        char resposta = teclado.next().charAt(0);

        // repetição WHILE{...} -- pode executar zero ou mais vezes
        while (resposta == 's' || resposta == 'S') {
            System.out.println("Era uma vez um gato xadrez.");
            System.out.println("Quer que eu conte outra vez? (s/n)");
            resposta = teclado.next().charAt(0);
        }
        
    }
}