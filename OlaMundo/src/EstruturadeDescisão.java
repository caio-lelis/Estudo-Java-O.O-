import java.util.Scanner;
public class EstruturadeDescisão {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número inteiro:");
		n1 = entrada.nextInt();
		System.out.println("Digite outro número inteiro:");
		n2 = entrada.nextInt();
		
		if (n1 > n2) {
			System.out.println(n1 + " é maior que" + n2);
			} else {
				if (n2 > n1)
					System.out.println(n2 + " é maior que " + n1);
				else 
				System.out.println("Os números são iguais");
			
			}
	}	
}
