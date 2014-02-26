public class pessoa {
	
	private String nome;
	private String sobrenome;
	private double altura;
	private String sexo;
	private int idade;
	private String corOlhos;
	private String corCabelos;
	
//-- Metodos Gets	
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCorOlhos() {
		return corOlhos;
	}
	
	public String getCorCabelos() {
		return corCabelos;
	}
	
	
//-- Metodos Gets
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
//-- Validação da altura.
	
	public void setAltura(double altura) throws Exception {
		
		if (altura > 1 && altura <=2.20){
			
			this.altura = altura;
			
		}else{
			
		throw new Exception ("Altura Invalida");
		}
	}
	
//-- Veridicação do dados lançados campo sexo.
		
	public void setSexo(String sexo) throws Exception {
		
		if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino") ||
			sexo.equalsIgnoreCase("F")|| sexo.equalsIgnoreCase("Feminino")){
		
			this.sexo=sexo;
	
		}else{
		
		throw new Exception ("Opção invalida. Digite Feminino ou (F)/ Masculino ou (M)");
		}
		
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	
	public void setCorCabelos(String corCabelos) {
		this.corCabelos = corCabelos;
	}

}