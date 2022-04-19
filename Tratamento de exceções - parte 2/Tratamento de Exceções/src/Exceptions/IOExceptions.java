package Exceptions;

import java.io.File;
import java.util.Scanner;

public class IOExceptions {
    public static void main(String[] args) throws Exception {  
        // Definir nome e diretório do arquvo
        File arquivo = new File("arquivo.txt"); 
        
        // Ler o conteúdo do arquivo
        Scanner conteudoArquivo = new Scanner(arquivo); 

        // Se houver próxima linha, imprimir conteúdo
        while (conteudoArquivo.hasNextLine()) {
            String data = conteudoArquivo.nextLine();
            System.out.println(data);
        }

        // Fechar a leitura do conteúdo do arquivo
        conteudoArquivo.close();
    }
}
