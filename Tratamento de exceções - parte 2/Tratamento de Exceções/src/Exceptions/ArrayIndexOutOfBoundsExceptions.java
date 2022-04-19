package Exceptions;
import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutOfBoundsExceptions {
    public static void main(String[] args) throws Exception {       
        // Primeiro definimos nosso arrayList com 5 posições
        List<String> minhaLista = new ArrayList<String>();
        minhaLista.add("Valor 001");
        minhaLista.add("Valor 002");
        minhaLista.add("Valor 003");

        // Vamos tentar acessar a posição -1 do 'minhaLista'.
        minhaLista.get(-1);

        // Vamos tentar acessar a posição 3 do 'minhaLista'.
        minhaLista.get(3);

        // Vamos tentar acessar a posição 3 do 'minhaLista'.
        minhaLista.get(5);
    }
}
