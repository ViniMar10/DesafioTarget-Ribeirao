import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args){
        String phrase;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        phrase = scan.nextLine();

        String phraseLowerCase = phrase.toLowerCase();
        int count = 0;

        for (char c : phraseLowerCase.toCharArray()){
            if (c == 'a'){
                count++;
            }
        }

        if(count == 0){
            System.out.println("A letra 'a' nao aparece na frase.");
        }
        if(count > 0){
            System.out.println("A letra 'a' aparece "+count+" vez(es) na frase.");
        }
        scan.close();
    }
}
