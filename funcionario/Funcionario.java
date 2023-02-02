package entities;

public class Funcionario {

    public String name;
    public double salarioLiquido;
    public double taxa;

    public double salarioLiquido() {
        return  salarioLiquido - taxa;
    }

    public void porcentagemSalario (double porcentagem) {
        this.salarioLiquido += salarioLiquido * (porcentagem / 100);
    }

    public String toString() {
        return "Funcionario: "
                + name
                + ", $ "
                + String.format("%.2f" , salarioLiquido());
    }
}
