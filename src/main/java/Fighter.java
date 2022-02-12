public class Fighter {
    private String name;
    private String action;

    public Fighter(String nome){
        this.name = nome;
    }

    public String getAction(){
        return this.action;
    }

    public void attack(){
        this.action = "O lutador está treinando combinações de ataque.";
    }

    public void defense(){
        this.action = "O lutador está treinando suas esquivas.";
    }
}
