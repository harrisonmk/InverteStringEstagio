package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        String palavraInvertida = inverteString(palavra);
        
        
        System.out.println("Palavra invertida: " + palavraInvertida);
    }

    public static String inverteString(String palavra) {
        
        
        int tamanho = palavra.length();
        StringBuilder palavraInvertida = new StringBuilder(tamanho);

        for (int i = tamanho - 1; i >= 0; i--) {
            palavraInvertida.append(palavra.charAt(i));
        }

        return palavraInvertida.toString();
    }
}
