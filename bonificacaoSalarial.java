public class bonificacaoSalarial {
    public static void main(String[] args) {
        Funcionario lorena = new Funcionario();
        lorena.setName("Lorena Lima Pereira");
        lorena.setSalario(1200.00);
        System.out.println(lorena.getName());
        lorena.calculaSalario(1200);
        lorena.pulaLinha();

        Funcionario marcio = new Funcionario();
        marcio.setName("Marcio Rezende Pereira");
        marcio.setSalario(1000.00);
        System.out.println(marcio.getName());
        marcio.calculaSalario(1000);
        marcio.pulaLinha();

        Funcionario ana = new Funcionario();
        ana.setName("Ana Lima Pereira");
        ana.setSalario(2500.00);
        System.out.println(ana.getName());
        ana.calculaSalario(2500.00);
        ana.pulaLinha();




    }
}
