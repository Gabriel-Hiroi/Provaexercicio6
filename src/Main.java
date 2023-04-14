public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel", "777.777.777-77");
        Cliente cliente = new Cliente("Gabriel (Cliente)", "777.777.777-77", 123);


        pessoa.imprimirDados();
        cliente.imprimirDados();
    }
}