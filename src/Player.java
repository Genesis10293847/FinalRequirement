public class Player {
    private int XP;
    private int accumulatedXP;
    private String booster;
    private int life;


    public Player(String booster){
        this.XP = 0;
        this.accumulatedXP = 0;
        this.booster = booster;
        this.life=3;
    }

    public int getAccumulatedXP() {
        return accumulatedXP;
    }

    public void setAccumulatedXP(int accumulatedXP) {
        this.accumulatedXP +=accumulatedXP;
    }

    public void setXP(int accumulatedXP){
        this.XP += accumulatedXP;
    }

    public int getXP() {
        return XP;
    }

    public int getLife() {
        return life;
    }

    public String getBooster() {
        return booster;
    }


    public boolean isAlive(){
        return life != 0;
    }

    public void getDamage(){
        life--;
    }
}


