public class Funcionario {
    String name;
    double salario;
    double bonus;
    double salarioLiquido;
    double desconto;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void escrevaBonus(){
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + bonus);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
    public void escrevaDesconto(){
        System.out.println("Salário: " + salario);
        System.out.println("Desconto: " + desconto);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
    public void pulaLinha(){
        System.out.println();
        System.out.println();
    }
    public void calculaSalario(double salario){
        if (salario <= 1000.00){
            this.salario = salario;
            bonus = salario * 0.2;
            salarioLiquido = salario * 1.2;
            escrevaBonus();
        }if(salario>1000 && salario<=2000){
            this.salario = salario;
            bonus = salario * 0.1;
            salarioLiquido = salario * 1.1;
            escrevaBonus();
        }if(salario>2000){
            this.salario = salario;
            desconto = salario * 0.1;
            salarioLiquido = salario * 0.9;
            escrevaDesconto();
        }
    }



}


