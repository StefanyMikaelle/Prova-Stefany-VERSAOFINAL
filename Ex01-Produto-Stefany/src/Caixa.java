
public class Caixa  {
	/*Crie uma classe chamada “Caixa” com um método chamado: “calculaValorFinal”,
	que retorna um tipo double e recebe os seguintes parâmetros Produto e
	Quantidade, nesse método, multiplique o Valor contido no objeto Produto pela
	Quantidade.
	Se o produto for:
	• Tipo 1: Aplique 10% de desconto no valor final
	• Tipo 2: Aplique 20% de desconto no valor final
	• Tipo 3: Aplique 10% de desconto no valor final, se a quantidade for maior que
	5.*/
	
	public String produto;
	public int quantidade;
	
	public double calculaValorFinal(double valor, int tipo) {
		switch ( tipo ) {
		case 1:
		valor *= 0.9;
		break;
		case 2:
		valor *= 0.8;
		break;
		case 3:
			if (quantidade > 5) {
				valor *= 0.9;
			}
		break;
		default:
		System.out.println("Tipo invalido!");
		break;
		}
		return valor;
	}
}
