import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		pessoa Pessoa = new pessoa();
		
		System.out.println("Informe seu nome: ");
		String nome = ler.next();
		
		System.out.println("Informe seu Sobrenome: ");
		String sobrenome = ler.next();
		
		System.out.println("Entre com o Sexo: ");
		
		try{  
			String sexo = ler.next();
			Pessoa.setSexo(sexo);
		}catch (Exception e){
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println("Entre com a altura: ");
		
		try{
			double altura = ler.nextDouble();
			Pessoa.setAltura(altura);
		}catch (Exception e){
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println("Informe seu idade: ");
		int idade = ler.nextInt();
		
		System.out.println("Informe cor dos olhos: ");
		String corOlhos = ler.next();
		
		System.out.println("Informe cor cabelos: ");
		String corCabelos = ler.next();
		
		
		Pessoa.setNome(nome);
		Pessoa.setSobrenome(sobrenome);
		Pessoa.setIdade(idade);
		Pessoa.setCorCabelos(corCabelos);
		Pessoa.setCorOlhos(corOlhos);
		
		
		System.out.println("Dados Informados");
		System.out.println("________________");
		System.out.println("Nome: "+ Pessoa.getNome()+" "+Pessoa.getSobrenome());
		System.out.println("Idade: "+Pessoa.getIdade()+" anos");
		System.out.println("Altura: "+Pessoa.getAltura()+" m");
		System.out.println("Sexo: "+Pessoa.getSexo());
		System.out.println("Cor dos Olhos: "+Pessoa.getCorOlhos());
		System.out.println("Cor Cabelo: "+Pessoa.getCorCabelos());
	}

}