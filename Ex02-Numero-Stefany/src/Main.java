import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite 10 numeros diferentes");
		int n = 10;
		int nMaior10 = 0;
		int nMaior50 = 0;
		int quantDig = 0;
		double[] vect = new double[n];
		double[] maior10 = new double[n];
		double[] maior50 = new double[n];
		double maiorNumero = 0.0;
		double menorNumero = 0.0;
		
		for (int i=0; i < n;  ) {
		vect[i] = sc.nextDouble();
		quantDig += 1;
			for (int j=0; j<quantDig; j++) {
				if (vect[i] != vect[quantDig]) {
					if(vect[i] > maiorNumero) {
						maiorNumero = vect[i];
					}else if (vect[i] < menorNumero) {
						menorNumero = vect[i];
					}else if (vect[i] > 10) {
						maior10[i] = vect[i];
						nMaior10 += 1;
					}else if (vect[i] > 50) {
						maior50[i] = vect[i];
						nMaior50 += 1;
					i++;
				}else {
					System.out.println("Numero repetido,digite novamente!");
				}
			}	
		}
		
		}
		System.out.println("****Numeros Digitados***");
		System.out.println("Todos os numeros :");
		for (int i=0; i < n; i++) {
			System.out.printf("%.2f",vect[i]);	
		}
		System.out.println("Maiores que 10 :");
		for (int i=0; i< nMaior10; i++) {
			System.out.printf(" %.2f ",vect[i]);	
		}
		System.out.println("Maiores que 50 :");
		for (int i=0; i< nMaior50; i++) {
			System.out.printf("%.2f",vect[i]);	
		}
	}
}
