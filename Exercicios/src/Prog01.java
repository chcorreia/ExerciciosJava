import java.util.Scanner;

/**
 * Exemplo de como contar
 */
public class Prog01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // pede pra digitar uma palavra várias vezes
        // só pára quando a pessoa responder "banana"
        String texto;
        int voltas = 0;
        do {
            voltas++; // soma mais 1 em voltas
            System.out.print("Digite uma palavra ("+ voltas + "ª chance): ");
            texto = leitura.next();
        } while ( (voltas < 3) && (!texto.equalsIgnoreCase("banana")) );

        if(texto.equalsIgnoreCase("banana")){
            System.out.println("Parabéns você acertou em "+voltas+" tentativas");
        } else {
            System.out.println("Você errou "+voltas+" vezes!");
        }
    }
}
