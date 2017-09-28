import java.util.Scanner;
import java.lang.Math;


public class exercises {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double numberOne = 0, numberTwo = 0;
		String operation = "";
		int day = 0, time = 0, score = 0;
		double stock = 0;		
		
		System.out.println("Dê uma operação aritmética: ");
		operation = read.next();
		
		System.out.println("Dê um número para a operação: ");
		numberOne = read.nextDouble();
		
		System.out.println("Dê outro número para a operação: ");
		numberTwo = read.nextDouble();
		
		operationType(numberOne, numberTwo, operation);
		
		System.out.println("Dê um dia: ");
		day = read.nextInt();
		
		dayType(day);
		
		System.out.println("Dê um capital de entrada: ");
		stock = read.nextDouble();
		
		System.out.println("Dê em quantos meses você pagou, a partir de janeiro: ");
		time = read.nextInt();
				
		billCalculation(stock, time);
		
		
		System.out.println("Dê uma nota: ");
		score = read.nextInt();
	
		studentConcept(score);		
		
	}
		
		public static void operationType(double numberOne, double numberTwo, String operation) {
						
			switch(operation) {
			
			case "+":
				System.out.println(numberOne + numberTwo);
				break;
			case "-":
				System.out.println(numberOne - numberTwo);
				break;
			case "*":
				System.out.println(numberOne * numberTwo);
				break;
			case "/":
				System.out.println(numberOne / numberTwo);
				break;
			case "%":
				System.out.println(numberOne % numberTwo);
				break;
			}
			
		}
		
		public static void dayType(int day) {
			
			
			switch(day) {
			
			case 1:
				System.out.println("É fim de Semana");
				break;
			case 2:
				System.out.println("É segunda, dia de semana");
				break;
			case 3:
				System.out.println("É terça, dia de semana");
				break;
			case 4:
				System.out.println("É Quarta, dia de semana");
				break;
			case 5:
				System.out.println("É quinta, dia de semana");
				break;
			case 6:
				System.out.println("É sexta, dia de semana");
				break;
			case 7:
				System.out.println("É fim de semana");
				break;	
			}
			
		}
		
		public static double billCalculation(double stock, int time) {
						
			double finalStock;
			
			finalStock = stock*math.pow(1+ 0,05, time);
			
			return(finalStock);
				
		}
		
		public static void studentConcept(int score) {
			
			switch(score) {
		
			case 0:
				System.out.println("Seu conceito é F");
				break;
			case 1:
				System.out.println("Seu conceito é F");
				break;
			case 2:
				System.out.println("Seu conceito é F");
				break;
			case 3:
				System.out.println("Seu conceito é F");
				break;
			case 4:
				System.out.println("Seu conceito é F");
				break;
			case 5:
				System.out.println("Seu conceito é E");
				break;
			case 6:
				System.out.println("Seu conceito é D");
				break;
			case 7:
				System.out.println("Seu conceito é C");
				break;
			case 8:
				System.out.println("Seu conceito é B");
				break;
			case 9:
				System.out.println("Seu conceito é A");
				break;
			case 10:
				System.out.println("Seu conceito é A");
				break;	
			}
			
		}
		
		
		
		

}