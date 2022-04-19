package Exceptions;

public class ArithmeticExceptions {
    public static void main(String[] args) throws Exception {     
      // Dividisão por zero
      int valor1 = 10;
      int valor2 = 0;
      System.out.println(valor1/valor2);
 
      // Podemos lançar exceções lançar uma exceção por conta própria
      if (valor1  > valor2){
        throw new ArithmeticException("O valor 1 não pode ser maior que o valor 2");
      }      

      // Podemos lançar exceções lançar uma exceção por conta própria
      if (valor1 >= 0){
        throw new ArithmeticException("O valor 1 não pode ser igual a 0 e nem positivo");
      }  
    }
}
