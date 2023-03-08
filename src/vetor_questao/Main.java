package vetor_questao;

public class Main {
	public static void main(String[] args) {
		double[] vetor = { 14.2, 70.1, 25.6, 19.5, 32.1, 25.3, 34.8, 29.5, 85, 40.3 };
		double menorValor = vetor[0];
		double maiorValor = vetor[0];
		double mediaMensal = 0.0;
		int diasComValorSuperior = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
			mediaMensal += vetor[i];
		}
		mediaMensal /= vetor.length;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > mediaMensal) {
				diasComValorSuperior++;
			}
		}
		System.out.println("Menor valor de faturamento ocorrido em um dia do mês: " + menorValor);
		System.out.println("Maior valor de faturamento ocorrido em um dia do mês: " + maiorValor);
		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "
				+ diasComValorSuperior);
	}
}
