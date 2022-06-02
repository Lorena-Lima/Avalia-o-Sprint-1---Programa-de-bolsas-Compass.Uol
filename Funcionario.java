public class Funcionario {
    String name;
    double salario;
    double bonus;
    double salarioLiquido;
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
    public void calculaSalario(double salario){
        if (salario <= 1000.00){
            this.salario = salario;
            bonus = salario * 0.2;
            salarioLiquido = salario * 1.2;
        }
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + bonus);
        System.out.println("Salário líquido: " + salarioLiquido);
    }



}


