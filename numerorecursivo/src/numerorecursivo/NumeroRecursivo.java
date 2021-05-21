package numerorecursivo;

import java.util.Scanner;

public class NumeroRecursivo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o numero de casos");
		int numcasos = entrada.nextInt();
		
		for(int i = numcasos;i>0;i--) {
			
			System.out.println("Digite o valor de k ");
			int k = entrada.nextInt();
			System.out.println("Digite o valor de n ");
			int n = entrada.nextInt();
			System.out.println("saida-->"+RecursiveSum(k,n));
			
		}
	}
	
	public static int RecursiveSum(int k, int n) {
		
		int soma = 0;
		
		if(k==0) {
			
		return n;
			
		}else {
		
			for(int i = 1;i<=n;i++) {
				
				soma = soma+RecursiveSum(k-1,i); // recursivo pq vai executar novamente a função dentro da funçã
			
			}
		}		
		
	return soma;
		
		
		
		
	}

}
