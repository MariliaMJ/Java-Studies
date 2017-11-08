import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    int media = 0;
    int maior = -1;
    int menor = 101;
    int num = 0;
    int soma=0;

    for (int i = 0; i < 20; i++){

      System.out.println("De o "+ (i+1)+ "o numero entre 0 e 100: ");
      num = read.nextInt();
      soma += num;
      media = soma/(i+1);

      maior = (num > maior) ? num : maior;

      menor = (num < menor) ? num : menor;
    }

    System.out.println("A média é: "+ media + "\nO Maior num é: " + maior + "\nO menor num é: " + menor);
  }
}
