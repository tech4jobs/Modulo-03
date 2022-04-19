package Exceptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NullPointerExceptions {
    public static void main(String[] args) throws Exception {  
        // Definir uma lista nula
        List<String> minhaLista = null;
        // Solicitar a quantidade de itens da lista
        minhaLista.size();
        
        // Definir um vetor nulo
        int[] numeros = null;
        // Acessar o indice 3 do vetor
        System.out.println( numeros[3] );
    }
}
