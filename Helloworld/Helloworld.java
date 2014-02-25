import java.util.Scanner;

public class Helloworld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome: ");
		nome = ler.next();
				
		System.out.println("Hello "+nome+ "!!");
	}

}