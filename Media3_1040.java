import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media3_1040 {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        Double n1,n2,n3,n4,media,emexame,emexamefinal;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        media = ((n1*2)+(n2*3)+(n3*4)+(n4))/10;

        System.out.printf("Media: %.1f\n",media);

        if ( media > 7.0 ){
            System.out.printf("Aluno aprovado.\n");
        }
        else if (media >=6.9){
            //primeiro teste exige que não dê reprovado/aprovado
        }
        else if ( media < 5.0  ){
            System.out.printf("Aluno reprovado.\n");
        }
        else {
            System.out.printf("Aluno em exame.\n");
            Double exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame );
            Double mediaFinal = (exame + media)/2;
            if( mediaFinal  >= 5.0 ){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
            else{
                System.out.printf("Aluno reprovado\n");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
        }
        sc.close();
    }
}