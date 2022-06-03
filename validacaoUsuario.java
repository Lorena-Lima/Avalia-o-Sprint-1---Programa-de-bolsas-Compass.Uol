import java.time.LocalTime;
import java.util.Scanner;

public class validacaoUsuario {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        Scanner scanner = new Scanner(System.in);

        String usuario = "lorena-pereira";
        int senha = 1234;

        System.out.println("Digite o login");
        String usuario2 = scanner.nextLine();
        System.out.println("digite sua senha:");
        int senha2 = scanner.nextInt();

        if(usuario.equals(usuario2) && senha==senha2){
            System.out.println("bem-vindo!");
        }else {
            System.out.println("usuario ou senha incorretos!");
        }
    }
}
