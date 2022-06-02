public class bonificacaoSalarial {
    public static void main(String[] args) {
        Funcionario primeiro = new Funcionario();
        primeiro.setName("Lorena Lima Pereira");
        primeiro.setSalario(1000.00);
        System.out.println(primeiro.getName());
        primeiro.calculaSalario(1000);



        /*if(primeiro.salario<= 1000.00 ){
            primeiro.salario = primeiro.salario * 1.2;
            primeiro.bonus = primeiro.salario *
        }if( primeiro.salario< 2000.00 && primeiro.salario > 1000.00){
            primeiro.salario = primeiro.salario * 1.1;
        }if(primeiro.salario > 2000.00){
            primeiro.salario = primeiro.salario * 0.9;
        }*/



    }
}
