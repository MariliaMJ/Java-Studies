import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    int notaUm, notaDois, notaTres, media;

    for(int i=1; i < 21; i++){
      System.out.println("De as 3 notas do " + (i) +"o aluno: \n");
      notaUm = read.nextInt();
      notaDois = read.nextInt();
      notaTres = read.nextInt();
      char conceito = 'X';

      media = (notaUm + notaDois + notaTres)/3;

      if(media >= 8 && media<=10)
        conceito = 'A';
      else if (media>=7 && media<8)
        conceito = 'B';
      else if (media>=5 && media<7)
        conceito = 'C';
      else if(media>=4 && media<5)
        conceito = 'D';
      else if(media>=0 && media<4)
        conceito = 'E';


      System.out.println("A média " + (i) + " é : " + media + " e o conceito é: " + conceito);

    }
  }
}
