public class DefenseFighter implements Training{
    private Fighter fighter;

    public DefenseFighter(Fighter fighter){
        this.fighter = fighter;
    }

    public void run(){
        this.fighter.defense();
    }

    public void cancel(){
        this.fighter.attack();
    }
}
