public class App {
    public static void main(String[] args) throws Exception {
        
        // Construtor com parâmetros
        Veiculo veiculo1 = new Veiculo(1969, "Mustang");
        System.out.println(veiculo1.getAno() + " " + veiculo1.getModelo());

        // Construtor sem parâmetros
        Veiculo veiculo2 = new Veiculo();
        veiculo2.setAno(1969);
        veiculo2.setModelo("Mustang");
        System.out.println(veiculo2.getAno() + " " + veiculo2.getModelo());

    }
}
