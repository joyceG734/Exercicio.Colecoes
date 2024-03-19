import java.util.Scanner;
import java.util.Stack;

public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = sc.next();

        palavra = palavra.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < palavra.length() / 2; i++){
            stack.push(palavra.charAt(i));
        }

        int verificacao = palavra.length() % 2 == 0 ? palavra.length() / 2 : palavra.length() / 2 + 1;
        for(int i = verificacao; i < palavra.length(); i++){
            if(palavra.charAt(i) != stack.pop()){
                System.out.println("Não é um palíndromo!!");
                return;
            }
        }
        System.out.println("É um palíndromo!!");
    }
}
