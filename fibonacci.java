import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    int fibonacci = 0; // atual
    int ant = 0;       // anterior
    int n = 0;

    Scanner read = new Scanner(System.in);

    System.out.println("De a quantidade de numeros na sequencia: ");

    n = read.nextInt();

    for (int j = 1; j <= n; j++) {

      if (j == 1) {
        fibonacci = 1;
        ant = 0;
      } else {
        fibonacci += ant;
        ant = fibonacci - ant;

        System.out.print(fibonacci + " ");
      }

    }


  }

}
