import java.util.Arrays;

public class ReajustesSalario {
private String nome = "";
private double salarioAtual = 0;
private double salarioComAumento = 0;
private  double valorDifal = 0;
private  int qtRgistro ;
private String [] Nomes = new String[4];
private double [] SalarioAtual = new double[4];
private double [] SalariosReajustados = new double[4];
private  double [] DifalValor = new double[4];

    public void AumentoProgressivoSalario(){
        if(this.salarioAtual < 150 ){
            this.salarioComAumento = salarioAtual *  0.25 + salarioAtual;
            this.valorDifal = salarioAtual * 0.25;
        }else if(this.salarioAtual >= 150 && this.salarioAtual < 300 ){
            this.salarioComAumento = salarioAtual *  0.20 + salarioAtual;
            this.valorDifal = salarioAtual * 0.20;
        }else if(this.salarioAtual >= 300 && this.salarioAtual < 600){
            this.salarioComAumento = salarioAtual *  0.15 + salarioAtual;
            this.valorDifal = salarioAtual * 0.15;
        }else if (this.salarioAtual >= 600){
            this.salarioComAumento = salarioAtual *  0.10 + salarioAtual;
            this.valorDifal = salarioAtual * 0.10;
        }
    }

    public void addNome (int indice, String nome) {
    this.Nomes[indice] = nome;
    }
    public void addSalarioAtual(int indice,double salarioAtual){
    this.SalarioAtual[indice] = salarioAtual;
    }
    public void addDifalValor(int indice,double DifalValor){
        this.DifalValor[indice] = DifalValor;
    }
    public void addSalariosReajustados(int indice,double SalariosReajustados){
        this.SalariosReajustados[indice] = SalariosReajustados;
    }
    public String[] getNomes() {
        return Nomes;
    }

    public void setSalarioComAumento(double salarioComAumento) {
        this.salarioComAumento = salarioComAumento;
    }

    public void setValorDifal(double valorDifal) {
        this.valorDifal = valorDifal;
    }

    public int getQtRgistro() {
        return qtRgistro;
    }

    public void setQtRgistro(int qtRgistro) {
        this.qtRgistro = qtRgistro;
    }

    public double getValorDifal() {
        return valorDifal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;

    }
    public double getSalarioComAumento() {
        return salarioComAumento;
    }

    public void setNomes(String[] nomes) {
        Nomes = nomes;
    }

    public void setSalarioAtual(double[] salarioAtual) {
        SalarioAtual = salarioAtual;
    }

    public double[] getSalariosReajustados() {
        return SalariosReajustados;
    }

    public void setSalariosReajustados(double[] salariosReajustados) {
        SalariosReajustados = salariosReajustados;
    }

    public double[] getDifalValor() {
        return DifalValor;
    }

    public void setDifalValor(double[] difalValor) {
        DifalValor = difalValor;
    }

    @Override
    public String toString() {
        return "ReajustesSalario{" +
                "Nomes=" + Arrays.toString(Nomes) +
                ", SalarioAtual=" + Arrays.toString(SalarioAtual) +
                ", SalariosReajustados=" + Arrays.toString(SalariosReajustados) +
                ", DifalValor=" + Arrays.toString(DifalValor) +
                '}';
    }
}
