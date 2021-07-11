import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ContarValoresEmOrdemCrescente {
    /*
    Ler vários números e em seguida dizer quantas vezes cada número aparece
    deve-se escrever cada um dos valores distintos que aparecem na entrada
    por ordem crescente de valor.

    A primeira linha de entrada contem um único inteiro N,
    que indica a quantidade de valores que serão lidos para X (1 ≤ N ≤ 2000) logo em seguida.
    Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

//declare as variaveis corretamente e continue a sua solução

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int vezes = sc.nextInt();
        while(numeros.size()<vezes)
            numeros.add(sc.nextInt());

        SortedMap<Integer, Integer> numerosOrdenados = new TreeMap<>();
        numeros.forEach(id -> numerosOrdenados.compute(id, (key,val) -> ( val == null ? 1 : val+1)));

        numerosOrdenados.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}
