public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pessoa qualquer = new Pessoa();
        qualquer.setNome("Yuri Alberto");
        System.out.println(qualquer.getNome());

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(693);

        jogadora.setNome("Taissa");
        surfista.setNome("Maira");


        // Polimorfismo
        qualquer = new Esportista();
        jogadora = (Esportista) new Pessoa();
        ((Esportista) qualquer).setIdFederacao(567);
    }
}