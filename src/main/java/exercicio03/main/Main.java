package exercicio03.main;

import java.util.Scanner;

public class Main {
	// Para importar coisas novas no código basta importar ctrl + shift + o
	Scanner ler = new Scanner (System.in);

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		
		System.out.println("Digite uma idade: ");
		int idade;
		idade = ler.nextInt();
		
		
		if (idade > 20) {
		System.out.println("A idadade é maior que 20 anos.");			
		
		}else if (idade > 12 && idade < 17){
				
				System.out.println("A idade é esta entre 12 e 17");
				
			}else if (idade == 7 | idade < 5) {
				System.out.println("Idade igual a 7 ou menor que 5");
		
		}else {
			System.out.println("Outras combinações");
		}
		
	}

}
