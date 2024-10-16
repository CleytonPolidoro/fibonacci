import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> fiboList = new ArrayList<Integer>();
        System.out.print("Digite um número para saber se faz parte da sequência de Fibonacci: ");
        int x = sc.nextInt();


        for(int i = 0; fibonacci(i) <= x; i++){
            fiboList.add(fibonacci(i));
        }

        if (fiboList.contains(x)) {
            System.out.println("\nO número " + x + " pertence a sequência de fibonacci.");
        } else {
            System.out.println("\nO número " + x + " não pertence a sequência de fibonacci.");
        }


    }

    public static Integer fibonacci(int f){
        return f < 2 ? f : fibonacci(f-1) + fibonacci(f-2);
    }

}

