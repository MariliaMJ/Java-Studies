import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    int ano = 0;

    Scanner read = new Scanner(System.in);

    System.out.println("De um ano: ");

    ano = read.nextInt();

    if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
      System.out.print("O ano é bissexto.");
    else
      System.out.println("O ano NÃO é bissexto.");
  }
}
