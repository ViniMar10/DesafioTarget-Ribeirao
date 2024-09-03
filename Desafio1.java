import java.util.Scanner;

public class Desafio1 {
    private static boolean isFibonacci(int num){
        int a = 0;
        int b = 1;
        while(b<num){
            int temp = b;
            b=a+b;
            a=temp;
        }

        return  b == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se ele faz parte da sequencia de fibonacci:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (isFibonacci(num)){
            System.out.println(num + " faz parte da sequencia de fibonacci.");
        }
        if(!isFibonacci(num)){
            System.out.println(num + " nao faz parte da sequencia de fibonacci");
        }
    }
}
