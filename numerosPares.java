import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    int num = 0;
    int par = 0;
    int impar= 0;

    for (int i = 0; i < 10; i++) {

      System.out.println("De o " + (i + 1) + "o numero entre 0 e 100: ");
      num = read.nextInt();

      num = ((num % 2) == 0) ? par++ : impar++;
    }

    System.out.println("Foram inseridos " + par+ " numeros pares.");
  }
}
