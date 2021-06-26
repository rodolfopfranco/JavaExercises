import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.abs;

/*

Você deve fazer a leitura de 5 valores inteiros.
Em seguida mostre quantos valores informados são pares,
quantos valores informados são ímpares,
quantos valores informados são positivos e quantos valores informados são negativos.

Você receberá 5 valores inteiros.

Exiba a mensagem conforme o exemplo de saída abaixo,
sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
 */
public class ParOuImpar {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int int1 = leitor.nextInt();
        int int2 = leitor.nextInt();
        int int3 = leitor.nextInt();
        int int4 = leitor.nextInt();
        int int5 = leitor.nextInt();

        List<Integer> inteiros = new ArrayList<>(Arrays.asList(int1,int2,int3,int4,int5));

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (Integer inteiro : inteiros) {
            if (abs(inteiro%2)==1){
                impares+=1;
            } else { pares +=1;}
            if (inteiro>0){
                positivos+=1;
            } else {
                if (inteiro<0){
                    negativos +=1;
                }
            }
        }

        System.out.println( pares + " valor(es) par(es)");
        System.out.println( impares + " valor(es) impar(es)");
        System.out.println( positivos + " valor(es) positivo(s)");
        System.out.println( negativos + " valor(es) negativo(s)");
    }

}