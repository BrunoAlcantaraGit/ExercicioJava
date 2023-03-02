import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReajustesSalario reajustesSalario = new ReajustesSalario();


        for (int i = 0; i < 4; i++) {

            System.out.println("Infor o nome do Colaborador");
            reajustesSalario.setNome(scanner.nextLine());
            reajustesSalario.addNome(i, reajustesSalario.getNome());

            System.out.println("Informe o Salario atual do Colaborador");
            reajustesSalario.setSalarioAtual(scanner.nextDouble());
            scanner.nextLine();
            reajustesSalario.addSalarioAtual(i, reajustesSalario.getSalarioAtual());

            reajustesSalario.AumentoProgressivoSalario();
            reajustesSalario.addSalariosReajustados(i, reajustesSalario.getSalarioComAumento());
            reajustesSalario.addDifalValor(i, reajustesSalario.getValorDifal());
        }

        System.out.println(reajustesSalario);

    }
}