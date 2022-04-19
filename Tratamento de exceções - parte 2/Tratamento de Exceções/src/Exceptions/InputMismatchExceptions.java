package Exceptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputMismatchExceptions {
    public static void main(String[] args) throws Exception {  
        // Permitir a leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de seu nascimento: ");
        int anoNascimento = scanner.nextInt(); // digitar uma letra

        System.out.print("Digite o ID de colaborador da sua empresa: ");
        int id = scanner.nextInt(); // digitar um número real

        // Fechar a leitura de dados do usuário
        scanner.close();
    }
}
