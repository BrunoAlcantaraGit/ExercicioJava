import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReajustesSalario reajustesSalario = new ReajustesSalario();
            
         /*Esse programa tem como finalidade coletar informações   de 4 colaboradores, e aplicar a regra de negocio onde
        * aplica aumento progressivo de acordo com a faixa salaria.
        * retorna o metodo toString informando os nomes informados, os salario atual, e o salario com reajuste.
        * */

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
