public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Código do Cliente: " + codigo);
    }
}