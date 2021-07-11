import java.io.IOException;
import java.util.Scanner;
/*
Leia quatro valores inteiros A, B, C e D.
Calcule e mostre a diferença do produto de A e B pelo produto de C e D
Segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class DiferencaEntreProdutos {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int a = leitor.nextInt();
            int b = leitor.nextInt();
            int c = leitor.nextInt();
            int d = leitor.nextInt();
            //complete o codigo
            System.out.println("DIFERENCA = "+(a*b-c*d));
        }
}
