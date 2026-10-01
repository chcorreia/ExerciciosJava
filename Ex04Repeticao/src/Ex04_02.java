/*-------------------------------------------------------------------
    Ex 4.2: Elevador

    O elevador pode levar no máximo 5 pessoas ou 300 kg.
    Pergunte o peso de cada pessoa e informe quantas pessoas e quantos
    quilos já estão no elevador. Se a pessoa ultrapassar o limite de
    peso, ela não pode entrar. Repita enquanto houver lugar e pessoas
    na fila. Ao final, imprima "subindo com N pessoas e X kg".

    ATENÇÃO:
    - perceba que o professor já criou duas constantes
      para o limite de pessoas e peso

    PERGUNTAS:
    - que variáveis você precisa para controlar 
      o número de pessoas e o peso no elevador?
    - como você vai saber quando parar de ler os pesos das pessoas?
    - como você vai saber se a pessoa pode ou não entrar no elevador?
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex04_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // constantes para o limite de pessoas e peso
        final int MAX_PESSOAS = 5;
        final int MAX_PESO = 300;

        // escreva seu código aqui

        teclado.close();
    }
}