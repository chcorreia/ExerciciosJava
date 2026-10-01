import java.util.Scanner;

public class Prog02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura;
        int contador = 0, contadorAltos = 0;
        double soma = 0, somaAltos = 0;
        String mais;
        do {
            // perguntar a altura
            System.out.print("Digite a altura: ");
            altura = entrada.nextDouble();
            soma += altura; // acumula o total
            contador++; // conta quantos

            // média dos altos
            if(altura > 1.8){
                contadorAltos++;
                somaAltos += altura;
            }

            // perguntar se tem mais
            System.out.print("Tem mais (S/N)? ");
            mais = entrada.next();
            // repetir enquanto tem mais
        }while(mais.equalsIgnoreCase("s"));

        // no final dizer a média de alturas
        double media = soma / contador;
        System.out.printf("\nA média de %d pessoas é %.2fm\n",
                contador, media);

        if(contadorAltos > 0) {
            double mediaAlto = somaAltos / contadorAltos;
            System.out.printf("\nA média de %d pessoas altas é %.2fm\n",
                    contadorAltos, mediaAlto);
        }
    }
}
