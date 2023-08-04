import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (final ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
			
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm <= parametroDois) { 
            throw new ParametrosInvalidosException();
        }
        

		int contagem = parametroDois - parametroUm;
		if(parametroUm> parametroDois) {
            System.out.println(contagem);
        }
	}
}