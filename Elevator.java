import java.util.Scanner;
public class exercises {
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    int i,j;
    float soma = 0;
    float array[] = new float[15];
    for(i = 0; i <= 14; i++){
      System.out.println("insira o peso da pessoa:");
      array[i] = read.nextInt();
      soma = soma + array[i];
      System.out.println(soma);
      System.out.println(i);
      if(soma > 1500){
        System.out.println("Excedeu o peso limite");
        break;
      } else if( i == 14){
         System.out.println("Limite de pessoas atingido.");
         break;
        }
    }
  }
}

