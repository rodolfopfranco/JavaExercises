import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Criptografia_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticao = Integer.parseInt(sc.nextLine());
        String texto;
        while (repeticao > 0){
            texto = sc.nextLine();
            System.out.println(criptografador(texto));
            repeticao--;
        }
    }

    private static String criptografador(String texto){
        //Soma
        byte[] bytesTexto = texto.getBytes(StandardCharsets.US_ASCII);
        for (int i =0; i < bytesTexto.length; i++){
            if ((bytesTexto[i] > 64 && bytesTexto[i] < 91) || (bytesTexto[i] > 96 && bytesTexto[i] < 122)) {
                bytesTexto[i]+=3;
            }
        }
        //Inverte
        StringBuilder textoCriptografado = new StringBuilder(new String(bytesTexto));
        textoCriptografado.reverse();
        //Subtrai
        bytesTexto = textoCriptografado.toString().getBytes(StandardCharsets.US_ASCII);
        for (int i = bytesTexto.length/2; i < bytesTexto.length; i++){
            bytesTexto[i]-=1;
        }
        return new String(bytesTexto);
    }
}