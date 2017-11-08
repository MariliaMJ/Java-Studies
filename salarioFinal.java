import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    double salario = 0;
    int anoInicio = 0;
    int anoAtual = 0;

    System.out.println("Insira o salario inicial, o ano inicial e o atual: ");
    salario = read.nextDouble();
    anoInicio = read.nextInt();
    anoAtual = read.nextInt();

    salario = salario * (0.15) + salario;

    for (int i = 2007; i <= anoAtual; i++) {
      salario = salario * (0.15 * 2) + salario;
    }
    System.out.println("O salario final, do ano de " + anoInicio + " a " + anoAtual + "\n é de: " + salario);
  }
}
