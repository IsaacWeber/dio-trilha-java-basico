public class IPhone implements ReprodutorMusical, Telefone, NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando.");
    }

    @Override
    public void atender() {
        System.out.println("Atendido.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
