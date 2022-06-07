import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//instância um objeto da classe Random usando o construtor padrão
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um numero inteiro:");

		int numero = sc.nextInt();
        //imprime sequência de 10 números inteiros aleatórios
		
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
