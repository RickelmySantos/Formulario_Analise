package faturamento_mensal;

public class Main {
	public static void main(String[] args) {
		double total = 67.836 + 36.678 + 29.229 + 27.165 + 19.849;

		double percentagemSP = (67.836 / total) * 100;
		double percentagemRJ = (36.678 / total) * 100;
		double percentagemMG = (29.229 / total) * 100;
		double percentagemES = (27.165 / total) * 100;
		double percentagemOutros = (19.849 / total) * 100;

		System.out.println("SP = " + percentagemSP + "%");
		System.out.println("RJ = " + percentagemRJ + "%");
		System.out.println("MG = " + percentagemMG + "%");
		System.out.println("ES = " + percentagemES + "%");
		System.out.println("Outros = " + percentagemOutros + "%");
		
		// como não especifiou na questão com quantas casas decimais queria, eu deixei normal, caso falasse eu poderia usar o printf pra setar a quantidade de numoras apos a virgula
	}
}
