public class App {
    public static void main(String[] args) throws Exception {
        
        // EXEMPLO DE ACESSO DIRETO A ATRIBUTOS PRIVADOS
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Gustavo"; // erro (o atributo não está visível para outras classes) 
        System.out.println(pessoa1.name); // erro (o atributo não está visível para outras classes) 
        
        // EXEMPLO DE ACESSO INTERMEDIADO POR MÉTODOS PÚBLICOS A ATRIBUTOS PRIVADOS
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setName("Gustavo");  // o método é público, está visível para outras classes, sendo assim eu consigo atualizar o atributo privado) 
        System.out.println(pessoa2.getName()); // o método é público, está visível para outras classes, sendo assim eu consigo acessar o atributo privado) 

    }
}
