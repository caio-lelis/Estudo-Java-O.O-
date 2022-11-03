import java.util.Scanner;
public class EstruturadeDecisãoSwitch {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número de 1 a 3");
		num = entrada.nextInt();
		entrada.close();
		switch(num ) {
		case 1:
			System.out.println("Você digitou 1");
			break;
		case 2:
			System.out.println("você digitou 2");
			break;
		case 3:
			System.out.println("você digitou 3");
			break;
		default:
			System.out.println("Você não digitou 1, 2 ou 3");
			break;
		}
	}

}
