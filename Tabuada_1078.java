import java.util.Scanner;

/*
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
1 x N = N      2 x N = 2N        ...       10 x N = 10N
 */
public class Tabuada_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i+" x "+numero+" = "+i*numero);
        }
    }
}
