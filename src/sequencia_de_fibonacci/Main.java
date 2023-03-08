package sequencia_de_fibonacci;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int sum;
		for(int i = 0; i < 10; i++) {
		System.out.println("Resultado -> " + a);
			sum = a;
			a = a + b;
			b = sum;
		}
		 if(b == 10) {
			 System.out.println("O numero pertence á sequência Fibonacci");
		 }else {
			 System.out.println("O numero não pertence á sequência Fibonacci");
		 }

	}

}
