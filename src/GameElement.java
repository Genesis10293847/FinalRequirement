import java.awt.*;
import java.util.Objects;

public class GameElement {
    private String name;
    private Image symbol;
    private String losesTo;
    private String winsAgainst;


    public GameElement(String name, String losesTo, String winsAgainst){
        this.name = name;
        this.losesTo = losesTo;
        this.winsAgainst = winsAgainst;
    }

    public String getName(){
        return name;
    }

    public Image getSymbol(){
        return symbol;
    }

    public String getLosesTo(){
        return losesTo;
    }

    public String getWinsAgainst(){
        return winsAgainst;
    }


    public boolean isWin(GameElement opp){
        return Objects.equals(opp.getName(), winsAgainst);
    }



}
