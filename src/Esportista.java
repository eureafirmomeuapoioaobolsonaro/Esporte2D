public class Esportista extends Pessoa {
    private int idFederacao;

    //Construtor


    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }
    // Getter e setter

    public int getIdFederacao() {
        return idFederacao;
    }

    public void setIdFederacao(int idFederacao) {
        this.idFederacao = idFederacao;

        // Metodo
        public String sacar(){
            return "sacando ...";
        }

    }
}
