public class IMC {

	public static void main(String[] args) {
		String name ="Lucas Alves P.";
		double peso = 80.2;
		double altura = 1.66;
		double imc;
		imc =  peso / (altura*altura);
		
		System.out.println("Nome  do  Aluno: "+name);
		System.out.println("Altura do Aluno: "+altura);
		System.out.println("Peso  do  Aluno: "+peso);
		System.out.println("IMC   do  Aluno: "+imc);
		if(imc<17){
			System.out.println("Você está muito abaixo do peso");
		}else if(imc<18.49){
			System.out.println("Você tem Peso Mortifero");
		}

	}
}