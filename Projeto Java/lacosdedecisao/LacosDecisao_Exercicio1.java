package lacosdedecisao;
import java.util.Scanner;
public class LacosDecisao_Exercicio1 {

	public static void main(String[] args) {
		
		int num1,num2,num3,maiorNum;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero inteiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero inteiro: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero intero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3 || num1 == num2 && num2 > num3)
		{
			maiorNum = num1;
			System.out.print("O maior n�mero entre os 3 digitados �: " + maiorNum);
		}
		else if (num2 > num1 && num2 > num3 || num2 == num1 && num1 > num3) 
		{
			maiorNum = num2;
			System.out.print("O maior n�mero entre os 3 digitados �: " + maiorNum);
		}
		else if (num3 > num1 && num3 > num2 || num3 == num1 && num1 > num2)
		{
			maiorNum = num3;
			System.out.print("O maior n�mero entre os 3 digitados �: " + maiorNum);
		}
		else
		{
			System.out.print("Os n�meros digitados s�o iguais: " + num1);
		}
	    leia.close();
    }
}	
