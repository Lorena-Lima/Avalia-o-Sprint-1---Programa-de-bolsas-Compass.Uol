import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class validacaoUsuario {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();

        Calendar calendario = Calendar.getInstance();
        int momentoSistema = calendario.get(Calendar.HOUR_OF_DAY);

        Scanner scanner = new Scanner(System.in);

        String usuario = "lorena-pereira";
        int senha = 1234;

        System.out.println("Olá! Digite o login:");
        String usuario2 = scanner.nextLine();
        System.out.println("digite sua senha:");
        int senha2 = scanner.nextInt();

        if(usuario.equals(usuario2) && senha==senha2){
            if(momentoSistema >= 6 && momentoSistema < 12){
                System.out.println("Bom dia, você se logou ao nosso sistema às " + localTime + "h!");
            }if(momentoSistema >= 12 && momentoSistema < 18){
                System.out.println("Boa tarde, você se logou ao nosso sistema às " + localTime + "h! ");
            }if(momentoSistema >= 18 && momentoSistema < 24){
                System.out.println("Boa noite, você se logou ao nosso sistema às " + localTime + "h!");
            }if(momentoSistema >= 0 && momentoSistema < 6){
                System.out.println("Boa madrugada, você se logou ao nosso sistema às " + localTime + "h!");
            }
        }else {
            System.out.println("usuario ou senha incorretos!");
        }
    }
}
