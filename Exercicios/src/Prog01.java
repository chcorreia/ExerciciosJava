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
        do{
            System.out.print("Digite qualquer palavra: ");
            texto = leitura.next();
            voltas++; // soma mais 1 em voltas
        }while(!texto.equalsIgnoreCase("banana"));
        System.out.print("Você tentou "+voltas+" vezes\n");
    }
}
