import java.util.Scanner;

public class main {

  public static void main(String[] args) {
  
    Scanner read = new Scanner(System.in);

    System.out.println("De o numero para o fatorial: ");

    n = read.nextInt();
    int fat = n;

    for (int j = 1; j <= n; j++) {
      if (j == 1) {
        fat = 1;
      } else {
        fat = fat * j;
      }
    }
    System.out.print(fat + " ");
  }
}
