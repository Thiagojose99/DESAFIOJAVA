
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            if (parametroUm < parametroDois) {
                contar(parametroUm, parametroDois);
            } else {
                throw new ParametrosInvalidosException();
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parâmetro tem que ser menor que o segundo.");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        for (int contagem = parametroUm; contagem <= parametroDois; contagem++) {
            System.out.println("Imprimindo: " + contagem);
        }
    }
}

// Criar essa classe para exceção personalizada
class ParametrosInvalidosException extends Exception {
}