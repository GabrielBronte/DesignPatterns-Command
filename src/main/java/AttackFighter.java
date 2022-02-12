public class AttackFighter  implements Training{
    private Fighter fighter;

    public AttackFighter(Fighter fighter){
        this.fighter = fighter;
    }

    public void run(){
        this.fighter.attack();
    }

    public void cancel(){
        this.fighter.defense();
    }
}