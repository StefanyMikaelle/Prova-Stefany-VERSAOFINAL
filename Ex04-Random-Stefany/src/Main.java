import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//inst�ncia um objeto da classe Random usando o construtor padr�o
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um numero inteiro:");

		int numero = sc.nextInt();
        //imprime sequ�ncia de 10 n�meros inteiros aleat�rios
		
		int min = 1;
		int max = 10;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
		System.out.println(value);
		
        if (numero == value) {
    		System.out.println("Acertou!");
    	}else System.out.println("Errou: digite novamente!");
        sc.close();
	}

}
