import java.io.IOException;
import java.util.Scanner;
/*
Leia um valor inteiro X.
Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.
A entrada será um valor inteiro positivo.
A saída será uma sequência de seis números ímpares.
 */
public class NumerosImpares {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

        while (cont < 6) {
            if (x%2 == 1) {
                System.out.println(x);
                cont += 1;
            }
            x++;
        }
    }

}