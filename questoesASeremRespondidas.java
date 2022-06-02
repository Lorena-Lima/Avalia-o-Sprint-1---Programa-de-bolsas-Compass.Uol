import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;


public class questoesASeremRespondidas {
    public static void respostaCerta() {
        System.out.println("resposta certa!");
    }

    public static void respostaErrada() {
        System.out.println("Resposta errada");
    }

    public static void responda() {
        System.out.println("Responda 1, 2, 3 ou 4");
    }

    public static void abertura() {
        System.out.println("CURIOSIDADES DO MUNDO!");
    }

    public static void pulaLinha() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // variável de resposta (R1, R2 por exemplo) = scanner.nextInt();

        String[] questoes = new String[6];
        questoes[0] = "Qual foi o primeiro ano que teve copa do mundo ?";
        questoes[1] = "E qual foi o ano da primeira copa do mundo no Brasil ?";
        questoes[2] = "Qual foi o ano da primeira Olimpiada da era moderna ?";
        questoes[3] = "Sobre o mundo animal: por até quanto tempo uma  lesma pode se esconder em suas conchas?";
        questoes[4] = "Por até quantas horas os coalas podem dormir em um dia?";
        questoes[5] = "Qual é o maior animal do mundo?";

        String[] alternativas = new String[6];
        alternativas[0] = "1) 1950; 2)1994; 3)1930; 4)1920;";
        alternativas[1] = " 1) 1950; 2)1970; 3)2016; 4)1994;";
        alternativas[2] = "1) 1912; 2)1896; 3)2000; 4)1958;";
        alternativas[3] = "1) 5 dias; 2)3 anos; 3)80 dias; 4) 5 anos;";
        alternativas[4] = "1) 16h; 2)18h; 3)20h; 4)22h;";
        alternativas[5] = "1) Girafa; 2)anta; 3)Urso-polar; 4)Baleia-azul;";

        int acertos = 0;
        int erros = 0;

        System.out.println("Olá! Qual é o seu nome?");
        String nome = scanner.nextLine();
        questoesASeremRespondidas.pulaLinha();

        //00
        questoesASeremRespondidas.abertura();
        System.out.println(questoes[0]);
        questoesASeremRespondidas.responda();
        System.out.println(alternativas[0]);
        int resposta = scanner.nextInt();

        if (resposta == 3) {
            questoesASeremRespondidas.respostaCerta();
            acertos = acertos + 1;

        } else {
            questoesASeremRespondidas.respostaErrada();
            erros = erros + 1;
        }
        ///01

        questoesASeremRespondidas.pulaLinha();
        questoesASeremRespondidas.abertura();
        System.out.println(questoes[1]);
        questoesASeremRespondidas.responda();
        System.out.println(alternativas[1]);
        resposta = scanner.nextInt();

        if (resposta == 1) {
            questoesASeremRespondidas.respostaCerta();
            acertos = acertos + 1;

        } else {
            questoesASeremRespondidas.respostaErrada();
            erros = erros + 1;
        }
        ///2
        questoesASeremRespondidas.pulaLinha();
        questoesASeremRespondidas.abertura();
        System.out.println(questoes[2]);
        questoesASeremRespondidas.responda();
        System.out.println(alternativas[2]);
        resposta = scanner.nextInt();

        if (resposta == 2) {
            questoesASeremRespondidas.respostaCerta();
            acertos = acertos + 1;

        } else {
            questoesASeremRespondidas.respostaErrada();
            erros = erros + 1;
        }
        ///3
        questoesASeremRespondidas.pulaLinha();
        questoesASeremRespondidas.abertura();
        System.out.println(questoes[3]);
        questoesASeremRespondidas.responda();
        System.out.println(alternativas[3]);
        resposta = scanner.nextInt();

        if (resposta == 2) {
            questoesASeremRespondidas.respostaCerta();
            acertos = acertos + 1;

        } else {
            questoesASeremRespondidas.respostaErrada();
            erros = erros + 1;
        }
        ///4
        questoesASeremRespondidas.pulaLinha();
        questoesASeremRespondidas.abertura();
        System.out.println(questoes[4]);
        questoesASeremRespondidas.responda();
        System.out.println(alternativas[4]);
        resposta = scanner.nextInt();

        if (resposta == 4) {
            questoesASeremRespondidas.respostaCerta();
            acertos = acertos + 1;

        } else {
            questoesASeremRespondidas.respostaErrada();
            erros = erros + 1;
        }
        ///5
        questoesASeremRespondidas.pulaLinha();
        questoesASeremRespondidas.abertura();
        System.out.println(questoes[5]);
        questoesASeremRespondidas.responda();
        System.out.println(alternativas[5]);
        resposta = scanner.nextInt();

        if (resposta == 4) {
            questoesASeremRespondidas.respostaCerta();
            acertos = acertos + 1;

        } else {
            questoesASeremRespondidas.respostaErrada();
            erros = erros + 1;
        }

        questoesASeremRespondidas.pulaLinha();
        System.out.println(nome + ", sua pontuação é:");
        System.out.println("número de acertos: " + acertos);
        System.out.println("número de acertos: " + erros);
        if (acertos > erros) {
            System.out.println("**Parabens " + nome + "!!**");
        } else {
            System.out.println("Vai ser melhora da próxima!!");
        }
    }
}
