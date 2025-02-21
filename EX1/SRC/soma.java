import java.util.Scanner;

class Soma 
{ 
	// Scanner
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
    	
    	// Variables
    	int num1, num2, soma;
    	
    	// Reads
    	System.out.println("Digite um número");
    	num1 = sc.nextInt();
    	System.out.println("Digite outro número");
    	num2 = sc.nextInt();
    	
    	//Add
    	soma = num1 + num2;
    	
    	//Show on screen
    	System.out.println("Soma:" + soma);

    }
}
