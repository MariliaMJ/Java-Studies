import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    int base = 1;       
    int expoente = 0;


    Scanner read = new Scanner(System.in);

    System.out.println("De a base e expoente da potencia: ");

    base = read.nextInt();
    expoente = read.nextInt();

    int result = 1;

    for (int j = 0; j < expoente; j++) {
      if (expoente == 0) {
        result = 1;
      } else {
        result = result * base;
      }
    }
    System.out.print(result + " ");
  }
}
